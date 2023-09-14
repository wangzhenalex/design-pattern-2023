package org.example.enum1;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.enum1
 * @className: IdGenerator
 * @author: zhen.wang
 * @description: IdGenerator
 * @date: 2023/9/13 21:42
 * @version: 1.0
 */
public enum IdGenerator {
    INSTANCE,
    INSTANCE2,
    ;
    private AtomicLong id = new AtomicLong(0);
    public long getId() {
        return id.incrementAndGet();
    }
}
