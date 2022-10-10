package com.hbnu.array.day1004.Login;

import java.util.Scanner;

/**
 * @author Luanhao
 * @date 2022年10月04日 10:55
 */
public class LoginThree {
    private static int COUNT = 3;

    public static void main(String[] args) {
        User userDb = new User("luanhao", "admin");

        Scanner sc = new Scanner(System.in);
        String username = null;
        String password = null;
        int index = 0;

        while (index < COUNT) {
            System.out.print("请输入用户名：");
            username = sc.next();
            System.out.print("请输入密码：");
            password = sc.next();

            User user = new User(username, password);

            if (userDb.equals(user)) {
                System.out.println("欢迎用户" + username + "登录系统");
                break;
            } else {
                System.out.println("您输入的有误，请重新输入!!!");
                index++;
            }
        }

        if (index == COUNT) {
            System.out.println("您输入的次数大于系统规定次数!!!");
        }
    }
}
