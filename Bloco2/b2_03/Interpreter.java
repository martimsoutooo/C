import java.lang.Long;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Long> {

   @Override public Long visitProgram(CalculatorParser.ProgramContext ctx) {
      Long res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Long visitStat(CalculatorParser.StatContext ctx) {
      Long res = visit(ctx.expr());
      System.out.println(res);
      return res;
      //return res;
   }

   @Override public Long visitExprNeg(CalculatorParser.ExprNegContext ctx) {
      Long res = visit(ctx.expr());
      Long resl= Long.parseLong("-"+res);
      return resl;
   }

   @Override public Long visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Long num1 = visit(ctx.expr(0));
      Long num2 = visit(ctx.expr(1));
      char op = ctx.op.getText().charAt(0);
      return expression(num1, num2, op);
      
   }

   @Override public Long visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Long res = null;
      return visit(ctx.expr());
      
   }

   @Override public Long visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Long res = Long.parseLong(ctx.Integer().toString());
      return res;
   
   }

   @Override public Long visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Long num1 = visit(ctx.expr(0));
      Long num2 = visit(ctx.expr(1));
      char op = ctx.op.getText().charAt(0);
      return expression(num1, num2, op);
   }

   public Long expression(Long num1, Long num2, char op){
      Long res;
      switch (op) {
         case '+':
            res = num1 + num2;
            break;

         case '-':
            res = num1 - num2;
            break;

         case '*':
            res = num1 * num2;
            break;

         case '/':
            if (num2 == 0) {
               System.out.println("Error: Division by zero");
               res = null;
               break;
            }
            res = num1 / num2;
            break;
         case '%':
            res = num1 % num2;
            break;

         default:
            res = null;
            break;    
      }

      return res;

   }

}
