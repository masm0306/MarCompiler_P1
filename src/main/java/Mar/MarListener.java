// Generated from java-escape by ANTLR 4.11.1
package Mar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MarParser}.
 */
public interface MarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(MarParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(MarParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MarParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(MarParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link MarParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(MarParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNeg(MarParser.NegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNeg(MarParser.NegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(MarParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(MarParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(MarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(MarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(MarParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(MarParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNum(MarParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNum(MarParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(MarParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(MarParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(MarParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(MarParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(MarParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link MarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(MarParser.MultDivContext ctx);
}