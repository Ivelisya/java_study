package test01;

/*
 * 数据类型
 * 数值型 {
 * 整数类型: byte short int long
 * 浮点类型: float double
 * 
 * byte 8位 short 16位 int 32位 long 64位
 * float 32位 double 64位
 * }
 * 
 */
public class TestType {
    public static void main(String[] args) {
        byte a = 10; // 表数范围 -128 ~ 127
        short b = 20; // 表数范围 -32768 ~ 32767
        int c = 30; // 表数范围 -2147483648 ~ 2147483647
        long d = 40; // 表数范围 -9223372036854775808 ~ 9223372036854775807 如果表示范围超出，使用L后缀
        
        float e = 3.14f;
        double f = 3.14; // double类型默认是64位的，表示范围更大

        char g = 'A'; // 单引号引起来表示单个的字符
        System.out.println("你好");

        boolean flag = true; // 逻辑值，只有true和false两个值
        System.out.println(flag); // true
    }
}
