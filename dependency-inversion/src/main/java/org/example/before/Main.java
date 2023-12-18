package org.example.before;

/**
 * @ClassName ${NAME}
 * @Description ${TODO}
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {

        CarRentalAgency carRentalAgency = new CarRentalAgency();
        carRentalAgency.rentBenz("Benz","GLC");
        carRentalAgency.rentBenz("BMW","X5");
    }
}