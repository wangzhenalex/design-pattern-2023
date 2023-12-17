package org.example.before;

/**
 * @ClassName ${NAME}
 * @Description ${TODO}
 * @Author zhenwang
 * @Date 12/17/23
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        //shop
        Shop shop = new Shop();
        //顾客
        Customer alex = new Customer();
        //购买物品
        shop.sale(alex, 100);

        /**
         * 迪米特法则：只和直接的朋友通信
         * org.example.Shop#sale(org.example.Customer, int) 获取了Customer的Card对象
         * Card 是Customer的直接朋友，不是Shop的直接朋友,
         * 因此，Shop不应该知道Card的存在，Shop和Card都应该与Customer直接通信
         */
    }
}
