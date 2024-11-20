package com.davih.tst.common.test.antr.hello;


import com.davih.tst.common.test.antr.hello.gen.HelloLexer;
import com.davih.tst.common.test.antr.hello.gen.HelloParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class HelloTest {

    public static void main(String[] args) throws Exception {
        CodePointCharStream charStream = CharStreams.fromString("hello parrt");
        HelloLexer lexer = new HelloLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        ParseTree tree = parser.r();
        System.out.println(tree.toStringTree(parser));
    }
}
