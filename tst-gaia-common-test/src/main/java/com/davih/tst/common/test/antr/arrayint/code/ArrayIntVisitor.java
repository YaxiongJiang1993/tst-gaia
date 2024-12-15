// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/arrayint/ArrayInt.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.arrayint.code;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArrayIntParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArrayIntVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArrayIntParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ArrayIntParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrayIntParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ArrayIntParser.ValueContext ctx);
}