package com.example.dutychain;

import java.util.Map;

/**
 * @projectName: design-pattern-2023
 * @package: main.java.com.example.dutychain
 * @className: ProceedHandler
 * @author: zhen.wang
 * @description: ProceedHandler
 * @date: 2023/10/22 11:04
 * @version: 1.0
 */
public class ProceedHandler extends AbstractHandler{
    @Override
    public void handle(Map<String, Object> request) {
        System.out.println("请求已被处理");
    }
}
