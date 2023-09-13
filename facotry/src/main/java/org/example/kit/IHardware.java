package org.example.kit;

import org.example.kit.keyboard.Keyboard;
import org.example.kit.monitor.Monitor;
import org.example.kit.mouse.Mouse;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.kit
 * @className: IHarrdware
 * @author: zhen.wang
 * @description: 整机
 * @date: 2023/9/13 10:16
 * @version: 1.0
 */
public interface IHardware {
    Mouse getMouse();
    Keyboard getKeyboard();
    Monitor getMonitor();

    //... 组合其他硬件
}
