import java.io.*;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException{
        int T = readInt(), changes, l1, l2;
        char[] w1, w2;
        String[] P;
        while(T-- > 0){
            P = read().split("\\s");
            w1 = P[0].toLowerCase().toCharArray();
            w2 = P[1].toLowerCase().toCharArray();
            changes = 0;
            for(int i = 0; i < w1.length; ++i){
                l1 = (int) w1[i];
                l2 = (int) w2[i];
                if(l2 > l1) changes+= l2 - l1;
                else if(l1 > l2) changes += 26 - l1 + l2;
            }
            out.println(changes);
        }
        out.close();
    }

    public static int readInt() throws IOException{
        return Integer.parseInt(in.readLine());
    }

    public static String read() throws IOException {
        return in.readLine();
    }
}
