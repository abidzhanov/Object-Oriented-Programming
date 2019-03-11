import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int i, j, k, n, foot = 3;
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            n = scan.nextInt();
            for (i = 1;i <= n; i+=2) {
                for (j = i;j < n; j+=2)
                    System.out.print(" ");
                for(k = 0; k < i; ++k)
                    System.out.print("*");
                System.out.println();
            }

            for (i = 1;i <= foot; i+=2) {
                for (j = i; j < n; j += 2)
                    System.out.print(" ");
                for (k = 0; k < i; ++k)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
