package com.davih.tst.common.test.juc.atom.disruptor.event;


import lombok.Data;

/**
 * @author Fox
 * 消息载体(事件)
 */
@Data
public class OrderEvent {

    private long value;
    private String name;

}
