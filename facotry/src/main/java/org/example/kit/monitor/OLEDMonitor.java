package org.example.kit.monitor;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.simple
 * @className: OLEDMonitor
 * @author: zhen.wang
 * @description: oled
 * @date: 2023/9/13 10:01
 * @version: 1.0
 */
public class OLEDMonitor implements Monitor {
    @Override
    public void show() {
        System.out.println("更轻薄、能耗低、亮度高、发光率好、可以显示纯黑色，并且还可以做到弯曲");
    }
}
