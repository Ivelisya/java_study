import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 判断输入整数的奇偶性
 */
public class Demo2 {
    /**
     * 主方法：程序入口
     * 
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.print("请输入一个整数：");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                String result = checkOddEven(number);
                System.out.println(number + " 是" + result);
            } else {
                System.out.println("错误：请输入有效的整数！");
            }
        } catch (InputMismatchException e) {
            System.out.println("错误：输入格式不正确，请输入整数！");
        } finally {
            // 确保Scanner关闭，释放资源
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    /**
     * 判断一个数是奇数还是偶数
     * 
     * @param number 要判断的整数
     * @return "奇数"或"偶数"的字符串
     */
    private static String checkOddEven(int number) {
        return number % 2 == 0 ? "偶数" : "奇数";
    }
}
