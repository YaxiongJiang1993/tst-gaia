package com.davih.tst.reactor.test.demo;

import reactor.core.publisher.Flux;

import java.time.Duration;

public class DavTest {

    public static void main(String[] args) throws Exception {
        test();
    }

    private static void test() throws Exception {

        Flux<Integer> flux = Flux.range(1, 7)
                .delayElements(Duration.ofSeconds(1L))
                .doOnComplete(() -> {
                    System.out.println("流正常结束");
                })
                .doOnCancel(() -> {
                    System.out.println("流异常结束");
                });

        flux.subscribe(t -> System.out.println(t));

        Thread.sleep(2000);

        System.in.read();
    }
}
