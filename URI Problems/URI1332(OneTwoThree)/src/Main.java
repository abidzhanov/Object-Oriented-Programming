import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        while (N-- > 0) {
            String number = scan.next();
            char[] n = number.toCharArray();
            if (n.length == 5) {
                System.out.println(3);
            }
            else if(n[0] == 't' && n[1] == 'w' || n[0] == 't' && n[2] == 'o' || n[1] == 'w' && n[2] == 'o') {
                System.out.println(2);
            }
            else{
                System.out.println(1);
            }
        }
    }
}
