package org.example;

/**
 * @ClassName MainRule4
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class MainRule4 {
    public static void main(String[] args) {
        /**
         * 4、子类的实力可以替换任何父类的实力，但反之不成立
         */
        Calculate4 calculate4 = new Calculate4();
        SuperCalculate4 superCalculate4 = new SuperCalculate4();
        int x =1,y=2;
        int addResult = calculate4.calculate(x,y);
        int addResult2 = superCalculate4.calculate(x,y);
        System.out.println(addResult);
        System.out.println(addResult2);

        int subtractResult = superCalculate4.subtract(x,y);
        System.out.println(subtractResult);
    }
}

class Calculate4 {
    public int calculate(int a, int b) {
        return a + b;
    }
}


class SuperCalculate4 extends Calculate4 {
    public int subtract(int a, int b) {
        return a - b;
    }
}