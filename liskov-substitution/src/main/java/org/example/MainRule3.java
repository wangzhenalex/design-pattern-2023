package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MainRule3
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class MainRule3 {
    public static void main(String[] args) {
        /**
         * 3、当子类的方法实现父类的抽象方法时，方法的后置条件要比父类更严格
         */
        StringProcessor.string2List(new SuperCalculator(),"123");
    }
}
abstract class Calculator {
    abstract ArrayList<String> string2List(String str);
}

class SuperCalculator extends Calculator {
    @Override
    ArrayList<String> string2List(String str) {
        return null;
    }
//    List<String> string2List(String str) {
//        // do something
//        return null;
//    }
}

 class StringProcessor {
    public static ArrayList<String> string2List(Calculator c,String str) {
        return c.string2List(str);
    }
}