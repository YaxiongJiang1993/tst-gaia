package com.davih.tst.common.test.antr.test.sql1;

import com.davih.tst.common.test.antr.test.sql1.code.MySqlBaseListener;
import com.davih.tst.common.test.antr.test.sql1.code.MySqlParser;
import org.antlr.v4.runtime.TokenStreamRewriter;


public class TablePrefixListener extends MySqlBaseListener {
    private final TokenStreamRewriter rewriter;
    private final String dbName;

    public TablePrefixListener(TokenStreamRewriter rewriter, String dbName) {
        this.rewriter = rewriter;
        this.dbName = dbName;
    }

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {
        String tableName = ctx.getText();
        if (!tableName.contains(".")) { // 检查是否已有前缀
            rewriter.insertBefore(ctx.getStart(), dbName + ".");
        }
    }

    @Override
    public void enterSelectElements(MySqlParser.SelectElementsContext ctx) {
        if (ctx.STAR() != null) { // 如果是 SELECT *，确保前后有空格
            rewriter.insertBefore(ctx.STAR().getSymbol(), " ");
            rewriter.insertAfter(ctx.STAR().getSymbol(), " ");
        }
    }

    @Override
    public void enterSelectStatement(MySqlParser.SelectStatementContext ctx) {
        rewriter.insertBefore(ctx.FROM().getSymbol(), " "); // 在 FROM 前插入空格
        rewriter.insertAfter(ctx.FROM().getSymbol(), " "); // 在 FROM hou插入空格
    }

    @Override
    public void enterWhereClause(MySqlParser.WhereClauseContext ctx) {
        rewriter.insertBefore(ctx.WHERE().getSymbol(), " "); // 在 WHERE 前插入空格
        rewriter.insertAfter(ctx.WHERE().getSymbol(), " "); // 在 WHERE 前插入空格
    }

    @Override
    public void enterAndCondition(MySqlParser.AndConditionContext ctx) {
        rewriter.insertBefore(ctx.AND().getSymbol(), " ");
        rewriter.insertAfter(ctx.AND().getSymbol(), " ");
    }

    @Override
    public void enterComparisonOperator(MySqlParser.ComparisonOperatorContext ctx) {
        rewriter.insertBefore(ctx.getStart(), " ");
        rewriter.insertAfter(ctx.getStop(), " ");
    }

    @Override
    public void exitSqlStatement(MySqlParser.SqlStatementContext ctx) {
        // 清理 SQL 并确保以正确的 ; 结尾
        String rewrittenSQL = rewriter.getText();
        rewrittenSQL = rewrittenSQL.replaceAll("\\s+;", ";");
        rewriter.replace(0, rewriter.getTokenStream().size() - 1, rewrittenSQL.trim());
    }
}

