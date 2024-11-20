package com.davih.tst.common.test.antr.mysql;

import com.davih.tst.common.test.antr.mysql.code.MySqlLexer;
import com.davih.tst.common.test.antr.mysql.code.MySqlParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestSql {
    public static void main(String args[]) {        /** antlr4 格式化SQL **/
        MySqlLexer lexer = new MySqlLexer(CharStreams.fromString("create table newtable select *from table1"));
        MySqlParser parser = new MySqlParser(new CommonTokenStream(lexer));        //定义CreateTableListener
        CreateTableListener listener = new CreateTableListener();
        ParseTreeWalker.DEFAULT.walk(listener, parser.sqlStatements());        /**提取关键参数-表名*/
        String tableName = listener.getTableName();
        /**测试打印方法*/
        System.out.println(tableName);
    }
}
