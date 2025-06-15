import java.util.ArrayList;
import java.util.Random;
public class FourLeafFlowerChecker{
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<>();
        Random random = new Random();
        for(int i = 0;i < 10;i++){
            int randomNumber = random.nextInt(9000) + 1000;
            arraylist.add(randomNumber);
        }
        System.out.println("随机数集"+ arraylist);
        for(int number:arraylist){
            if(check(number)){
                System.out.println(number + "是");
            }else{
                System.out.println(number + "不是");
            }
        }
    }
    public static boolean check(int number){
        if(number < 1000 || number > 9999){
            return false;
        }else{
            int power = 0;
            int temp = number;
            while(temp > 0){
                int digit = temp % 10;
                power += Math.pow(digit,4);
                temp /= 10;
            }
            return power == number;
        }
    }
    
}