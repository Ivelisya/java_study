package com.day03.test01;

public class TestWhile {
    public static void main(String[] args) {
        //功能:求和 1 + 2 + 3 +4 +5
        // int num1 = 1;
        // int num2 = 2;
        // int num3 = 3;
        // int num4 = 4;
        // int num5 = 5;
        // int sum = 0;
        // sum += num1;
        // sum += num2;
        // sum += num3;
        // sum += num4;
        // sum += num5;
        // System.out.println("1 + 2 + 3 + 4 + 5 = " + sum);
        // int num = 1;
        // int sum = 0;
        // 首先会判断<= 5这个表达式是否成立，如果成立就执行循环体
        // while(num <= 5){//如果表达式结果是true，那么就是死循环
        //     sum += num;
        //     num ++;
        // }
        // System.out.println("1 + 2 + 3 + 4 + 5 = " + sum);
        int sum = 0;
        for (int num = 1; num <= 5; num++) {
            sum += num;
        }
        System.out.println("1 + 2 + 3 + 4 + 5 = " + sum);
    }
}
