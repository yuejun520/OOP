package com.hbnu.array.day0920.classstudy;

/**
 * @author Luanhao
 * @date 2022年09月20日 10:54
 */
public class ReferenceCopy {
    public static void main(String[] args) {
        Test test = new Test(30);
        change(test);
        System.out.println(test.a + " main");
    }

    private static void change(Test test) {
        test.a *= 20;
        System.out.println(test.a + " change");
    }
}

class Test {
    int a;

    public Test(int a) {
        this.a = a;
    }
}
