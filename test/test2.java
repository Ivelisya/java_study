public class test2 {
    public static void main(String[] args){
        int num =0;
        for(int i = 100;i <= 200;i++){
            if(i % 3 == 0){
                num += i;
            }
        }
        System.out.println(num);
    }
}
