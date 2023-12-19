package org.example.airplan.after;

/**
 * @ClassName AirPlan
 * @Description 飞机
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public interface AirPlan {
    String  getName();

    void send(String message);

    void receive(String message,AirPlan sender);
}
