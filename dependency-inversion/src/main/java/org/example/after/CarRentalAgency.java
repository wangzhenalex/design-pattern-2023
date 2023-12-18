package org.example.after;

/**
 * @ClassName CarRentalAgency
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class CarRentalAgency {
    public void rentCar(CarManufactory carManufactory, String Model){
        carManufactory.rent(Model);
    }
}
