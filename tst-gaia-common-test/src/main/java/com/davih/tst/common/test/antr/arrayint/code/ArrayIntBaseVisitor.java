// Generated from /home/david/flower/tst-gaia/tst-gaia-common-test/src/main/java/com/davih/tst/common/test/antr/arrayint/ArrayInt.g4 by ANTLR 4.13.2
package com.davih.tst.common.test.antr.arrayint.code;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ArrayIntVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
@SuppressWarnings("CheckReturnValue")
public class ArrayIntBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements ArrayIntVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInit(ArrayIntParser.InitContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitValue(ArrayIntParser.ValueContext ctx) { return visitChildren(ctx); }
}