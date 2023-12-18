package org.example;

/**
 * @ClassName ${NAME}
 * @Description ${TODO}
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class MainRule1 {
    public static void main(String[] args) {
        /**
         * 1、子类必需完全实现父类的抽象方法，但不能覆盖父类的非抽象方法
         */
        Calculate1 c1 = new Calculate1();
        SuperCalculate1 c2 = new SuperCalculate1();
        int sum1 = c1.calculate(5, 10);
        System.out.println(sum1);
        int sum2 = c2.calculate(5, 10);
        System.out.println(sum2);
    }
}

class Calculate1 {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class SuperCalculate1 extends Calculate1 {
    public int calculate(int a, int b) {
        return a - b;
    }
}