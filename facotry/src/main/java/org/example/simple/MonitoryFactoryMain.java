package org.example.simple;


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
        MonitorFactory factory = new MonitorFactory();
        Monitor monitor = factory.getMonitor("esport");
        monitor.show();
    }
}
