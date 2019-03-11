import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = readInt();
        while(N-- > 0){
            String[] words = read().trim().split("\\·");
            for (String word : words) {
                System.out.print(word.length() > 0 ? word.substring(0, 1) : "");
            }
            System.out.println();
        }
    }

    //Method which reads Int
    public static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    //Method which reads String
    public static String read() throws IOException {
        return in.readLine();
    }
}
