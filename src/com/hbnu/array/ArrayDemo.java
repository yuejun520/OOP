package com.hbnu.array;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
//        1、创建键盘输入对象
        Scanner scanner = new Scanner(System.in);

//        2、定义数组，用于存放磁盘输入的数据
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = scanner.nextInt();
        }

//        3、将数组中的元素输出到控制台
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}