package com.davih.tst.web.websocket.test;

import org.java_websocket.client.WebSocketClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.net.URISyntaxException;

@Component
public class WebSocketClientConfigurer {

    private final String wsServerUrl = "ws://51.81.244.224:9500/subscribe/mercury2/2c92ea7e071dbc3a9799503ed3f1b90c/spc_nosignal_res";

    @Bean
    public WebSocketClient webSocketClient() {
        try {
            MyWebSocketClient webSocketClient =
                    new MyWebSocketClient(new URI(wsServerUrl));
            webSocketClient.connect();
            return webSocketClient;
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return null;
    }

}

