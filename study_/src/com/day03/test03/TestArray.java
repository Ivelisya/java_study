package com.day03.test03;

public class TestArray {
    public static void main(String[] args) {
        // 数组声明：以int类型数组为案例:
        int[] arr;// 定义一个int类型的数组 名字是arr
        // 数组的创建
        arr = new int[4];// 在创建的时候给定数组的长度，创建一个长度为4的int类型的数组
        // int[] arr = new int[4];//声明和创建可以合并在一起 底层默认长度为4的空间中
        arr[0] = 15;
        arr[1] = 12;
        arr[3] = 13;
        arr[2] = 14;
        // arr[4] = 10;// 这里会报错 因为数组的长度为4，索引从0到3 索引超出边界
        System.out.println(arr[3]);
        System.out.println(arr[0] + 30);
        // System.out.println(arr[4]); // 这里会报错 因为索引4不存在;

        // 数组的遍历 (查看数组中的每一个元素)
        for (int i = 0; i <= 3; i++)//i代表索引 
        {
            System.out.println(arr[i]);
        }
        System.out.println("增强for循环");
        for (int num : arr) {// 对arr数组进行遍历，每个元素属于num接收
            System.out.println(num);
        }
    }
}
/*
 * for循环和增强for循环的区别:
 * 1. for循环可以通过索引来访问数组的每个元素，适用于需要索引的场景。
 * 2. 增强for循环（也称为for-each循环）更简洁，适用于只需要访问元素而不需要索引的场景。
 */