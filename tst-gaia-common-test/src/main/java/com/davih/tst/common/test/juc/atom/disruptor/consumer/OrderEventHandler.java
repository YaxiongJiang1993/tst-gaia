package com.davih.tst.common.test.juc.atom.disruptor.consumer;

import java.util.concurrent.ThreadPoolExecutor;

import com.davih.tst.common.test.juc.atom.disruptor.event.OrderEvent;
import com.lmax.disruptor.EventHandler;
import com.lmax.disruptor.WorkHandler;

/**
 * @author Fox
 * 消费者
 */
public class OrderEventHandler implements EventHandler<OrderEvent>, WorkHandler<OrderEvent> {

    @Override
    public void onEvent(OrderEvent event, long sequence, boolean endOfBatch) throws Exception {
        // TODO 消费逻辑
        System.out.println("消费者"+ Thread.currentThread().getName()
                +"获取数据value:"+ event.getValue()+",name:"+event.getName());
    }

    @Override
    public void onEvent(OrderEvent event) throws Exception {
        // TODO 消费逻辑
        System.out.println("消费者"+ Thread.currentThread().getName()
                +"获取数据value:"+ event.getValue()+",name:"+event.getName());
    }
}
