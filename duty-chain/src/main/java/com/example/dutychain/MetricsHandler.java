package com.example.dutychain;

import java.util.Map;

/**
 * @projectName: design-pattern-2023
 * @package: main.java.com.example.dutychain
 * @className: MetricsHandler
 * @author: zhen.wang
 * @description: MetricsHandler
 * @date: 2023/10/22 11:03
 * @version: 1.0
 */
public class MetricsHandler extends AbstractHandler {
    @Override
    public void handle(Map<String, Object> request) {
        System.out.println("已将当前请求转存至ES缓存");

        if (this.getNext() == null) {
            throw new RuntimeException("请求没有被送达ProceedHandler");
        }
        this.getNext().handle(request);
    }
}
