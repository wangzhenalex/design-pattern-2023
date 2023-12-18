package org.example.after;

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
        carRentalAgency.rentCar(new Benz(),"GLC");
        carRentalAgency.rentCar(new BMW(),"X5");

        //扩展
        carRentalAgency.rentCar(new Audit(),"A8");
    }
}