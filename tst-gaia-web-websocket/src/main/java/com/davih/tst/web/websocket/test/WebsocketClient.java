package com.davih.tst.web.websocket.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ws-client")
public class WebsocketClient {

    @Resource
    private MyWebSocketClient webSocketClient;

    @GetMapping("/send")
    public void sendRequest(){
        String message="{\"event\":\"START\", \"offsets\":[{\"partition\":0, \"offset\": 0}]}";
        webSocketClient.send(message);
    }
}
