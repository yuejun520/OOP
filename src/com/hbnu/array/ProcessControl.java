package com.hbnu.array;

import java.util.Scanner;

/**
 * @author Luanhao
 * @date 2022年09月13日 15:06
 */
public class ProcessControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入男方条件");
        System.out.print("身高(cm)：");
        int height = scanner.nextInt();
        System.out.print("财富：");
        double money = scanner.nextDouble();
        System.out.print("是否帅气(y/n):");
        String handsome = scanner.next();

        if (height > 180 && money > 10000000 && handsome.equals("y")) {
            System.out.println("我一定要嫁给他!!!");
        } else if (height > 180 || money > 10000000 || handsome.equals("y")) {
            System.out.println("嫁吧，比上不足，比下有余。");
        } else {
            System.out.println("不嫁!");
        }
    }
}
