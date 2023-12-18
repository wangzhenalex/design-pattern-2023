package org.example.airplan.after;

/**
 * @ClassName Tower
 * @Description 中介者
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public interface Mediator {
    void register(AirPlan airPlan);

    void send(String message, AirPlan receiver);
}
