package org.example.kit;

import org.example.kit.keyboard.Keyboard;
import org.example.kit.monitor.Monitor;
import org.example.kit.mouse.Mouse;

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
        IHardware macFactory = new MacFactory();
        Keyboard keyboard = macFactory.getKeyboard();
        keyboard.input();   //Mac 专用键盘
        Mouse mouse = macFactory.getMouse();
        mouse.click();     //Mac 专用鼠标
        Monitor monitor = macFactory.getMonitor();
        monitor.show();     //mac 显示器

        IHardware winFactory = new MacFactory();
        Keyboard keyboard1 = winFactory.getKeyboard();
        keyboard.input();   //win 专用键盘
        Mouse mouse1 = winFactory.getMouse();
        mouse1.click();     //win 专用鼠标
        Monitor monitor1 = winFactory.getMonitor();
        monitor1.show();     //win 显示器
    }
}
