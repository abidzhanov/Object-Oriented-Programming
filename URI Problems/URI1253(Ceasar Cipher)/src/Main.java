import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        for(int i = 0; i < N; ++i){
            scan.nextLine();
            String str = scan.nextLine();
            int n = scan.nextInt();
            char[] s = str.toCharArray();
            for(int x = 0; x < s.length; ++x){
                if((s[x] - n) < 65)
                    s[x]+=(26 - n);

                else
                    s[x]-=n;
            }
            System.out.println(s);
        }
    }
}
