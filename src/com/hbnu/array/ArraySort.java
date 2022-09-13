package com.hbnu.array;

import java.util.Scanner;

/**
 * 从键盘输入5个整数，并存入数组中，然后按从小到大的顺序对数组中的元素进行排序，最后输出到控制台
 *
 * @author Luanhao
 * @date 2022年09月13日 10:05
 */
public class ArraySort {
    public static void main(String[] args) {
//        1、创建键盘输入对象
        Scanner scanner = new Scanner(System.in);

//        2、定义数组，用于存放键盘输入的数据
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

//        打印排序前的数组元素
        System.out.println("排序前的数据：");
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.println(nums[i]);
            } else {
                System.out.print(nums[i] + " ");
            }
        }

//        3、对数组中的元素进行排序(冒泡排序)
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

//        4、打印排序后的数组元素
        System.out.println("排序后的数据：");
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.println(nums[i]);
            } else {
                System.out.print(nums[i] + " ");
            }
        }
    }
}
