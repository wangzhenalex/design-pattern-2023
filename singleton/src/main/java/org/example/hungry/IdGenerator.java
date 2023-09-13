package org.example.hungry;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.hungry
 * @className: IdGenerator
 * @author: zhen.wang
 * @description: IdGenerator
 * @date: 2023/9/13 21:18
 * @version: 1.0
 */
public class IdGenerator {
    /**
     * 优点：
     * 1、在类加载的期间，就已经将 instance 静态实例初始化好了，所以，instance 实例的创建是线程安全的
     * 2、符合fail-fast的设计原则，及早暴露问题
     *
     * 缺点：
     * 1、不支持延迟加载实例。
     * 2、在类加载的期间，就初始化实例，占用空间。
     */
    private AtomicLong id = new AtomicLong(0);
    private static final IdGenerator instance = new IdGenerator();
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
