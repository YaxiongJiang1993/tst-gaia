// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/test/sql1/MySql.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.test.sql1.code;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(MySqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(MySqlParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStatement(MySqlParser.SelectStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(MySqlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(MySqlParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MySqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCondition(MySqlParser.SimpleConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(MySqlParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedCondition(MySqlParser.ParenthesizedConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCondition}
	 * labeled alternative in {@link MySqlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(MySqlParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MySqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MySqlParser.ValueContext ctx);
}