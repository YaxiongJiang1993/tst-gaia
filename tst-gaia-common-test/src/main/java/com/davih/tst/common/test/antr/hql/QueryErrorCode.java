package com.davih.tst.common.test.antr.hql;


public enum QueryErrorCode {
    PARAMETER_ERROR(QueryConsts.ERROR_BASE + 1,"Params Error"),
    GET_CONNECTION_FAILED(QueryConsts.ERROR_BASE + 2, "Get Connection Failed"),
    RESOLVE_META_FAILED(QueryConsts.ERROR_BASE + 3, "Resolve Meta Failed"),
    GET_DATA_FAILED(QueryConsts.ERROR_BASE + 4, "Get Data Failed"),
    EXECUTE_FAILED(QueryConsts.ERROR_BASE + 5, "Execute Sql Failed"),
    INVALID_SQL(QueryConsts.ERROR_BASE + 6, "Invalid Sql"),
    WITHOUT_PERMISSION(QueryConsts.ERROR_BASE + 7, "Without Permission"),
    QUERY_NOT_EXIST(QueryConsts.ERROR_BASE + 8, "Query Not Exist");

    private final int value;
    private final String msg;

    QueryErrorCode(int value, String msg) {
        this.value = value;
        this.msg = msg;
    }

    public int value() {
        return this.value;
    }

    public String getMsg() {
        return this.msg;
    }
}