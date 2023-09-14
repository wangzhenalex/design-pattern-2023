package org.example.abstract1;

import org.example.abstract1.keyboard.Keyboard;
import org.example.abstract1.keyboard.MacKeyboard;
import org.example.abstract1.monitor.Monitor;
import org.example.abstract1.monitor.OLEDMonitor;
import org.example.abstract1.mouse.MacMouse;
import org.example.abstract1.mouse.Mouse;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.kit
 * @className: MacFactory
 * @author: zhen.wang
 * @description: mac电脑整机
 * @date: 2023/9/13 10:17
 * @version: 1.0
 */
public class MacFactory implements PCFactory {
    Monitor  monitor;
    Mouse mouse;
    Keyboard keyboard;

    public MacFactory() {
        this.monitor = new OLEDMonitor();
        this.mouse = new MacMouse();
        this.keyboard = new MacKeyboard();
    }

    @Override
    public void createPC() {
        System.out.println("mac整机");
        monitor.show();
        mouse.click();
        keyboard.input();
    }
}
