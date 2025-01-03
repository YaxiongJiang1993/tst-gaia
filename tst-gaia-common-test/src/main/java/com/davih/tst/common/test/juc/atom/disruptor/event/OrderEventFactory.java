package com.davih.tst.common.test.juc.atom.disruptor.event;

import com.lmax.disruptor.EventFactory;

/**
 * @author Fox
 * 事件工厂
 */
public class OrderEventFactory implements EventFactory<OrderEvent> {

    @Override
    public OrderEvent newInstance() {
        return new OrderEvent();
    }
}
