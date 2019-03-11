import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int N, n;
        N = scan.nextInt();
        boolean p = true;
        while (N-- > 0) {
            String s = "", c = "";
            n = scan.nextInt();
            for (int i = 0; i < n; ++i) {
                s = scan.next();
                if(i < 1) {
                    c = s;
                }
                if (c.equals(s))
                    p = true;
                else {
                    p = false;
                }
            }
            System.out.println(p ? s : "ingles");
        }

    }
}
