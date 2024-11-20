package com.davih.tst.common.test.antr.mysql;

import com.davih.tst.common.test.antr.mysql.code.MySqlLexer;
import com.davih.tst.common.test.antr.mysql.code.MySqlParser;
import com.davih.tst.common.test.antr.mysql.code.MySqlParserBaseVisitor;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class DavTest {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        String sql = "DELETE FROM T1 WHERE COL1 = TRUE AND (COL2 - COL3 <= (SELECT COUNT(*) FROM T2) OR MAINCOL/2 > 100.2);".toUpperCase();
        final MySqlLexer mySqlLexer = new MySqlLexer(CharStreams.fromString(sql));
        //字符组成单词（token）
        final CommonTokenStream commonTokenStream = new CommonTokenStream(mySqlLexer);
        //词法分析：将负责将符号（token）分组成符号类
        final MySqlParser mySqlParser = new MySqlParser(commonTokenStream);
        //根据词法，构建出一棵分析树（parse tree）或叫语法树（syntax tree）
        final ParseTree tree = mySqlParser.root();
        //遍历树节
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        ExtractInterfaceListener extractor = new ExtractInterfaceListener(mySqlParser);
        walker.walk(extractor, tree); // initiate walk of tree with listener
    }

    private static void test2(){
        String sql = "DELETE FROM T1 WHERE COL1 = TRUE AND (COL2 - COL3 <= (SELECT COUNT(*) FROM T2) OR MAINCOL/2 > 100.2);".toUpperCase();
        final MySqlLexer mySqlLexer = new MySqlLexer(CharStreams.fromString(sql));
        //字符组成单词（token）
        final CommonTokenStream commonTokenStream = new CommonTokenStream(mySqlLexer);
        //词法分析：将负责将符号（token）分组成符号类
        final MySqlParser mySqlParser = new MySqlParser(commonTokenStream);
        //根据词法，构建出一棵分析树（parse tree）或叫语法树（syntax tree）
        final MySqlParser.RootContext selectStatementContext = mySqlParser.root();
        //遍历树节点
        MySqlParserBaseVisitor visitor = new MySqlParserBaseVisitor();
        visitor.visit(selectStatementContext);
    }
}
