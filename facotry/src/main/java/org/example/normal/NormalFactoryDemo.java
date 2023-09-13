package org.example.normal;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.normal
 * @className: NormalFactoryDemo
 * @author: zhen.wang
 * @description:
 * @date: 2023/9/13 09:18
 * @version: 1.0
 */
public class NormalFactoryDemo {
    public static void main(String[] args) {
        IFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.getInstance();
        circle.draw();

        IFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.getInstance();
        rectangle.draw();

        IFactory squareFactory = new SquareFactory();
        Shape square = squareFactory.getInstance();
        square.draw();
    }
}
