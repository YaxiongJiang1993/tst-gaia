package com.davih.tst.common.test.antr.expr;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.davih.tst.common.test.antr.expr.code.ExprLexer;
import com.davih.tst.common.test.antr.expr.code.ExprParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class ExprDemo {

    public static void main(String[] args) {

        List<String> testSet = Arrays.asList(
                "1+2",
                "1+2+3*4",
                "3/3",
                "10/2",
                "5*5+10+5*5"
        );

        List<Integer> res = Arrays.asList(
                3,15,1,5,60
        );

        for (int i = 0; i < testSet.size(); i++) {
            // 构建字符流
            CodePointCharStream charStream = CharStreams.fromString(testSet.get(i));

            // 从字符流分析词法， 解析为token
            ExprLexer lexer = new ExprLexer(charStream);

            // 从token进行分析
            ExprParser parser = new ExprParser(new CommonTokenStream( lexer) );

            // 使用监听器，遍历语法树，根据语法定义，prog为语法树的根节点
            ExprParser.ProgContext prog = parser.prog();


            // 使用visitor，生成自定义的对象
            Integer integer = prog.accept(new EvalExprVisitor());
            System.out.println(integer);
            System.out.println(Objects.equals(integer, res.get(i)));
        }
    }

}


