package com.hbnu.array.day0919;

import java.util.Scanner;

/**
 * @author Luanhao
 * @date 2022年09月20日 10:23
 */
public class RoundTableGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        获取人数
        System.out.println("请输入参与游戏的人数：");
        int num = sc.nextInt();

//        根据人数创建相应长度的数组，并全部置1，表示存活
        int[] queue = new int[num];
        for (int i = 0; i < queue.length; i++) {
            queue[i] = 1;
        }

        System.out.println("请输入开始报数的序号：");
        int ser = sc.nextInt();

        System.out.println("请输入要淘汰的数：");
        int out = sc.nextInt();
        int index = 0;

        while (num != 1) {//当剩余人数为一时，游戏结束
            for (int i = ser - 1; i < queue.length; i++) {//设置从下标为ser-1的成员开始报数
                if (queue[i] == 1) {//若未淘汰，则报数加一
                    index++;
                }
                if (index == out) {
                    queue[i] = 0;//若报数与淘汰数相同，成员变量置0，表淘汰
                    num--;//剩余游戏成员减一
                    index = 0;//报数重新从0开始
                }
                if (num == 1) {
                    break;
                }
                ser = 1;
            }
        }
        System.out.println("最后的赢家是：");
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == 1) {
                i++;
                System.out.println("第" + i + "位同学");
                break;
            }
        }
    }
}
