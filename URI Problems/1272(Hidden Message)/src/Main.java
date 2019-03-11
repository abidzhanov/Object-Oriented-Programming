import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int N = readInt();
        ArrayList<Character> word = new ArrayList<>();
        while (N-- > 0) {
            char[] words = read().toCharArray();
            for(int i = 0; i < words.length; ++i){
                if(words[i] == '.'){
                    word.add((char) (words[i] - 1));
                }
                System.out.println(word.toString());
            }
        }
        out.close();
    }

    private static String read() throws IOException {
        return in.readLine();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

}