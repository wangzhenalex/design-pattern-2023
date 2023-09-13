package org.example.normal;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.normal
 * @className: SquareFactory
 * @author: zhen.wang
 * @description: Square-Factory
 * @date: 2023/9/13 09:17
 * @version: 1.0
 */
public class SquareFactory implements IFactory{
    @Override
    public Shape getInstance() {
        return new  Square();
    }
}
