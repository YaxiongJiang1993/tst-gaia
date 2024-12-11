package com.davih.tst.common.test.antr.starrocks;

import com.davih.tst.common.test.antr.starrocks.gen.StarRocksParser;
import com.davih.tst.common.test.antr.starrocks.gen.StarRocksParserBaseListener;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class QueryStarRocksListener extends StarRocksParserBaseListener {

    private boolean flag = false;

    private TokenStreamRewriter rewriter;

    private String dbName;

    private String limit = "";

    private String sql = "";

    private Token endToken;

    private Long limitCount;

    private Map<String, Object> accessTableInfo;

    private Set<String> withTableNames = new HashSet<>();

    public QueryStarRocksListener(TokenStreamRewriter rewriter, String dbName, Long limitCount, Map<String, Object> userAccessTable) {
        this.rewriter = rewriter;
        this.dbName = dbName;
        this.limitCount = limitCount;
        this.accessTableInfo = userAccessTable;
    }

    @Override
    public void enterSqlStatements(StarRocksParser.SqlStatementsContext ctx) {
        this.sql = ctx.getText();
        this.endToken = ctx.getStop();
    }

    @Override
    public void enterTableAtom(StarRocksParser.TableAtomContext ctx) {
        System.out.println(ctx.getText());
    }

    @Override
    public void exitSqlStatements(StarRocksParser.SqlStatementsContext ctx) {
        super.exitSqlStatements(ctx);
    }

    @Override
    public void enterInlineTable(StarRocksParser.InlineTableContext ctx) {
        super.enterInlineTable(ctx);
    }

    @Override
    public void enterShowTableStatement(StarRocksParser.ShowTableStatementContext ctx) {
        super.enterShowTableStatement(ctx);
    }
}
