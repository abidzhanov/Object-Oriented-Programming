import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N, s, l, count;
        String a, n;
        N = scan.nextInt();
        while(N-- > 0){
            s = scan.nextInt();
            while(s-- > 0){
                count = 0;
                n = scan.next();
                a = scan.next();
                l = a.length();
                for (int i = 0; i < l; i++) {
                    if(a.charAt(i) == 'A')
                        count++;
                }
                if(count >= 2)
                    System.out.println(n);
            }
        }
    }
}
