import java.util.ArrayList;
import java.util.Random;

public class FourLeafRose {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // 生成 10 个 1000-9999 之间的随机数
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(9000) + 1000; // 1000 <= randomNumber <= 9999
            numbers.add(randomNumber);
        }

        System.out.println("生成的随机数列表: " + numbers);

        // 遍历集合，判断是否为四叶玫瑰数
        System.out.println("四叶玫瑰数:");
        for (int number : numbers) {
            if (isFourLeafRose(number)) {
                System.out.println(number);
            }
        }
    }

    // 判断一个数是否为四叶玫瑰数
    public static boolean isFourLeafRose(int number) {
        if (number < 1000 || number > 9999) {
            return false; // 不是四位数，直接返回 false
        }

        int sumOfFourthPowers = 0;
        int temp = number;

        // 计算各位数字的四次方之和
        for (int i = 0; i < 4; i++) {
            int digit = temp % 10;
            sumOfFourthPowers += Math.pow(digit, 4);
            temp /= 10;
        }

        return sumOfFourthPowers == number;
    }
}
