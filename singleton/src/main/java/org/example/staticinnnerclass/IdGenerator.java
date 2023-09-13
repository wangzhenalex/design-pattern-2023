package org.example.staticinnnerclass;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.staticinternalclass
 * @className: IdGenerator
 * @author: zhen.wang
 * @description: IdGenerator
 * @date: 2023/9/13 21:31
 * @version: 1.0
 */
public class IdGenerator {
    /**
     * 第一次加载 Singleton 类时并不会初始化 instance
     */
    private AtomicLong id = new AtomicLong(0);
    private IdGenerator() {}
    private static class SingletonHolder{
        private static final IdGenerator instance = new IdGenerator();
    }

    /**
     * 第一次调用 getInstance 方法时会导致虚拟机加载 Instance 类，
     * 这种方式不仅能保证线程安全，也能够保证单例对象唯一，同时也延迟了单例的实例化。
     * @return
     */
    public static IdGenerator getInstance() {
        return SingletonHolder.instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
