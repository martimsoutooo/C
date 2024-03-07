import javax.print.DocFlavor.STRING;

@SuppressWarnings("CheckReturnValue")
public class Interpreter extends SuffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(SuffixCalculatorParser.StatContext ctx) {
      if (ctx.expr() == null) {
         return null;
      }
      Double res = visit(ctx.expr());
      System.out.println(res);
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitExprNumbe(SuffixCalculatorParser.ExprNumbeContext ctx) {
      visitChildren(ctx);
      Double res = Double.parseDouble(ctx.Number().getText());
      return res;
     
   }

   @Override public Double visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Double num1 = visit(ctx.expr(0));
      Double num2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      Double res = null;

      switch (op.charAt(0)) {
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
               break;
            }
            res = num1 / num2;
            break;

         default:
            System.out.println("Error: Invalid operator");
            break;
      }

      return res;
   }
}
