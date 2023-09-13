package org.example.normal;

/**
 * @projectName: design-pattern-2023
 * @package: org.example.normal
 * @className: CircleFacotry
 * @author: zhen.wang
 * @description: 矩形工厂
 * @date: 2023/9/13 09:16
 * @version: 1.0
 */
public class RectangleFactory implements IFactory{
    @Override
    public Shape getInstance() {
        return new Rectangle();
    }
}
