package org.example.airplan.after;

/**
 * @ClassName AirPlan
 * @Description 飞机
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class AirPlan1 implements AirPlan{
    private String name;
    private Mediator mediator;

    public AirPlan1(String name,Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " send message: " + message);
        mediator.send(message, this);

    }
    @Override
    public void receive(String message) {
        System.out.println(this.name + " receive message: " + message );
    }
}
