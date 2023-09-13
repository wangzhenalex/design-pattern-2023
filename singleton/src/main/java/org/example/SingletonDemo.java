package org.example;


import org.example.enum1.IdGenerator;

/**
 * @projectName: design-pattern-2023
 * @package: org.example
 * @className: SingletonDemo
 * @author: zhen.wang
 * @description:
 * @date: 2023/9/13 21:42
 * @version: 1.0
 */
public class SingletonDemo {
    public static void main(String[] args) {
        // 饿汉式
        org.example.hungry.IdGenerator instanceHungry = org.example.hungry.IdGenerator.getInstance();
        System.out.println(instanceHungry.getId());

        // 懒汉式
        org.example.lazy.IdGenerator instanceLazy = org.example.lazy.IdGenerator.getInstance();
        System.out.println(instanceLazy.getId());

        // 双重检查
        org.example.doublecheck.IdGenerator instanceDoubleCheck = org.example.doublecheck.IdGenerator.getInstance();
        System.out.println(instanceDoubleCheck.getId());


        // 静态内部类
        org.example.staticinnnerclass.IdGenerator instanceStaticInnerClass = org.example.staticinnnerclass.IdGenerator.getInstance();
        System.out.println(instanceStaticInnerClass.getId());

        // 枚举
        System.out.println(IdGenerator.INSTANCE.getId());
    }
}
