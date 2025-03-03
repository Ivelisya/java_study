import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a% 2 == 1){
            System.out.println(a + "奇数");
        } else {
            System.out.println(a + "偶数");
        }
    }
}
