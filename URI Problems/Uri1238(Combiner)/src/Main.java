import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        while(N-- > 0){
            String a = scan.next();
            String b = scan.next();
            String res ="";
            if(a.length()>=b.length()) {
                int j=0;
                for(int i=0;i<a.length();i++){
                    res+=a.charAt(i);
                    while(j<b.length()){
                        res+=b.charAt(i);
                        j++;
                        break;
                    }

                }
            }
            else if(a.length()<b.length()) {
                int j=0;
                for(int i=0;i<b.length();i++){
                    while(j<a.length()) {
                        res+=a.charAt(j);
                        j++;
                        break;
                    }
                    res+=b.charAt(i);
                }

            }
            System.out.println(res);

        }
    }
}
