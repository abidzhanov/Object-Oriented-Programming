import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i, j, k, n, bottom = 2;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            n = scan.nextInt();
            for(i = 0; i <= n; i+=2){
                for(j = n; j > i; j-=2){
                   if(j == n) System.out.print("");
                    else System.out.print(" ");
                }
                for (k = 0;k <= i; ++k)
                    System.out.print("*");
                System.out.println();
            }

            for(i = 0; i <= bottom; i+=2){
                for(j = n; j > i; j-=2){
                    if(j == n) System.out.print("");
                    else System.out.print(" ");
                }
                for (k = 0;k <= i; ++k)
                    System.out.print("*");
                System.out.println();
            }
            System.out.println();
        }
    }
}