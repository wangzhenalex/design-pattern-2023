package org.example.kit;

import org.example.kit.keyboard.Keyboard;
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

        IHardware winFactory = new WinFactory();
        Mouse mouse = winFactory.getMouse();
        mouse.click();  //win 专用鼠标
 
    }
}
