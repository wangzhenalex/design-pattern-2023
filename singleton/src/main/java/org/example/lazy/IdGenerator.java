package org.example.lazy;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.lazy
 * @className: IdGenerator
 * @author: zhen.wang
 * @description: 懒汉式
 * @date: 2023/9/13 21:21
 * @version: 1.0
 */
public class IdGenerator {
    /**
     * 优点：
     * 1、是⽀持延迟加载，加快启动速度
     * 缺点：
     * 1、synchronzed 锁粒度⼤，如果该单例被多次调⽤，那么每次都会进⼊synchronized代码块，造成不必要的同步开销
     * 2、如果创建对象失败，要这个时候才发现
     */
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;

    private IdGenerator() {
    }

    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
