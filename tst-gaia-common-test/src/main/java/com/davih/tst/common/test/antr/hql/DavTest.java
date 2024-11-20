package com.davih.tst.common.test.antr.hql;

import com.davih.tst.common.test.antr.hql.code.HplsqlLexer;
import com.davih.tst.common.test.antr.hql.code.HplsqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.Map;

public class DavTest {

    public static void main(String[] args) {

    }

    public String antrlValidateSql(String sql, String dbName, Long limit, Map<String, Object> userAccessTable) {

        CodePointCharStream stream = CharStreams.fromString(sql);
        HplsqlLexer lexer = new HplsqlLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TokenStreamRewriter reWriter = new TokenStreamRewriter(tokens);
        HplsqlParser parser = new HplsqlParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new AntlrExceptionListener());
        ParseTreeWalker walker = new ParseTreeWalker();
        QueryListener queryListener = new QueryListener(reWriter, dbName, limit, userAccessTable);
        walker.walk(queryListener, parser.program());
        return reWriter.getText(Interval.of(0, queryListener.getEndToken().getTokenIndex()));
    }
}
