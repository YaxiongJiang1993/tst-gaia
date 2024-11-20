// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/test/sql2/Sql.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.test.sql2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlParser}.
 */
public interface SqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SqlParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SqlParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(SqlParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(SqlParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(SqlParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(SqlParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTable(SqlParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTable(SqlParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SqlParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SqlParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SqlParser.FunctionCallContext ctx);
}