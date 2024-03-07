// Generated from Hello.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#phrase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPhrase(HelloParser.PhraseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#greetings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreetings(HelloParser.GreetingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#goodbye}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodbye(HelloParser.GoodbyeContext ctx);
}