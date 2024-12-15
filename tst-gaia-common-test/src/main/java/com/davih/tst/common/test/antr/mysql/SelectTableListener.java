package com.davih.tst.common.test.antr.mysql;

import com.davih.tst.common.test.antr.mysql.code.MySqlParser;
import com.davih.tst.common.test.antr.mysql.code.MySqlParserBaseListener;

import java.util.List;

public class SelectTableListener extends MySqlParserBaseListener {
    private String tableName = null;

    @Override
    public void enterQueryCreateTable(MySqlParser.QueryCreateTableContext ctx) {
        List<MySqlParser.TableNameContext>tableSourceContexts = ctx.getRuleContexts(MySqlParser.TableNameContext.class);
        for (MySqlParser.TableNameContext tableSource : tableSourceContexts) {            //通过tableSourceItems获取表名
            tableName = tableSource.getText();
        }
    }

    // 重写 enterSelectElements 方法以处理 SELECT 语句的字段部分
    @Override
    public void enterSelectElements(MySqlParser.SelectElementsContext ctx) {
        if (ctx.star != null) {
            System.out.println("Selecting all columns (*)");
        }
    }

    // 处理 selectStarElement
    @Override
    public void enterSelectStarElement(MySqlParser.SelectStarElementContext ctx) {
        System.out.println("Selecting all columns from table: " + ctx.fullId().getText());
    }

    // 处理 selectColumnElement
    @Override
    public void enterSelectColumnElement(MySqlParser.SelectColumnElementContext ctx) {
        System.out.println("Selecting column: " + ctx.fullColumnName().getText());
        if (ctx.uid() != null) {
            System.out.println("Alias for column: " + ctx.uid().getText());
        }
    }

    // 处理 selectFunctionElement
    @Override
    public void enterSelectFunctionElement(MySqlParser.SelectFunctionElementContext ctx) {
        System.out.println("Selecting function: " + ctx.functionCall().getText());
        if (ctx.uid() != null) {
            System.out.println("Alias for function result: " + ctx.uid().getText());
        }
    }

    // 处理 selectExpressionElement
    @Override
    public void enterSelectExpressionElement(MySqlParser.SelectExpressionElementContext ctx) {
        System.out.println("Selecting expression: " + ctx.expression().getText());
        if (ctx.uid() != null) {
            System.out.println("Alias for expression: " + ctx.uid().getText());
        }
    }

    public String getTableName() {
        return tableName;
    }
}