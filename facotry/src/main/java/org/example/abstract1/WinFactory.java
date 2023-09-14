package org.example.abstract1;

import org.example.abstract1.keyboard.Keyboard;
import org.example.abstract1.keyboard.WinKeyboard;
import org.example.abstract1.monitor.EsportMonitor;
import org.example.abstract1.monitor.Monitor;
import org.example.abstract1.mouse.Mouse;
import org.example.abstract1.mouse.WinMouse;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.kit
 * @className: MacFactory
 * @author: zhen.wang
 * @description: mac电脑整机声场
 * @date: 2023/9/13 10:17
 * @version: 1.0
 */
public class WinFactory implements PCFactory {
    Monitor monitor;
    Mouse mouse;
    Keyboard keyboard;

    public WinFactory() {
        this.monitor = new EsportMonitor();
        this.mouse = new WinMouse();
        this.keyboard = new WinKeyboard();
    }

    @Override
    public void createPC() {
        System.out.println("win整机");
        monitor.show();
        mouse.click();
        keyboard.input();
    }
}
