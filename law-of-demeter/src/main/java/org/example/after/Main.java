package org.example.after;

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
        Shop shop2 = new Shop();
        //顾客
        Customer alex = new Customer();
        //购买物品
        shop2.sale(alex, 100f);

        /**
         * 迪米特法则：只和直接的朋友通信
         *
         * 都着急和Customer 通信
         */
    }
}
