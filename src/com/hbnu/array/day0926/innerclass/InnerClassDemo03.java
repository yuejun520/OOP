package com.hbnu.array.day0926.innerclass;

/**
 * @author Luanhao
 * @date 2022年10月04日 10:20
 */
public class InnerClassDemo03 {

    private String username;

    public InnerClassDemo03(String username) {
        this.username = username;
    }

    public class InnerClass {

        private String username;

        public InnerClass(String username) {
            this.username = username;
        }

        public void innerMethod(String username) {
//            1、访问内部类局部变量username
            System.out.println("内部类局部变量username" + username);
//            2、访问内部类成员变量username
            System.out.println("内部类局部变量username" + this.username);
//            3、访问外部成员变量username
            System.out.println("内部类局部变量username" + InnerClassDemo03.this.username);
        }
    }

        public static void main(String[] args) {
            InnerClassDemo03 outClassObject = new InnerClassDemo03("ABC");
            InnerClass innerClassObject = outClassObject.new InnerClass("DEF");
            innerClassObject.innerMethod("GHI");
        }
}
