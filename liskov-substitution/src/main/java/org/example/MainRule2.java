package org.example;

/**
 * @ClassName ${NAME}
 * @Description ${TODO}
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class MainRule2 {
    public static void main(String[] args) {
        /**
         * 2、子类可以实现自己特有的方法
         */
        Calculate2 c1 = new Calculate2();
        SuperCalculate2 c2 = new SuperCalculate2();
        int sum1 = c1.calculate(5, 10);
        System.out.println(sum1);
        int sum2 = c2.calculate(5, 10);
        System.out.println(sum2);
        int subtract = c2.subtract(5, 10);
        System.out.println(subtract);
    }
}

class Calculate2 {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class SuperCalculate2  extends Calculate2{
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
}