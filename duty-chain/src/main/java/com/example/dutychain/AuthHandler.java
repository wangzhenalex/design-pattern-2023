package com.example.dutychain;

import java.util.Map;

/**
 * @projectName: design-pattern-2023
 * @package: main.java.com.example.dutychain
 * @className: AuthHandler
 * @author: zhen.wang
 * @description:
 * @date: 2023/10/22 11:01
 * @version: 1.0
 */
public class AuthHandler extends AbstractHandler {
    @Override
    public void handle(Map<String, Object> request) {
        if (!request.get("username").equals("admin") || !request.get("password").equals("admin")) {
            throw new RuntimeException("用户名或密码错误");
        }

        System.out.println("用户信息认证通过");
        if (this.getNext() == null) {
            throw new RuntimeException("请求没有被送达ProceedHandler");
        }

        this.getNext().handle(request);
    }
}
