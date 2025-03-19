import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[6]; // 定义一个数组存储6个评分
        double temp = 0.0;

        // 输入6个评委的评分
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的评分:");
            arr[i] = sc.nextDouble();
            System.out.println("第" + (i + 1) + "位评委评分是:" + arr[i]);
        }
        // 使用冒泡排序将数组从小到大排序
        for (int j = 0; j < arr.length - 1; j++) {
            for (int k = 0; k < arr.length - 1 - j; k++) {
                if (arr[k] > arr[k + 1]) {
                    temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
        // 计算去掉最高分和最低分后的平均值
        double sum = 0.0;
        System.out.println("去掉最高分 " + arr[arr.length - 1] + ", 去掉最低分 " + arr[0]);
        for (int a = 1; a <= arr.length - 2; a++) { // 从索引1到4（5-2=3），共4个数
            sum = sum + arr[a];
        }
        System.out.println("选手最终平均得分为: " + (sum / (arr.length - 2)));

        sc.close();
    }
}