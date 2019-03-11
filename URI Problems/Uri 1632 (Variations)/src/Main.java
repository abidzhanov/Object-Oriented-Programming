import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final char[] v = {'a', 'A', 'E', 'e', 'i', 'I', 'o', 'O', 's', 'S'};
        char[] s;
        int N = scan.nextInt(), len = 0, r;
        while(N-- > 0){
            s = scan.next().toCharArray();
            len = s.length;
            r = 1;
            for (int i = 0; i < len; i++) {
                boolean f = false;
                for (int j = 0; j < v.length; j++)
                    if(s[i] == v[i])
                        f = true;

                    if(f) r*=3;
                    else r*=2;
            }
            System.out.println(r);

        }
    }
}
