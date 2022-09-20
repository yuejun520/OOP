package com.hbnu.array.day0913;

import java.util.Scanner;

/**
 * 键盘录入数据，要求数据是六位数，对数据进行加密
 * 加密规则如下：
 * 1、每位数字都加5
 * 2、加上5然后取余10
 * 3、再将第一位和第六位交换,第二位和第五位交换,第三位和第四位交换
 * 4、输出加密后的数据
 *
 * @author Luanhao
 * @date 2022年09月13日 10:41
 */
public class ArrayDataEncryption {
    public static void main(String[] args) {
//        1、创建键盘输入对象
        Scanner scanner = new Scanner(System.in);

//        2、存储数据
        int[] datas = new int[6];
        int data;
        do {
            System.out.println("请输入加密前的数据(六位数)：");
            data = scanner.nextInt();
        } while (data < 100000 || data > 999999);
        for (int i = datas.length - 1; i >= 0; i--) {
            datas[i] = data % 10;
            data /= 10;
        }

//        3、各位数字加5取余
        for (int i = 0; i < datas.length; i++) {
            datas[i] += 5;
            datas[i] %= 10;
        }

//        4、16互换，25互换，34互换
        int temp;
        for (int i = 0, j = datas.length-1; i < j; i++,j--) {
            temp = datas[i];
            datas[i] = datas[j];
            datas[j] = temp;
        }

//        5、输出加密后的数据
        for (int i = 0; i < datas.length; i++) {
            System.out.print(datas[i]);
        }
    }
}
