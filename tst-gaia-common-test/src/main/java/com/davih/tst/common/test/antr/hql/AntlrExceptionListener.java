package com.davih.tst.common.test.antr.hql;

import cn.hutool.core.util.StrUtil;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

@Slf4j
public class AntlrExceptionListener extends BaseErrorListener {
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg,
                            RecognitionException e) {
        String message = StrUtil.format("Parse Sql Failed: Something Is Wrong At {} line: {} column, Msg: {}", line, charPositionInLine, msg);
        log.error(message, e);
        throw QueryException.build(QueryErrorCode.INVALID_SQL, message);
    }

}