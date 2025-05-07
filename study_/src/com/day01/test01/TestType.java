package com.day01.test01;

public class TestType {
    public static void main(String[] args) {
        // 基本数据类型
        // 整数类型
        byte a = 10;//表示范围 -128~127
        short b = 20;//表示范围 -32768~32767
        int c = 10;//表示范围 -2147483648~2147483647
        // 实际上只有超过int类型才需要加l
        long d = 10l;//表示范围 -9223372036854775808~9223372036854775807
// double比float精度更高 默认是double类型 如果要表示float需要显示类型转化
        float e = 10.0f;//表示范围 -3.40282347E+38~3.40282347E+38
        double ef = 10.0;

        // 字符型
        char g = 'a';//''单引号表示单个字符
        System.out.println("NIHAO");//字符串是多个单个字符拼接而来

        //布尔类型 表示两个对立的
        boolean flag = true; //布尔值只有两个 true 和 false
    }
}
