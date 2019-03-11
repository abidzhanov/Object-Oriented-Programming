import java.io.*;

public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String l;
        while(!((l = read()).equals("0 0"))){
            String[] s = l.split("\\s");
            String D = s[0];
            String N = s[1];
            String r = N.replace(D, "");
            r = r.replaceFirst("0*", "");
            System.out.println(r.length() > 0 ? r : 0);
        }
        out.close();
    }
    public static String read() throws IOException {
        return in.readLine();
    }
}