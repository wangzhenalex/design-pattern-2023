package org.example.normal;

import org.example.simple.Monitor;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.normal
 * @className: MonitoryFactoryMain
 * @author: zhen.wang
 * @description:
 * @date: 2023/9/13 10:09
 * @version: 1.0
 */
public class MonitoryFactoryMain {
    public static void main(String[] args) {
        IFactory factory = new EsportMonitorFactory();
        Monitor monitor = factory.getMonitor();
        monitor.show();


        IFactory factory1 = new OLEDMonitorFactory();
        Monitor monitor1 = factory1.getMonitor();
        monitor1.show();
    }
}
