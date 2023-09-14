package org.example;

/**
 * @projectName: Default (Template) Project
 * @package: org.example
 * @className: ${NAME}
 * @author: zhen.wang
 * @description: ${TODO}
 * @date: 2023/9/14 09:32
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}