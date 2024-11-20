// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/test/sql2/Sql.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.test.sql2.gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(SqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SqlParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(SqlParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(SqlParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn(SqlParser.ColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SqlParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SqlParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SqlParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SqlParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(SqlParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SqlParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#partitionBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionBy(SqlParser.PartitionByContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlParser#orderBy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderBy(SqlParser.OrderByContext ctx);
}