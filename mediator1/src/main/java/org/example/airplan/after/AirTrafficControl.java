package org.example.airplan.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName AirTrafficControl
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class AirTrafficControl implements Mediator {
    private List<AirPlan> airPlans ;

    public AirTrafficControl() {
        this.airPlans = new ArrayList<>();
    }

    public void register(AirPlan airPlan) {
        this.airPlans.add(airPlan);
    }

    @Override
    public void send(String message, AirPlan sender) {
        for (AirPlan airPlan : airPlans) {
            if (airPlan != sender) {
                airPlan.receive(message);
            }
        }
    }
}
