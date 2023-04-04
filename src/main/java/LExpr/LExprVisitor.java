// Generated from java-escape by ANTLR 4.11.1
package LExpr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(LExprParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link LExprParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(LExprParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LExprParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Neg}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeg(LExprParser.NegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(LExprParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(LExprParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LExprParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(LExprParser.MultDivContext ctx);
}