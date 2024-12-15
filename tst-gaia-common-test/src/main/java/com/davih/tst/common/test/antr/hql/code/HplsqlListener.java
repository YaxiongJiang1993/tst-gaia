// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/hql/Hplsql.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.hql.code;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HplsqlParser}.
 */
public interface HplsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HplsqlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HplsqlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HplsqlParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HplsqlParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(HplsqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(HplsqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt(HplsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cte_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt(HplsqlParser.Cte_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_stmt_item(HplsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cte_select_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_stmt_item(HplsqlParser.Cte_select_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void enterCte_select_cols(HplsqlParser.Cte_select_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#cte_select_cols}.
	 * @param ctx the parse tree
	 */
	void exitCte_select_cols(HplsqlParser.Cte_select_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#fullselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt(HplsqlParser.Fullselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_stmt_item(HplsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#fullselect_stmt_item}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_stmt_item(HplsqlParser.Fullselect_stmt_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void enterFullselect_set_clause(HplsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#fullselect_set_clause}.
	 * @param ctx the parse tree
	 */
	void exitFullselect_set_clause(HplsqlParser.Fullselect_set_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#subselect_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSubselect_stmt(HplsqlParser.Subselect_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(HplsqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(HplsqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_set(HplsqlParser.Select_list_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_set}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_set(HplsqlParser.Select_list_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_limit(HplsqlParser.Select_list_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_limit}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_limit(HplsqlParser.Select_list_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_item(HplsqlParser.Select_list_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_item(HplsqlParser.Select_list_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_alias(HplsqlParser.Select_list_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_list_asterisk}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_asterisk(HplsqlParser.Select_list_asteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#table_row}.
	 * @param ctx the parse tree
	 */
	void enterTable_row(HplsqlParser.Table_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#table_row}.
	 * @param ctx the parse tree
	 */
	void exitTable_row(HplsqlParser.Table_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(HplsqlParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(HplsqlParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bulk_collect_clause}.
	 * @param ctx the parse tree
	 */
	void enterBulk_collect_clause(HplsqlParser.Bulk_collect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bulk_collect_clause}.
	 * @param ctx the parse tree
	 */
	void exitBulk_collect_clause(HplsqlParser.Bulk_collect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_clause(HplsqlParser.From_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_clause(HplsqlParser.From_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_clause(HplsqlParser.From_table_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_table_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_clause(HplsqlParser.From_table_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_table_name_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_name_clause(HplsqlParser.From_table_name_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_subselect_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_subselect_clause(HplsqlParser.From_subselect_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_clause(HplsqlParser.From_join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_join_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_clause(HplsqlParser.From_join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_join_type_clause(HplsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_join_type_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_join_type_clause(HplsqlParser.From_join_type_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_clause(HplsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_table_values_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_clause(HplsqlParser.From_table_values_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void enterFrom_table_values_row(HplsqlParser.From_table_values_rowContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_table_values_row}.
	 * @param ctx the parse tree
	 */
	void exitFrom_table_values_row(HplsqlParser.From_table_values_rowContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#from_alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrom_alias_clause(HplsqlParser.From_alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(HplsqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(HplsqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(HplsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(HplsqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#group_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_clause(HplsqlParser.Group_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void enterHaving_clause(HplsqlParser.Having_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#having_clause}.
	 * @param ctx the parse tree
	 */
	void exitHaving_clause(HplsqlParser.Having_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void enterQualify_clause(HplsqlParser.Qualify_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#qualify_clause}.
	 * @param ctx the parse tree
	 */
	void exitQualify_clause(HplsqlParser.Qualify_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(HplsqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options(HplsqlParser.Select_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_options}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options(HplsqlParser.Select_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void enterSelect_options_item(HplsqlParser.Select_options_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#select_options_item}.
	 * @param ctx the parse tree
	 */
	void exitSelect_options_item(HplsqlParser.Select_options_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_stmt(HplsqlParser.Describe_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#describe_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_stmt(HplsqlParser.Describe_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#fresh_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFresh_stmt(HplsqlParser.Fresh_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#fresh_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFresh_stmt(HplsqlParser.Fresh_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void enterDtype(HplsqlParser.DtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#dtype}.
	 * @param ctx the parse tree
	 */
	void exitDtype(HplsqlParser.DtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void enterDtype_len(HplsqlParser.Dtype_lenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#dtype_len}.
	 * @param ctx the parse tree
	 */
	void exitDtype_len(HplsqlParser.Dtype_lenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(HplsqlParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(HplsqlParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_atom(HplsqlParser.Bool_expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_unary(HplsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_unary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_unary(HplsqlParser.Bool_expr_unaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_single_in(HplsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_single_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_single_in(HplsqlParser.Bool_expr_single_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_multi_in(HplsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_multi_in}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_multi_in(HplsqlParser.Bool_expr_multi_inContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary(HplsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_binary}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary(HplsqlParser.Bool_expr_binaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_logical_operator(HplsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_logical_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_logical_operator(HplsqlParser.Bool_expr_logical_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr_binary_operator(HplsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_expr_binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr_binary_operator(HplsqlParser.Bool_expr_binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HplsqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HplsqlParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void enterExpr_atom(HplsqlParser.Expr_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_atom}.
	 * @param ctx the parse tree
	 */
	void exitExpr_atom(HplsqlParser.Expr_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void enterExpr_interval(HplsqlParser.Expr_intervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_interval}.
	 * @param ctx the parse tree
	 */
	void exitExpr_interval(HplsqlParser.Expr_intervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void enterInterval_item(HplsqlParser.Interval_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#interval_item}.
	 * @param ctx the parse tree
	 */
	void exitInterval_item(HplsqlParser.Interval_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat(HplsqlParser.Expr_concatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_concat}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat(HplsqlParser.Expr_concatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concat_item(HplsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_concat_item}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concat_item(HplsqlParser.Expr_concat_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case(HplsqlParser.Expr_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_case}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case(HplsqlParser.Expr_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_simple(HplsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_case_simple}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_simple(HplsqlParser.Expr_case_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void enterExpr_case_searched(HplsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_case_searched}.
	 * @param ctx the parse tree
	 */
	void exitExpr_case_searched(HplsqlParser.Expr_case_searchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cursor_attribute(HplsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_cursor_attribute}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cursor_attribute(HplsqlParser.Expr_cursor_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_agg_window_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_agg_window_func(HplsqlParser.Expr_agg_window_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_all_distinct(HplsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func_all_distinct}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_all_distinct(HplsqlParser.Expr_func_all_distinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_over_clause(HplsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func_over_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_over_clause(HplsqlParser.Expr_func_over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func_partition_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_partition_by_clause(HplsqlParser.Expr_func_partition_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_spec_func(HplsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_spec_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_spec_func(HplsqlParser.Expr_spec_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(HplsqlParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(HplsqlParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_dot}.
	 * @param ctx the parse tree
	 */
	void enterExpr_dot(HplsqlParser.Expr_dotContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_dot}.
	 * @param ctx the parse tree
	 */
	void exitExpr_dot(HplsqlParser.Expr_dotContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_dot_method_call}.
	 * @param ctx the parse tree
	 */
	void enterExpr_dot_method_call(HplsqlParser.Expr_dot_method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_dot_method_call}.
	 * @param ctx the parse tree
	 */
	void exitExpr_dot_method_call(HplsqlParser.Expr_dot_method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_dot_property_access}.
	 * @param ctx the parse tree
	 */
	void enterExpr_dot_property_access(HplsqlParser.Expr_dot_property_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_dot_property_access}.
	 * @param ctx the parse tree
	 */
	void exitExpr_dot_property_access(HplsqlParser.Expr_dot_property_accessContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_params(HplsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#expr_func_params}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_params(HplsqlParser.Expr_func_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void enterFunc_param(HplsqlParser.Func_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#func_param}.
	 * @param ctx the parse tree
	 */
	void exitFunc_param(HplsqlParser.Func_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void enterDate_literal(HplsqlParser.Date_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#date_literal}.
	 * @param ctx the parse tree
	 */
	void exitDate_literal(HplsqlParser.Date_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void enterTimestamp_literal(HplsqlParser.Timestamp_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#timestamp_literal}.
	 * @param ctx the parse tree
	 */
	void exitTimestamp_literal(HplsqlParser.Timestamp_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(HplsqlParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(HplsqlParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#qident}.
	 * @param ctx the parse tree
	 */
	void enterQident(HplsqlParser.QidentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#qident}.
	 * @param ctx the parse tree
	 */
	void exitQident(HplsqlParser.QidentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterSingle_quotedString(HplsqlParser.Single_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code single_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitSingle_quotedString(HplsqlParser.Single_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void enterDouble_quotedString(HplsqlParser.Double_quotedStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code double_quotedString}
	 * labeled alternative in {@link HplsqlParser#string}.
	 * @param ctx the parse tree
	 */
	void exitDouble_quotedString(HplsqlParser.Double_quotedStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void enterInt_number(HplsqlParser.Int_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#int_number}.
	 * @param ctx the parse tree
	 */
	void exitInt_number(HplsqlParser.Int_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void enterDec_number(HplsqlParser.Dec_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#dec_number}.
	 * @param ctx the parse tree
	 */
	void exitDec_number(HplsqlParser.Dec_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(HplsqlParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(HplsqlParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void enterNull_const(HplsqlParser.Null_constContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#null_const}.
	 * @param ctx the parse tree
	 */
	void exitNull_const(HplsqlParser.Null_constContext ctx);
	/**
	 * Enter a parse tree produced by {@link HplsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void enterNon_reserved_words(HplsqlParser.Non_reserved_wordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HplsqlParser#non_reserved_words}.
	 * @param ctx the parse tree
	 */
	void exitNon_reserved_words(HplsqlParser.Non_reserved_wordsContext ctx);
}