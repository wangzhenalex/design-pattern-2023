package org.example.before;

/**
 * @ClassName Monster
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class Monster implements BadCharacterSkill {
    @Override
    public void basicAttach() {
        System.out.println("基础攻击");
    }

    @Override
    public void magicAttach() {

    }

    @Override
    public void recover() {

    }
}
