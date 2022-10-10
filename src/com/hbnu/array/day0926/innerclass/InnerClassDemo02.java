package com.hbnu.array.day0926.innerclass;

/**
 * 访问
 *
 * @author Luanhao
 * @date 2022年09月26日 17:23
 */
public class InnerClassDemo02 {
    private String username;

    public class InnerClass {
        public void show() {
            username = "栾皓"; //内部类访问外部类成员，可以直接访问
            System.out.println(username);
        }
    }
    public void method() {
        InnerClass innerClass = new InnerClass();
        innerClass.show();//外部类访问内部类成员必须通过内部类成员实现
    }

    public static void main(String[] args) {
        InnerClassDemo02 innerClassDemo02 = new InnerClassDemo02();
        innerClassDemo02.method();
    }
}
