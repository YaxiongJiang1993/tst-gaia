package com.davih.tst.reactor.test.demo;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.SignalType;

import java.time.Duration;

public class DavTest {

    public static void main(String[] args) throws Exception {
        testDoOn2();
    }

    /**
     * doOnXxx 发生XXX事件产生一个回调，不能改变
     * onXxx 发生XXX事件的动作，可以改变元素信号
     *
     * @throws Exception
     */
    private static void testDoOn2() throws Exception {

        Flux<Integer> flux = Flux.range(1, 7)
                .delayElements(Duration.ofSeconds(1L))
                .doOnComplete(() -> {
                    System.out.println("发布者: 流正常结束");
                })
                .doOnCancel(() -> {
                    System.out.println("发布者: 流被取消");
                })
                .doOnError(throwable -> {
                    System.out.println("发布者: 流出错了, msg: " + throwable.getMessage() + ", throwable" + throwable);
                })
                .doOnNext(integer -> {
                    System.out.println("发布者: doOnNext ... " + integer);
                    if(integer==3){
                        int i=integer/0;
                    }
                })
//                .onErrorComplete()
                .onErrorContinue((throwable, obj) -> {
                    System.out.println("发布者: 错误处理: " + throwable + ", 出错元素: " + obj);
                });


//        flux.subscribe(t -> System.out.println(t));
        flux.subscribe(new BaseSubscriber<Integer>() {
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                System.out.println("订阅者: 订阅者和发布者绑定好了: " + subscription);
                request(1L);
            }

            @Override
            protected void hookOnNext(Integer value) {
                System.out.println("订阅者: 元素到达 ... " + value);
                if (value < 5) {
                    request(1L);
                    if (value == 3) {
                        //int i = 10 / 0;
                    }
                } else {
                    cancel();
                }
            }

            @Override
            protected void hookOnComplete() {
                System.out.println("订阅者: 数据流结束");
            }

            @Override
            protected void hookOnError(Throwable throwable) {
                System.out.println("订阅者: 数据流异常结束");
            }

            @Override
            protected void hookOnCancel() {
                System.out.println("订阅者: 数据流取消");
            }

            @Override
            protected void hookFinally(SignalType type) {
                System.out.println("订阅者: 结束信号: " + type);
            }
        });

        Thread.sleep(2000);

        System.in.read();
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

    /**
     * 响应式编程核心：看懂文档弹珠图；
     * 信号： 正常/异常（取消）
     * SignalType：
     *      SUBSCRIBE： 被订阅
     *      REQUEST：  请求了N个元素
     *      CANCEL： 流被取消
     *      ON_SUBSCRIBE：在订阅时候
     *      ON_NEXT： 在元素到达
     *      ON_ERROR： 在流错误
     *      ON_COMPLETE：在流正常完成时
     *      AFTER_TERMINATE：中断以后
     *      CURRENT_CONTEXT：当前上下文
     *      ON_CONTEXT：感知上下文
     * <p>
     * doOnXxx API触发时机
     *      1、doOnNext：每个数据（流的数据）到达的时候触发
     *      2、doOnEach：每个元素（流的数据和信号）到达的时候触发
     *      3、doOnRequest： 消费者请求流元素的时候
     *      4、doOnError：流发生错误
     *      5、doOnSubscribe: 流被订阅的时候
     *      6、doOnTerminate： 发送取消/异常信号中断了流
     *      7、doOnCancle： 流被取消
     *      8、doOnDiscard：流中元素被忽略的时候
     *
     */
    private static void testDoOn() throws Exception {

        Flux<Integer> flux = Flux.range(1, 7)
                .delayElements(Duration.ofSeconds(1L))
                .doOnComplete(() -> {
                    System.out.println("发布者: 流正常结束");
                })
                .doOnCancel(() -> {
                    System.out.println("发布者: 流被取消");
                })
                .doOnError(throwable -> {
                    System.out.println("发布者: 流出错了, msg: " + throwable.getMessage() + ", throwable" + throwable);
                })
                .doOnNext(integer -> {
                    System.out.println("发布者: doOnNext ... " + integer);
                });

//        flux.subscribe(t -> System.out.println(t));
        flux.subscribe(new BaseSubscriber<Integer>() {
            @Override
            protected void hookOnSubscribe(Subscription subscription) {
                System.out.println("订阅者: 订阅者和发布者绑定好了: " + subscription);
                request(1L);
            }

            @Override
            protected void hookOnNext(Integer value) {
                System.out.println("订阅者: 元素到达 ... " + value);
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
                System.out.println("订阅者: 数据流结束");
            }

            @Override
            protected void hookOnError(Throwable throwable) {
                System.out.println("订阅者: 数据流异常结束");
            }

            @Override
            protected void hookOnCancel() {
                System.out.println("订阅者: 数据流取消");
            }

            @Override
            protected void hookFinally(SignalType type) {
                System.out.println("订阅者: 结束信号: " + type);
            }
        });

        Thread.sleep(2000);

        System.in.read();
    }
}
