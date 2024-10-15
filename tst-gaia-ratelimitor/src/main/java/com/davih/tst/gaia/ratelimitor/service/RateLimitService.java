package com.davih.tst.gaia.ratelimitor.service;


public interface RateLimitService {

    /**
     * 申请资源,获取访问权限
     *
     * @param limitParams:限流参数
     * @return
     */
    boolean accquire(String key, Object[] limitParams);

}
