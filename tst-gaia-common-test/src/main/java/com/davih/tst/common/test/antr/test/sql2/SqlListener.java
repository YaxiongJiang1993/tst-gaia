package com.davih.tst.common.test.antr.test.sql2;

import com.davih.tst.common.test.antr.test.sql2.gen.SqlBaseListener;
import com.davih.tst.common.test.antr.test.sql2.gen.SqlParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SqlListener extends SqlBaseListener {
    private final Map<String, List<String>> tableToColumns = new HashMap<>();
    private String currentTable = null;

    @Override
    public void enterTable(SqlParser.TableContext ctx) {
        // 获取表名
        String tableName = ctx.getText();
        currentTable = tableName;
        tableToColumns.putIfAbsent(tableName, new ArrayList<>());
    }

    @Override
    public void enterColumn(SqlParser.ColumnContext ctx) {
        if (currentTable != null) {
            if (ctx.ID() != null) {
                for (TerminalNode id : ctx.ID()) { // 遍历 ID 列表
                    String columnName = id.getText();
                    tableToColumns.get(currentTable).add(columnName);
                }
            } else if (ctx.functionCall() != null) {
                // 函数调用作为列
                String functionCall = ctx.functionCall().getText();
                tableToColumns.get(currentTable).add(functionCall);
            }
        }
    }

    public Map<String, List<String>> getTableToColumns() {
        return tableToColumns;
    }
}
