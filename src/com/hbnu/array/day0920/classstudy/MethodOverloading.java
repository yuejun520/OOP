package com.hbnu.array.day0920.classstudy;

/**
 * 方法重载：同一个类中，方法名相同，方法的参数列表不同
 *  参数列表不同：
 *  1、顺序不同。
 *  2、个数不同。
 *  3、类型不同。
 *
 * @author Luanhao
 * @date 2022年09月20日 10:25
 */
public class MethodOverloading {
    public float sum (int a, float b) {
        return a + b;
    }

//    类型不同
    public int sum (int a, int b) {
        return a + b;
    }

//    顺序不同
    public float sum (float a, int b) {
        return a + b;
    }

//    个数不同
    public float sun (int a, float b, float c) {
        return a + b + c;
    }
}
