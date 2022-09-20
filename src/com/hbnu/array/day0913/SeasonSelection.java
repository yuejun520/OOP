package com.hbnu.array.day0913;

import java.util.Scanner;

/**
 * @author Luanhao
 * @date 2022年09月13日 15:37
 */
public class SeasonSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("您的输入有误!!!");
        }
    }
}
