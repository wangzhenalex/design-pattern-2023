package org.example.abstract1.monitor;


/**
 * @projectName: design-pattern-2023
 * @package: org.example.simple
 * @className: EsportMonitor
 * @author: zhen.wang
 * @description: 电竞显示屏
 * @date: 2023/9/13 10:04
 * @version: 1.0
 */
public class EsportMonitor implements Monitor {
    @Override
    public void show() {
        System.out.println("高刷新率、低延迟");
    }
}
