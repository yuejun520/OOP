package com.hbnu.array.day0926.innerclass;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * 格式
 *
 * @author Luanhao
 * @date 2022年09月26日 16:30
 */
public class InnerClassDemo01 {

    private String username;

    public InnerClassDemo01() {
    }

    public InnerClassDemo01(String username) {
        this.username = username;
    }

    public void OuterClassMethod() {
        InnerClassA innerClassA = new InnerClassA(18);
        System.out.println(innerClassA.age);
    }


    private class InnerClassA {
        private int age;

        public InnerClassA() {
        }

        public InnerClassA(int age) {
            this.age = age;
        }

        public void InnerClassAMethodA() {
            System.out.println(username);
            OuterClassMethod();
        }
    }

    public static class InnerclassB {

    }

    public void OuterClassMethodA() {

    }

    public static void main(String[] args) {
    }
}
