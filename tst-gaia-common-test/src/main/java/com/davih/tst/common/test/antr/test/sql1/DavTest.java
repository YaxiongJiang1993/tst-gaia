package com.davih.tst.common.test.antr.test.sql1;

import com.davih.tst.common.test.antr.test.sql1.code.MySqlLexer;
import com.davih.tst.common.test.antr.test.sql1.code.MySqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class DavTest {

    public static void main(String[] args) {
        // 输入的 SQL 查询
        String sql = "SELECT * FROM orders WHERE customer_id = 1 and del=0;";

        // 词法分析器和语法分析器
        MySqlLexer lexer = new MySqlLexer(CharStreams.fromString(sql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MySqlParser parser = new MySqlParser(tokens);

        // Token 重写器
        TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);

        // 自定义监听器
        TablePrefixListener listener = new TablePrefixListener(rewriter, "tenant_db");

        // 解析和遍历语法树
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener, parser.root());

        // 输出重写后的 SQL
        System.out.println("重写后的 SQL: " + rewriter.getText());
    }
}
