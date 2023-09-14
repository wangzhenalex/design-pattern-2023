package org.example.abstract1;

import org.example.abstract1.keyboard.Keyboard;
import org.example.abstract1.monitor.Monitor;
import org.example.abstract1.mouse.Mouse;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.kit
 * @className: IHarrdware
 * @author: zhen.wang
 * @description: 整机
 * @date: 2023/9/13 10:16
 * @version: 1.0
 */
public interface PCFactory {
    void createPC();

}
