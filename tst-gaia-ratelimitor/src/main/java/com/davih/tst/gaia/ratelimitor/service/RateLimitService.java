package com.davih.tst.gaia.ratelimitor.service;


public interface RateLimitService {

    /**
     * 申请资源,获取访问权限
     *
     * @param resourceNum:申请的资源数量
     * @return
     */
    boolean accquire(String key, int resourceNum);

}
