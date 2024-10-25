package com.davih.tst.common.test.rate_limiter;

import com.google.common.util.concurrent.RateLimiter;
import org.junit.jupiter.api.Test;

public class GuavaRateLimiterTest {

    @Test
    public void testAcquire() {
        RateLimiter limiter = RateLimiter.create(1);
        for(int i = 1; i < 10; i = i + 2 ) {
            double waitTime = limiter.acquire(i);
            System.out.println("cutTime=" + System.currentTimeMillis() + " acq:" + i + " waitTime:" + waitTime);
        }
    }

}
