package com.davih.tst.reactor.test.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.netty.ByteBufFlux;
import reactor.netty.http.client.HttpClient;
import reactor.netty.http.client.HttpClientResponse;

import java.util.HashMap;
import java.util.Map;

public class HttpReactorTest {

    public static void main(String[] args) {
        testGet();
    }

    private static void testGet(){
        Flux<HttpClientResponse> responseFlux = HttpClient.create()
                .headers(headers -> {
                    headers.remove("Host");
                    headers.add("X-Custom-Header", "Demo");
                    headers.add("vdata-authorization", "e7d76272fafa45998b31045ccd4fc776");
                })
                .request(io.netty.handler.codec.http.HttpMethod.GET)
                .uri("http://localhost:9835/api/tenant/indicator-task/get-indicator-and-dimension?tableName=ads_bh_interact_stat_di")
                .send((req, out) -> out.send(ByteBufFlux.fromString(Flux.empty())))
                .responseConnection((res, conn) -> {
                    return conn.inbound().receive()
                            .aggregate()
                            .asString()
                            .doOnNext(body -> {
                                System.out.println("Status: " + res.status());
                                System.out.println("Headers: " + res.responseHeaders());
                                System.out.println("Body: " + body);
                            })
                            .thenMany(Flux.just(res)); // 返回 Flux<HttpClientResponse>
                });

        // 异步订阅
        responseFlux.subscribe(
                res -> System.out.println("Response handled."+res),
                error -> System.err.println("Error: " + error),
                () -> System.out.println("Request completed.")
        );

        // 模拟程序运行时不退出（因为主线程退出前不会等异步）
        try {
            Thread.sleep(3000); // 或更长一点，取决于请求延迟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testPost() throws Exception {
        // 构造 JSON 请求体
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("name", "Tom");
        jsonMap.put("age", 18);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(jsonMap);

        Flux<HttpClientResponse> responseFlux = HttpClient.create()
                .headers(headers -> {
                    headers.remove("Host");
                    headers.add("X-Custom-Header", "Demo");
                    headers.add("Content-Type", "application/json"); // ✅ 指定 JSON 类型
                })
                .request(io.netty.handler.codec.http.HttpMethod.POST) // ✅ 改为 POST
                .uri("http://192.0.16.128:8080/post") // ✅ 改为 POST 接口
                .send((req, out) -> out.sendString(Mono.just(jsonBody))) // ✅ 发送 JSON 字符串
                .responseConnection((res, conn) -> {
                    return conn.inbound().receive()
                            .aggregate()
                            .asString()
                            .doOnNext(body -> {
                                System.out.println("Status Post: " + res.status());
                                System.out.println("Headers: " + res.responseHeaders());
                                System.out.println("Body: " + body);
                            })
                            .thenMany(Flux.just(res));
                });

        // 异步订阅（控制台程序需防止提前退出）
        responseFlux.subscribe(
                res -> System.out.println("Response handled."),
                err -> System.err.println("Error: " + err),
                () -> System.out.println("Request completed.")
        );

        // 模拟程序运行时不退出（因为主线程退出前不会等异步）
        try {
            Thread.sleep(3000); // 或更长一点，取决于请求延迟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void testPost1() throws Exception {
        // 构造 JSON 请求体
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("name", "Tom");
        jsonMap.put("age", 18);

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonBody = objectMapper.writeValueAsString(jsonMap);

        Flux<HttpClientResponse> responseFlux = HttpClient.create()
                .headers(headers -> {
                    headers.remove("Host");
                    headers.add("vdata-authorization", "e7d76272fafa45998b31045ccd4fc776");
                    headers.add("Content-Type", "application/json"); // ✅ 指定 JSON 类型
                })
                .request(io.netty.handler.codec.http.HttpMethod.POST) // ✅ 改为 POST
                .uri("http://192.0.16.128:8080/post") // ✅ 改为 POST 接口
                .send((req, out) -> out.sendString(Mono.just(jsonBody))) // ✅ 发送 JSON 字符串
                .responseConnection((res, conn) -> {
                    return conn.inbound().receive()
                            .aggregate()
                            .asString()
                            .doOnNext(body -> {
                                System.out.println("Status Post: " + res.status());
                                System.out.println("Headers: " + res.responseHeaders());
                                System.out.println("Body: " + body);
                            })
                            .thenMany(Flux.just(res));
                });

        // 异步订阅（控制台程序需防止提前退出）
        responseFlux.subscribe(
                res -> System.out.println("Response handled."),
                err -> System.err.println("Error: " + err),
                () -> System.out.println("Request completed.")
        );

        // 模拟程序运行时不退出（因为主线程退出前不会等异步）
        try {
            Thread.sleep(3000); // 或更长一点，取决于请求延迟
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
