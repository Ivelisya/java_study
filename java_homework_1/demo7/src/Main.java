import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工数量:");
        int num;
        while (!sc.hasNextInt() || (num = sc.nextInt()) <= 0) {
            System.out.println("请输入有效的正整数:");
            sc.next();
        }
        int[][] arr = new int[num][3];

        // 输入每个员工的3个月营业额
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第" + (i + 1) + "个员工3个月的营业额:");
            for (int j = 0; j < 3; j++) {
                System.out.print("第" + (j + 1) + "个月营业额: ");
                while (!sc.hasNextInt() || (arr[i][j] = sc.nextInt()) < 0) {
                    System.out.print("请输入非负整数: ");
                    sc.next();
                }
            }
        }
        // 计算并输出最高月营业额
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < 3; j++) {
                if (arr[i][j] > max) max = arr[i][j];
            }
            System.out.println("第" + (i + 1) + "个员工的最高月营业额为: " + max);
        }

        // 计算并输出平均月营业额
        for (int i = 0; i < num; i++) {
            double sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            System.out.println("第" + (i + 1) + "个员工的平均月营业额为: " + String.format("%.2f", sum / 3.0));
        }

        sc.close();
    }
}