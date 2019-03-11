import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String s;
        int N, i, index;
        while (scan.hasNext()) {
            N = scan.nextInt();
            while (N-- > 0) {
                index = scan.nextInt();
                list.add(index);
            }
            Collections.sort(list);
            for (int out : list) {
                if(out < 10 && out >= 1)
                    System.out.println("000" + out);
                else if(out < 100 && out >= 10)
                    System.out.println("00" + out);
                else if(out < 1000 && out >= 100)
                    System.out.println("0" + out);
                else if(out < 10000 && out >= 1000)
                    System.out.println(out);
                else if(out == 0)
                    System.out.println("0000");
            }
        }
    }
}
