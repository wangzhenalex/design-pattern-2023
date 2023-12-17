package org.example;

/**
 * @ClassName ${NAME}
 * @Description ${TODO}
 * @Author zhenwang
 * @Date 12/17/23
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
       Shop shop = new Shop();
        Customer alex = new Customer();
        shop.sale(alex, 100);
    }


}