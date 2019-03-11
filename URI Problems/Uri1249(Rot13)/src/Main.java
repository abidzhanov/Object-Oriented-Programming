import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        while(scan.hasNext()){
            s = scan.next();
            StringBuilder build = new StringBuilder("");
            for (int i = 0; i < s.length(); i++) {
                char letter = s.charAt(i);
                if(Character.isLetter(letter)){
                    if(Character.isUpperCase(letter)){
                        letter+=13;
                        if(letter > 90)
                            letter-=26;
                        build.append(letter);
                    }
                    if(Character.isLowerCase(letter)){
                        letter+=13;
                        if(letter > 122)
                            letter-=26;
                        build.append(letter);
                    }
                }else build.append(letter);
            }
            System.out.println(build);
        }
    }
}
