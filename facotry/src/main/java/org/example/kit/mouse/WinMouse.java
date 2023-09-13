package org.example.kit.mouse;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.kit.mouse
 * @className: MacMouse
 * @author: zhen.wang
 * @description:
 * @date: 2023/9/13 10:20
 * @version: 1.0
 */
public class WinMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("win鼠标");
    }
}
