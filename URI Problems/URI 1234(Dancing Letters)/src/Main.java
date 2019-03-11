import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String l;
	int count;

	while((l = scan.nextLine()) != null){
	   String[] letters = l.split("");
	   count = 0;
	   for(String letter: letters){
	       if(letter.matches("\\w")){
	           letter = count++ % 2 == 0 ? letter.toUpperCase() : letter.toLowerCase();
           }
	       System.out.print(letter);
       }
	   System.out.println();
       }
    }
}
