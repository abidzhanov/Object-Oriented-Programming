import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException{
        char[] a;
        char[] b;
        int N = Integer.parseInt(in.readLine());
        while(N-- > 0){
            a = in.readLine().toCharArray();
            b = in.readLine().toCharArray();
            if(a[a.length - 1] == b[b.length - 1]){
                System.out.println("encaixa");
            }else{
                System.out.println("nao encaixa");
            }
        }
    }
}
