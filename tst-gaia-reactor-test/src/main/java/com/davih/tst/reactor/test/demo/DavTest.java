package com.davih.tst.reactor.test.demo;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.SignalType;

import java.time.Duration;

public class DavTest {

    public static void main(String[] args) throws Exception {
        testDoOn1();
    }

    private static void testDoOn1() throws Exception {

        Flux<Integer> flux = Flux.just(1, 2, 3, 5, 7, 0, 5, 6, 3)
                .doOnNext(integer -> {
                    System.out.println("doOnNext 111 ... " + integer);
                })
                .doOnEach(signal -> {
                    System.out.println("doOnEach 111 ... " + signal);
                })
                .map(i -> 10 / i)
                .doOnComplete(() -> {
                    System.out.println("流正常结束");
                })
                .doOnCancel(() -> {
                    System.out.println("流被取消");
                })
                .doOnError(throwable -> {
                    System.out.println("流出错了, msg: " + throwable.getMessage() + ", throwable" + throwable);
                })
                .doOnNext(integer -> {
                    System.out.println("doOnNext ... " + integer);
                });

        flux.subscribe(t -> System.out.println(t));

        System.in.read();
    }

    private static void testDoOn() throws Exception {

        Flux<Integer> flux = Flux.range(1, 7)
                .delayElements(Duration.ofSeconds(1L))
                .doOnComplete(() -> {
                    System.out.println("流正常结束");
                })
                .doOnCancel(() -> {
                    System.out.println("流被取消");
                })
                .doOnError(throwable -> {
                    System.out.println("流出错了, msg: " + throwable.getMessage() + ", throwable" + throwable);
                })
                .doOnNext(integer -> {
                    System.out.println("doOnNext ... " + integer);
                });

//        flux.subscribe(t -> System.out.println(t));
        flux.subscribe(new BaseSubscriber<Integer>() {
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                System.out.println("订阅者和发布者绑定好了: " + subscription);
                request(1L);
            }

            @Override
            protected void hookOnNext(Integer value) {
                System.out.println("元素到达 ... " + value);
                if (value < 5) {
                    request(1L);
                    if (value == 3) {
                        int i = 10 / 0;
                    }
                } else {
                    cancel();
                }
            }

            @Override
            protected void hookOnComplete() {
                System.out.println("数据流结束");
            }

            @Override
            protected void hookOnError(Throwable throwable) {
                System.out.println("数据流异常结束");
            }

            @Override
            protected void hookOnCancel() {
                System.out.println("数据流取消");
            }

            @Override
            protected void hookFinally(SignalType type) {
                System.out.println("结束信号: " + type);
            }
        });

        Thread.sleep(2000);

        System.in.read();
    }
}
