// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/test/sql1/MySql.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.test.sql1.code;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySqlParser}.
 */
public interface MySqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MySqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MySqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(MySqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(MySqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(MySqlParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(MySqlParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(MySqlParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(MySqlParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(MySqlParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(MySqlParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(MySqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(MySqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(MySqlParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(MySqlParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCondition(MySqlParser.SimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCondition(MySqlParser.SimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(MySqlParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(MySqlParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedCondition(MySqlParser.ParenthesizedConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedCondition(MySqlParser.ParenthesizedConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(MySqlParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(MySqlParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(MySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(MySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySqlParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MySqlParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySqlParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MySqlParser.ValueContext ctx);
}