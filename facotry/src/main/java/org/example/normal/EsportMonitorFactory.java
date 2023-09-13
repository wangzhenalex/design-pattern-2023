package org.example.normal;

import org.example.simple.Monitor;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.normal
 * @className: EsportMonitorFactory
 * @author: zhen.wang
 * @description: 电竞显示屏工厂
 * @date: 2023/9/13 10:07
 * @version: 1.0
 */
public class EsportMonitorFactory implements IFactory{
    @Override
    public Monitor getMonitor() {
        return new  EsportMonitor();
    }
}
