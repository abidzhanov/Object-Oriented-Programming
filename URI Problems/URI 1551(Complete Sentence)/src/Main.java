import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String str;
        while(N-- >= 0){

            str = scan.nextLine();
            long c = str.toLowerCase().chars()
                    .filter(ch -> ch >= 'a' && ch <= 'z')
                    .distinct()
                    .count();
            if(c == 26) System.out.println("Full");
            else if(c == 13) System.out.println("Half");
            else if(c == 0){ continue;}
            else System.out.println("Empty");
            }
        }
    }
