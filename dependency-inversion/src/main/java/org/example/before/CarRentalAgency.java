package org.example.before;

/**
 * @ClassName CarRentalAgency
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class CarRentalAgency {
    public void rentBenz(String brand,String Model){
        if(brand.equals("Benz")){
            new Benz().rentBenz(Model);
        }else if(brand.equals("BMW")){
            new BMW().rentBMW(Model);
        }else if(brand.equals("Audit")){
            //扩展性不好，如果新增一个品牌，就需要修改这个类
            //new BMW().rentBMW(Model);
        }
    }
}
