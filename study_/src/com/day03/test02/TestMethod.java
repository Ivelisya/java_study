package com.day03.test02;

public class TestMethod {
    //将一些重复的代码片段进行提取 提取一个方法 将两个数求和
    public static int addNum(int num1, int num2) {
        //求和:
        int sum = num1 + num2;
        return sum;
    }

    public static void addNum2(int num1, int num2, int num3) {
        //求和:
        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);
    }

    //提高方法的复用性
    public static void main(String[] args) {
        //10,20
        int sum = addNum(10, 20);
        System.out.println("10 + 20 = " + sum);

        //30，50
        int sum1 = addNum(30, 50);
        System.out.println("30 + 50 = " + sum1);

        //40 82
        System.out.println(addNum(40, 82));

        addNum2(10, 20, 30);
    }
}
/*
1.方法的作用:提高代码的复用性，写一次，你需要的时候直接去调用
2.细节
public static 方法的修饰符
int 方法的返回值类型 ->方法的返回值对应的数据类型
addNum 方法名 要求见名知意
int num1,int num2 形式参数列表 按照实际需求去定义即可
return sum 方法的最后一行可以有方法的返回值 return加方法的返回值
如果方法没有返回值 那么可以在方法的声明处直接使用void操作

方法是否需要返回值 按照实际需要来走
方法就是一段用来完成特定功能的代码片段

方法名可以重载 参数不同构成重载
方法的重载 只和方法名和形参列表有关 类型不同，顺序不同，个数不同
 和修饰符还有返回值无关

数组是相同类型数据的有序集合
 */