import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        int c;
        char [] led;
        while(n-- >= 0){
            c = 0;
            led = scan.nextLine().toCharArray();
            for(char leds: led)
                switch (leds) {
                    case '1' : c+=2;
                    break;
                    case '2' :
                    case '3' :
                    case '5' : c+=5;
                        break;
                    case '4' : c+=4;
                        break;
                    case '7' : c+=3;
                        break;
                    case '8' : c+=7;
                        break;
                    case '6' :
                    case '9' :
                    case '0' : c+=6;
                        break;


                }
            if(c > 0)
            System.out.println(c + " leds");
        }
    }
}
