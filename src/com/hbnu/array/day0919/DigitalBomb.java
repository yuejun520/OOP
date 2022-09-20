package com.hbnu.array.day0919;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Luanhao
 * @date 2022年09月20日 9:58
 */
public class DigitalBomb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

//        存储随机数 区间0-100
        int num = random.nextInt(100);

//        用户输入
        System.out.println("请输入您猜测的数字(0~100)：");
        int input = 0;

//        比较大小
        while (input != num) {
            input = sc.nextInt();
            if (input > num) {
                System.out.println("您输入过大，请重新输入!!!");
            } else if (input < num){
                System.out.println("您输入过小，请重新输入!!!");
            } else {
                System.out.println("恭喜你猜对了!!!");
            }
        }

    }
}
