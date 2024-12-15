package com.davih.tst.common.test.antr.hql;

import cn.hutool.core.util.StrUtil;

import com.davih.tst.common.test.antr.hql.code.HplsqlBaseListener;
import com.davih.tst.common.test.antr.hql.code.HplsqlParser;
import lombok.Data;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;


/**
 * @Author Geene
 * @Date 2022/11/3 9:47
 */
@Data
public class QueryListener extends HplsqlBaseListener {

    private boolean flag = false;
    private TokenStreamRewriter rewriter;
    private String dbName;
    private String limit = "";
    private String sql = "";
    private Token endToken;
    private Long limitCount;
    private Map<String, Object> accessTableInfo;
    private Set<String> withTableNames = new HashSet<>();

    public QueryListener(TokenStreamRewriter rewriter, String dbName, Long limitCount, Map<String, Object> userAccessTable) {
        this.rewriter = rewriter;
        this.dbName = dbName;
        this.limitCount = limitCount;
        this.accessTableInfo = userAccessTable;
    }

    @Override
    public void enterStmt(HplsqlParser.StmtContext ctx) {
        this.sql = ctx.getText();
        this.endToken = ctx.getStop();
    }

    @Override
    public void exitStmt(HplsqlParser.StmtContext ctx) {
        if (!this.sql.toLowerCase().startsWith("select") && !this.sql.toLowerCase().startsWith("with")) {
            return;
        }
        if (StrUtil.isNotBlank(this.limit) && this.sql.endsWith(this.limit)) {
            String limitCountStr = this.limit.toLowerCase().replace("limit", "").trim();
            Long limitCount = Long.valueOf(limitCountStr);
            if (limitCount > this.limitCount) {
                rewriter.replace(ctx.getStop(), StrUtil.format(" {}", this.limitCount));
            }
        } else {
            rewriter.replace(ctx.getStop(), StrUtil.format("{} limit {}", ctx.getStop().getText(), this.limitCount));
        }
    }

    @Override
    public void enterCte_select_stmt_item(HplsqlParser.Cte_select_stmt_itemContext ctx) {
        String withTableName = ctx.qident().getText().replace("`", "").toLowerCase();
        withTableNames.add(withTableName);
    }

    @Override
    public void enterTable_name(HplsqlParser.Table_nameContext tctx) {
        if (tctx != null) {
            String table = tctx.getText();
            if (withTableNames.contains(table.replace("`", "").toLowerCase())) {
                return;
            }
            if (!table.contains(".")) {
                rewriter.replace(tctx.getStart(), dbName + "." + table);
                validateTablePermission(dbName, table.replace("`", ""));
            } else {
                String[] split = table.split("\\.");
                validateTablePermission(split[0].replace("`", ""), split[1].replace("`", ""));
            }
        }
    }

    private void validateTablePermission(String dbName, String tableName) {
        Set<String> dbInfo = (Set<String>) accessTableInfo.get("dbInfo");
        if (!dbInfo.contains(dbName)) {
            throw QueryException.build(QueryErrorCode.WITHOUT_PERMISSION, StrUtil.format("Without Permission For Db: {}", dbName));
        }
        Map<String, Set<String>> tableInfo = (Map<String, Set<String>>) accessTableInfo.get("tableInfo");
        Set<String> tables = tableInfo.getOrDefault(dbName, new HashSet<>());
        if (!tables.contains(tableName)) {
            throw QueryException.build(QueryErrorCode.WITHOUT_PERMISSION, StrUtil.format("Without Permission For Table: {}.{}", dbName, tableName));
        }
    }

    @Override
    public void enterSelect_options_item(HplsqlParser.Select_options_itemContext ctx) {
        Token start = ctx.getStart();
        String text = start.getText();
        if ("limit".equalsIgnoreCase(text)) {
            this.limit = ctx.getText();
        }
    }
}
