package com.davih.tst.common.test.antr.hql;

import lombok.Data;

/**
 * @Author Geene
 * @Date 2024/05/21 15:45
 */
@Data
public class QueryException extends RuntimeException{
    private QueryErrorCode code;
    private String message;
    private QueryException(QueryErrorCode errorCode, String message) {
        this.code = errorCode;
        this.message = message;
    }

    public static QueryException build(QueryErrorCode errorCode, String message){
        return new QueryException(errorCode, message);
    }
}
