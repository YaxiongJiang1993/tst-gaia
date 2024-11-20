package com.davih.tst.common.test.antr.arrayint;

import com.davih.tst.common.test.antr.arrayint.code.ArrayIntBaseVisitor;
import com.davih.tst.common.test.antr.arrayint.code.ArrayIntLexer;
import com.davih.tst.common.test.antr.arrayint.code.ArrayIntParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class DavTest {

    public static void main(String[] args) {
        String arrayInt = "{1,2,3}";
        final ArrayIntLexer arrayIntLexer = new ArrayIntLexer(CharStreams.fromString(arrayInt));
        //字符组成单词（token）
        final CommonTokenStream commonTokenStream = new CommonTokenStream(arrayIntLexer);
        //词法分析：将负责将符号（token）分组成符号类
        final ArrayIntParser arrayIntParser = new ArrayIntParser(commonTokenStream);
        //根据词法，构建出一棵分析树（parse tree）或叫语法树（syntax tree）
        final ArrayIntParser.InitContext selectStatementContext = arrayIntParser.init();
        //遍历树节点
        ArrayIntBaseVisitor visitor = new ArrayIntBaseVisitor();
        visitor.visit(selectStatementContext);
    }
}
