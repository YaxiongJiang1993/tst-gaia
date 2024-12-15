// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/expr/Expr.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.expr.code;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddOrSub(ExprParser.AddOrSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddOrSub}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddOrSub(ExprParser.AddOrSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Single}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSingle(ExprParser.SingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Single}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSingle(ExprParser.SingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lieteral}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLieteral(ExprParser.LieteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lieteral}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLieteral(ExprParser.LieteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultiOrDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiOrDiv(ExprParser.MultiOrDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultiOrDiv}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiOrDiv(ExprParser.MultiOrDivContext ctx);
}