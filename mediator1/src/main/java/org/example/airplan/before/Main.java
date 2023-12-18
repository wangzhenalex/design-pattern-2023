package org.example.airplan.before;

/**
 * @ClassName Main
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        AirPlan airPlan1 = new AirPlan("airPlan1");
        AirPlan airPlan2 = new AirPlan("airPlan2");
        AirPlan airPlan3 = new AirPlan("airPlan3");

        airPlan1.send("hello", airPlan2);
        airPlan1.send("hello", airPlan3);
        airPlan2.send("hello", airPlan3);
        airPlan2.send("hello", airPlan1);
        airPlan3.send("hello", airPlan1);
        airPlan3.send("hello", airPlan2);
    }
}
