import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt();
        while(C-- > 0) {
            int E = scan.nextInt();
            int B = scan.nextInt();
            System.out.println(printNum(E, B));
        }
    }
    public static String printNum(int a, int b){
        String s = "";
        for(int i = a; i <= b; ++i){
            s += String.valueOf(i);
        }
        return s+= new StringBuilder(s).reverse().toString();
    }
}
