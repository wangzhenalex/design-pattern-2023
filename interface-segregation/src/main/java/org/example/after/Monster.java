package org.example.after;

/**
 * @ClassName Monster
 * @Description
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public class Monster implements BasicBadCharacterSkill{
    @Override
    public void basicAttach() {
        System.out.println("基础攻击");
    }
}
