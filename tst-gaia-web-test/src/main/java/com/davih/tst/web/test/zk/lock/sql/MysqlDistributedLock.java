package com.davih.tst.web.test.zk.lock.sql;


import com.davih.tst.web.test.zk.bean.Methodlock;
import com.davih.tst.web.test.zk.lock.AbstractLock;
import com.davih.tst.web.test.zk.mapper.MethodlockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author Fox
 *
 */
//@Component
public class MysqlDistributedLock extends AbstractLock {

    @Autowired
    private MethodlockMapper methodlockMapper;

    @Override
    public boolean tryLock() {
        try {
            //插入一条数据   insert into
            methodlockMapper.insert(new Methodlock("lock"));
        }catch (Exception e){
            //插入失败
            return false;
        }
        return true;
    }

    @Override
    public void waitLock() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void unlock() {
        //删除数据   delete
        methodlockMapper.deleteByMethodlock("lock");
        System.out.println("-------释放锁------");
    }
}
