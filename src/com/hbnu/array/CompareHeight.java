package com.hbnu.array;

/**
 * @author Luanhao
 * @date 2022年09月13日 14:45
 */
public class CompareHeight {
    public static void main(String[] args) {
        int a = 210;
        int b = 165;
        int c = 150;
        int max = a>b?a:b>c?b:c;

        System.out.println("身高最高的是：" + max);
    }
}
