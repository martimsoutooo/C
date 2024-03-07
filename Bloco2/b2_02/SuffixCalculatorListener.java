// Generated from SuffixCalculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SuffixCalculatorParser}.
 */
public interface SuffixCalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SuffixCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SuffixCalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuffixCalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SuffixCalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SuffixCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(SuffixCalculatorParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SuffixCalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(SuffixCalculatorParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNumbe}
	 * labeled alternative in {@link SuffixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNumbe(SuffixCalculatorParser.ExprNumbeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNumbe}
	 * labeled alternative in {@link SuffixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNumbe(SuffixCalculatorParser.ExprNumbeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSuffix}
	 * labeled alternative in {@link SuffixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSuffix}
	 * labeled alternative in {@link SuffixCalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx);
}