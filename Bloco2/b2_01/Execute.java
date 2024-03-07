@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override public String visitGreetings(HelloParser.GreetingsContext ctx) {
      String res = null;
      System.out.println("Ola " + ctx.ID());
      
      return visitChildren(ctx);
      //return res;
   }

   @Override public String visitGoodbye(HelloParser.GoodbyeContext ctx) {
      String res = null;
      System.out.println("Chau " + ctx.ID());
      
      return visitChildren(ctx);
      //return res;
   }
}
