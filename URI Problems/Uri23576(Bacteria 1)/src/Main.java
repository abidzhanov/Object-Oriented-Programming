import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String x, y;
        while (scan.hasNext()) {
            boolean X = false;
            x = scan.next();
            y = scan.next();
            for (int i = 0; i < x.length(); i++) {
                X = false;
                if (x.charAt(i) == y.charAt(0)) {
                    for (int j = i, k = 0; k < y.length(); j++, k++) {
                        if (x.charAt(j) == y.charAt(k)) {
                            X = true;
                        } else {
                            X = false;
                            break;
                        }
                    }
                }
                if (X)
                    break;
            }
            if (X)
                System.out.println("Resistente");
            else
                System.out.println("Nao resistente");
          }
       }
    }
