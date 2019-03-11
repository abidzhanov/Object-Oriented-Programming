import java.util.*;

public class Main {

    public static void main(String[] args) {
        int N;
        String s;
        String D;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        while (N-- > 0) {
            s = scan.next();
            if (s.length() == 3) {
                if (s.substring(0, 2).equals("UR") || s.substring(0, 2).equals("OB")) {
                    System.out.print(s.substring(0, 2) + "I");
                } else {
                    System.out.print(s);
                }
            } else {
                System.out.print(s);
            }
            if (N != 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
