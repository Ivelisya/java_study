package com.day01.test01;

public class TestOpe {
    public static void main(String[] args) {
//        算术运算符
//        加号：作用
//        1.表示正数 2.表示相加操作 3.字符串拼接
        System.out.println(+10);//表示正数
        System.out.println(10 + 20);//表示相加操作
        int num = 10;
        System.out.println("输出一个数"+num);//字符串拼接
        System.out.println(5 + 6 + "abc");
        System.out.println("abc" + 5 + 6);//字符串拼接
//        只要+左右两侧任意一侧是字符串类型，结果就是字符串拼接 结果就一定是字符串类型
        //++ 自增
        int a = 5;
        a++;
        System.out.println("===================");
        System.out.println(a);//6
        ++a;
        System.out.println(a);//6
//        如果自增参与到表达式中 如果++在后面 先运算再 a+1
        a = 5;
        int m = a++ + 7;
        System.out.println(a);
        System.out.println(m);
        a = 5;
        int n  = ++a + 7;
        System.out.println(a);
        System.out.println(n);
    }
}
