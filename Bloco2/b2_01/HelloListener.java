// Generated from Hello.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(HelloParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(HelloParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void enterGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 */
	void exitGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#goodbye}.
	 * @param ctx the parse tree
	 */
	void enterGoodbye(HelloParser.GoodbyeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#goodbye}.
	 * @param ctx the parse tree
	 */
	void exitGoodbye(HelloParser.GoodbyeContext ctx);
}