package org.example.abstract1;

import org.example.abstract1.keyboard.Keyboard;
import org.example.abstract1.monitor.Monitor;
import org.example.abstract1.mouse.Mouse;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.kit
 * @className: AbstractFactoryDemo
 * @author: zhen.wang
 * @description:
 * @date: 2023/9/13 10:22
 * @version: 1.0
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        PCFactory pcFactory = new MacFactory();
        pcFactory.createPC();
    }
}
