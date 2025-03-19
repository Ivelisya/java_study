public class Main {
    public static void main(String[] args) {
        int cout = 0;
        for(int i = 0; i <= 100;++i){
            String numStr = String.valueOf(i);
            for(char c: numStr.toCharArray()){
                if(c == '9'){
                    ++cout;
                }
            }
        }
        System.out.println(cout);
    }

}