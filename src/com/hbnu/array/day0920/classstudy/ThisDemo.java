package com.hbnu.array.day0920.classstudy;

/**
 * @author Luanhao
 * @date 2022年09月20日 11:04
 */
public class ThisDemo {
    private String username;
    private int age;

    public ThisDemo() {
    }

    public ThisDemo(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public void say() {
        String username = "luanhao";
        System.out.println(this.username + "say username");
    }

    public static void main(String[] args) {
        ThisDemo thisDemo = new ThisDemo("zhangsan", 45);
        System.out.println(thisDemo.username + thisDemo.age);
        thisDemo.say();
    }
}
