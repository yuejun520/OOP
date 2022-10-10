package com.hbnu.array.day1004.Sort;

import java.util.Scanner;

/**
 * @author Luanhao
 * @date 2022年10月04日 11:38
 */
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DefaultString destr = new DefaultString();

        String str = null;
        String[] temp;
        String space = "\\s+";

        System.out.print("请输入字符串：");
        str = sc.nextLine();

        temp = str.split(space);


        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = 0; j < temp.length - i - 1; j++) {
                destr.setOldstr(temp[j]);
                destr.setNewstr(temp[j + 1]);
                destr.sort();
                temp[j] = destr.getOldstr();
                temp[j + 1] = destr.getNewstr();
            }
        }

        System.out.print("排序后的字符串为:");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            stringBuilder.append(temp[i] + " ");
        }
        str = String.valueOf(stringBuilder);
        str = str.trim();
        System.out.println(str);


    }
}
