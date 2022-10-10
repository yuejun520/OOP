package com.hbnu.array.day0920.classstudy;

/**
 * @author Luanhao
 * @date 2022年09月20日 10:43
 */
public class PassParameters {
    public static void main(String[] args) {
        int a = 10;
        change(a);
        System.out.println(a + " main");
    }

    private static void change(int a) {
        a += 20;
        System.out.println(a + " change");
    }
}
