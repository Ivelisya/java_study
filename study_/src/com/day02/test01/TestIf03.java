package com.day02.test01;

public class TestIf03 {
    public static void main(String[] args) {
        //需求:判断学生成绩的等级
        int score = 98;
        //判定
        if (score > 90) System.out.println("a级");
        else if (score > 80) System.out.println("b级");
        else if (score > 70) System.out.println("c级");
        else if (score > 60) System.out.println("d级");
        else System.out.println("e级");
    }
}
