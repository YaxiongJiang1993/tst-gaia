package com.davih.tst.gaia.ratelimitor.handler;

import com.davih.tst.gaia.ratelimitor.service.RateLimitService;

public abstract class AbstractRateLimitService implements RateLimitService {

    protected String ratePrefix = "ratelimit:";

    public String getRatePrefix() {
        return ratePrefix;
    }

    public void setRatePrefix(String ratePrefix) {
        this.ratePrefix = ratePrefix;
    }
}
