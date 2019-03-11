import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet <String> list = new HashSet <String>();
        int N = scan.nextInt(), l;
        String s;
        while(N-- > 0){
            s = scan.next();
            list.add(s);
        }
        l = list.size();
        System.out.printf("Falta(m) %d pomekon(s).%n", (151 - l));
    }
}
