import java.util.ArrayList;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, len, max = 0;
        while((n = scan.nextInt()) != 0) {
            String[]s = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = scan.next();
                if(max < s[i].length())
                    max = s[i].length();
             }
            for (int i = 0; i < n; i++) {
                if(s[i].length() < max) {
                    len = max - s[i].length();
                    System.out.println(String.format("%1$" + (len + s[i].length()) + "s", s[i]));
                }else System.out.println(s[i]);
            }
        }

        }
    }
