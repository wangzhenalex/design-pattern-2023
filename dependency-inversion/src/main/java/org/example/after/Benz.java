package org.example.after;

/**
 * @ClassName BMW
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class Benz implements CarManufactory {
    @Override
    public void rent(String model) {
        System.out.println("租了一辆"+model+"奔驰");
    }
}
