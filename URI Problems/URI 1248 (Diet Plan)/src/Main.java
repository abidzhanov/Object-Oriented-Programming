import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner (System.in);
        int N = readInt();
        while(N-- > 0){
            String diet = in.readLine();
            char [] foods = (in.readLine() + in.readLine()).toCharArray();
            boolean f = true;
            for (char food: foods) {
                int length = diet.length();
                diet = diet.replaceFirst(String.valueOf(food), "");
                if(length == diet.length()){
                    f = false;
                    break;
                }
            }
            if(f){
                String[] S = diet.split("");
                Arrays.sort(S);
                for (String si: S) {
                    System.out.print(si);
                }
                System.out.println();
            }else{
                System.out.println("CHEATER");
            }
        }
    }

    public static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    public static String read() throws IOException {
        return in.readLine();
    }
}
