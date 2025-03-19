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

        // 创建二维数组，动态分配每个员工的月数
        int[][] arr = new int[num][];
        int[] months = new int[num]; // 存储每个员工的记录月数

        // 输入每个员工的记录月数并分配数组大小
        for (int i = 0; i < num; i++) {
            System.out.print("请输入第" + (i + 1) + "个员工的记录月数: ");
            while (!sc.hasNextInt() || (months[i] = sc.nextInt()) <= 0) {
                System.out.println("请输入有效的正整数:");
                sc.next();
            }
            arr[i] = new int[months[i]]; // 动态分配每个员工的数组大小
        }

        // 输入每个员工的每月营业额
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i + 1) + "个员工的" + months[i] + "个月营业额:");
            for (int j = 0; j < months[i]; j++) {
                System.out.print("第" + (j + 1) + "个月营业额: ");
                while (!sc.hasNextInt() || (arr[i][j] = sc.nextInt()) < 0) {
                    System.out.print("请输入非负整数: ");
                    sc.next();
                }
            }
        }

        // 计算并输出每个员工的最高、最低和平均营业额
        for (int i = 0; i < num; i++) {
            int max = arr[i][0]; // 假设第一个月营业额为最高
            int min = arr[i][0]; // 假设第一个月营业额为最低
            double sum = 0;      // 累计营业额

            // 找到最高、最低值并计算总和
            for (int j = 0; j < months[i]; j++) {
                if (arr[i][j] > max) max = arr[i][j];
                if (arr[i][j] < min) min = arr[i][j];
                sum += arr[i][j];
            }

            double average = sum / months[i];
            System.out.println("第" + (i + 1) + "个员工:");
            System.out.println("最高月营业额: " + max);
            System.out.println("最低月营业额: " + min);
            System.out.println("平均月营业额: " + String.format("%.2f", average));
            System.out.println();
        }

        sc.close();
    }
}