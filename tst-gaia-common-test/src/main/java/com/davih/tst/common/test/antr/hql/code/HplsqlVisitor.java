// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/hql/Hplsql.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.hql.code;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HplsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HplsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HplsqlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HplsqlParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(HplsqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt(HplsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_stmt_item(HplsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_select_cols(HplsqlParser.Cte_select_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_stmt_item(HplsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullselect_set_clause(HplsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(HplsqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_set(HplsqlParser.Select_list_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_limit(HplsqlParser.Select_list_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_item(HplsqlParser.Select_list_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#table_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_row(HplsqlParser.Table_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#into_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_clause(HplsqlParser.Into_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bulk_collect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_collect_clause(HplsqlParser.Bulk_collect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_clause(HplsqlParser.From_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_clause(HplsqlParser.From_table_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_clause(HplsqlParser.From_join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_join_type_clause(HplsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_clause(HplsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_table_values_row(HplsqlParser.From_table_values_rowContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(HplsqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(HplsqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#having_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving_clause(HplsqlParser.Having_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualify_clause(HplsqlParser.Qualify_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options(HplsqlParser.Select_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_options_item(HplsqlParser.Select_options_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_stmt(HplsqlParser.Describe_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#fresh_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFresh_stmt(HplsqlParser.Fresh_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype(HplsqlParser.DtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDtype_len(HplsqlParser.Dtype_lenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr(HplsqlParser.Bool_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_unary(HplsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_single_in(HplsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_multi_in(HplsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary(HplsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_logical_operator(HplsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expr_binary_operator(HplsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HplsqlParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_atom(HplsqlParser.Expr_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_interval(HplsqlParser.Expr_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#interval_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_item(HplsqlParser.Interval_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat(HplsqlParser.Expr_concatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concat_item(HplsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case(HplsqlParser.Expr_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_simple(HplsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_case_searched(HplsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_cursor_attribute(HplsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_all_distinct(HplsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_over_clause(HplsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_spec_func(HplsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func(HplsqlParser.Expr_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_dot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_dot(HplsqlParser.Expr_dotContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_dot_method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_dot_method_call(HplsqlParser.Expr_dot_method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_dot_property_access}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_dot_property_access(HplsqlParser.Expr_dot_property_accessContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_func_params(HplsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#func_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_param(HplsqlParser.Func_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#date_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_literal(HplsqlParser.Date_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestamp_literal(HplsqlParser.Timestamp_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(HplsqlParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#qident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQident(HplsqlParser.QidentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_quotedString(HplsqlParser.Single_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble_quotedString(HplsqlParser.Double_quotedStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#int_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_number(HplsqlParser.Int_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#dec_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec_number(HplsqlParser.Dec_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(HplsqlParser.Bool_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#null_const}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_const(HplsqlParser.Null_constContext ctx);
	/**
	 * Visit a parse tree produced by {@link HplsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_reserved_words(HplsqlParser.Non_reserved_wordsContext ctx);
}