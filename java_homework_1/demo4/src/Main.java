import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入金字塔层数: ");
        int n = scanner.nextInt();
        scanner.close();
        // 遍历每一行
        for (int i = 0; i < n; i++) {
            // 打印前导空格
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // 计算当前行星号的数量
            int stars = 2 * (n - i) - 1;
            // 遍历每一列
            for (int j = 0; j < stars; j++) {
                // 第一行 或者 第一列（左边） 或者 最后一列（右边） 打印 '*'
                if (i == 0 || j == 0 || j == stars - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // 换行
        }
    }
}