package org.example.doublecheck;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.doublecheck
 * @className: IdGenerator
 * @author: zhen.wang
 * @description: IdGenerator
 * @date: 2023/9/13 21:28
 * @version: 1.0
 */
public class IdGenerator {
    /**
     * 优点：
     * 1、既支持延迟加载，又支持高并发的单例实现方式
     * 缺点：
     * 1、代码复杂度高
     */
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        //第一层校验，解决懒汉式的并发问题
        if (instance == null) {
            synchronized(IdGenerator.class) {
                /**
                 * 如果没有第⼆次校验，假设线程t1执⾏了第⼀次校验后，判断为null，这时t2也获取了CPU 执⾏权，也执⾏了第⼀次校验，判断也为null。
                 * 接下来t2获得锁，创建实例。
                 * 这时t1⼜获得CPU执⾏权， 由于之前已经进⾏了第⼀次校验，结果为null（不会再次判断），获得锁后，直接创建实例。
                 * 结果就会导 致创建多个实例。
                 * 所以需要在同步代码⾥⾯进⾏第⼆次校验，如果实例为空，则进⾏创建。
                 */
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
