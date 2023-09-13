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
