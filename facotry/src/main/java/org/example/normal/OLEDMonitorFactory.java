package org.example.normal;

import org.example.simple.Monitor;
import org.example.simple.OLEDMonitor;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.normal
 * @className: OLEDMonitorFactory
 * @author: zhen.wang
 * @description: oled显示屏工厂
 * @date: 2023/9/13 10:07
 * @version: 1.0
 */
public class OLEDMonitorFactory  implements IFactory{
    @Override
    public Monitor getMonitor() {
        return new OLEDMonitor();
    }
}
