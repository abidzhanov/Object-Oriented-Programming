import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int numofwords = scan.nextInt();
            int numoflines = scan.nextInt();
            int numofchars = scan.nextInt();
//            String nothing = scan.next();
//            StringBuilder builder = new StringBuilder("");
            String nothing = scan.nextLine();
            String text = scan.nextLine();
            String[] a = text.split("\\s+");
            int totalchars = 0;
            int totallines = 0;
            if (a.length > numofwords) {
                break;
            }
            for (int i = 0; i < a.length; i++) {
                if (totalchars + a[i].length() > numofchars) {
                    totallines++;
                    totalchars = 0;
                    if(i == a.length - 1){
                        totalchars += a[i].length();
                    }
                    else{
                        totalchars += a[i].length() + 1;
                    }
                } else {
                    if(i == a.length - 1){
                        totalchars += a[i].length();
                    }
                    else{
                        totalchars += a[i].length() + 1;
                    }

                }

            }
            int pages = totallines / numoflines;
            if (totallines % numoflines > 0) {
                pages++;
            }
            if(totalchars >0 && totallines % numoflines == 0 ){
                pages++;
            }
            System.out.println(pages);
        }
    }
}