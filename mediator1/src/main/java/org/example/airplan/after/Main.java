package org.example.airplan.after;

/**
 * @ClassName Main
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Mediator mediator = new AirTrafficControl();
        AirPlan airPlan1 = new AirPlan1("airPlan1", mediator);
        AirPlan airPlan2 = new AirPlan1("airPlan2", mediator);
        AirPlan airPlan3 = new AirPlan1("airPlan3", mediator);

        mediator.register(airPlan1);
        mediator.register(airPlan2);
        mediator.register(airPlan3);

        mediator.send("hello", airPlan1);
        mediator.send("hello", airPlan2);
        mediator.send("hello", airPlan3);
    }
}
