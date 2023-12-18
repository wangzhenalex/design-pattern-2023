package org.example.airplan.before;

/**
 * @ClassName AirPlan
 * @Description 飞机
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class AirPlan {
    private String name;

    public AirPlan(String name) {
        this.name = name;
    }

    public void send(String message,AirPlan receiver) {
        System.out.println(this.name + " send message: " + message + " to " + receiver.name);

    }

    public void receive(String message,AirPlan sender) {
        System.out.println(this.name + " receive message: " + message + " from " + sender.name);
    }

    public String getName() {
        return this.name;
    }
}
