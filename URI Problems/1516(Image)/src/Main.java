import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String l, row;
        String[] P;
        int A, B, N, M;
        int[] repetitions;
        char[][] pixels;
        while(!(l = scan.nextLine()).equals("0 0")){
            P = l.split("\\s");
            N = toInt(P[0]);
            M = toInt(P[1]);
            pixels = new char[N][M];
            for (int i = 0; i < N; i++) {
                pixels[i] = scan.nextLine().toCharArray();
            }
            repetitions = readArray();
            A = repetitions[0] / N;
            B = repetitions[1] / M;
            for (int i = 0; i < N; i++) {
                row = "";
                for (int j = 0; j < M; j++) {
                    row += strRepeat(String.valueOf(pixels[i][j]), B);
                }
                for (int j = 0; j < A; j++) {
                    System.out.println(row);
                }
            }
            System.out.println();
        }

    }
    private static String strRepeat(String s, int repetitions){
        return new String(new char[repetitions]).replace("\0", s);
    }

    private static int[] readArray(){
        String[] line = scan.nextLine().split("\\s");
        int l = line.length;
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = Integer.parseInt(line[i]);
        }
        return a;
    }

    private static int toInt(String s){
        return Integer.parseInt(s);
    }
}
