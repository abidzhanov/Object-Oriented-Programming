import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int star, underscore, i;
	char[] text;
	while(scan.hasNextLine()){
		i = 0;
		star = 0;
		underscore = 0;
		text = scan.nextLine().toCharArray();
	    while(i < text.length){
	    	if(text[i] == '*'){
	    		if (star == 0){
	    			System.out.print("<b>");
	    			star = 1;
				}
	    		else{
	    			System.out.print("</b>");
	    			star = 0;
				}
			}else if(text[i] == '_'){
				if (underscore == 0){
					System.out.print("<i>");
					underscore = 1;
				}
				else{
					System.out.print("</i>");
					underscore = 0;
				}
			}
	    	else{
	    		System.out.print(text[i]);
			}
	    	++i;
		}
	    System.out.println();
	   }
    }
}
