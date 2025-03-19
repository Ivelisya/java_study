import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(10); // 生成 0-9 之间的随机数
        Scanner scanner = new Scanner(System.in);
        int guess;

        System.out.println("欢迎来到猜数字游戏！请输入 0-9 之间的数字：");

        while (true) {
            System.out.print("请输入你的猜测: ");
            guess = scanner.nextInt(); // 读取用户输入

            if (guess == secretNumber) {
                System.out.println("恭喜你，答对了！🎉");
                break; // 猜对，退出循环
            } else if (guess > secretNumber) {
                System.out.println("sorry，你猜大了！");
            } else {
                System.out.println("sorry，你猜小了！");
            }
        }

        scanner.close();
    }
}