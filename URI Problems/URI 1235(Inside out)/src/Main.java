import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static String N;

    public static void main(String[] args) throws IOException{
    int n = Integer.parseInt(in.readLine());
    String l;
    while(n-- > 0){
        l = read();
        for(int i = l.length() / 2 - 1; i >= 0; --i){
            System.out.print(l.charAt(i));
        }
        for(int i = l.length() - 1; i > l.length() / 2 - 1; --i){
            System.out.print(l.charAt(i));
        }
        System.out.println();
    }
    }

    public static String read() throws IOException {
        return in.readLine();
    }
}
