package org.example.simple;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.simple
 * @className: MoniotyFactory
 * @author: zhen.wang
 * @description: 工厂
 * @date: 2023/9/13 10:05
 * @version: 1.0
 */
public class MonitorFactory implements IFactory {
    @Override
    public Monitor getMonitor(String monitorType) {
        if (monitorType == null) {
            return null;
        }
        if (monitorType.equalsIgnoreCase("oled")) {
            return new OLEDMonitor();
        } else if (monitorType.equalsIgnoreCase("esport")) {
            return new EsportMonitor();
        }
        return null;
    }
}
