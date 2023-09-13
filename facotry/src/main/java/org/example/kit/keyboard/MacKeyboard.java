package org.example.kit.keyboard;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.kit.keyboard
 * @className: MacKeyboard
 * @author: zhen.wang
 * @description: mac专用
 * @date: 2023/9/13 10:19
 * @version: 1.0
 */
public class MacKeyboard implements Keyboard{
    @Override
    public void input() {
        System.out.println("mac键盘");
    }
}
