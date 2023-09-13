package org.example.kit;

import org.example.kit.keyboard.Keyboard;
import org.example.kit.keyboard.MacKeyboard;
import org.example.kit.monitor.Monitor;
import org.example.kit.monitor.OLEDMonitor;
import org.example.kit.mouse.MacMouse;
import org.example.kit.mouse.Mouse;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.kit
 * @className: MacFactory
 * @author: zhen.wang
 * @description: mac电脑整机声场
 * @date: 2023/9/13 10:17
 * @version: 1.0
 */
public class MacFactory implements IHardware{
    @Override
    public Mouse getMouse() {
        return new MacMouse();
    }

    @Override
    public Keyboard getKeyboard() {
        return new MacKeyboard();
    }

    @Override
    public Monitor getMonitor() {
        return new OLEDMonitor();
    }
}
