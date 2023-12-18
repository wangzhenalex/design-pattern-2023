package org.example.before;

/**
 * @ClassName BadCharacterSkill
 * @Description 怪物技能
 * @Author zhenwang
 * @Date 12/18/23
 * @Version 1.0
 */
public interface BadCharacterSkill {
    /**
     * 基础攻击
     */
    void basicAttach();


    /**
     * 需求变更引入的两个新的技能
     */
    void magicAttach();

    void recover();
}
