import java.util.*;
public class Main {

    public static void main(String[] args) {
        int N, l, l2, max = 0;
        Scanner scan = new Scanner(System.in);
	while((N = scan.nextInt()) != 0){
	    String L;
	    while(N-- > 0){
	        L = scan.next();
	        l = L.length();
	        if(l > max){
	            max = l;
            }
	        else if(l <= max){
	            max = max - l;
            }
            System.out.println(getWhiteSpace(max) + L);
        }
	  }
    }

    public static String getWhiteSpace(int size){
        StringBuilder builder = new StringBuilder(size);
        for(int i = 0; i < size; ++i){
            builder.append(' ');
        }
        return builder.toString();
    }
}
