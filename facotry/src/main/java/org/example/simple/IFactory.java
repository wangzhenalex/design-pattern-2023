package org.example.simple;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.simple
 * @className: IFactory
 * @author: zhen.wang
 * @description:
 * @date: 2023/9/13 10:08
 * @version: 1.0
 */
public interface IFactory {
    Monitor getMonitor(String monitorType);
}
