package com.davih.tst.common.test.antr.mysql;

import com.davih.tst.common.test.antr.mysql.code.MySqlParser;
import com.davih.tst.common.test.antr.mysql.code.MySqlParserBaseListener;

public class ExtractInterfaceListener extends MySqlParserBaseListener {

    private MySqlParser parser;

    public ExtractInterfaceListener(MySqlParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterDeleteStatement(MySqlParser.DeleteStatementContext ctx) {
        System.out.println("删除语句检测到：" + ctx.getText());
    }

    @Override
    public void enterFromClause(MySqlParser.FromClauseContext ctx) {
        if (ctx.whereExpr != null) {
            System.out.println("WHERE 条件：" + ctx.whereExpr.getText());
        } else {
            System.out.println("没有 WHERE 条件");
        }

        if (ctx.expression() != null) {
            System.out.println("WHERE 条件：" + ctx.expression().getText());
        } else {
            System.out.println("没有 WHERE 条件");
        }
    }

    @Override
    public void enterTableName(MySqlParser.TableNameContext ctx) {
        System.out.println("表名：" + ctx.getText());
    }
}

