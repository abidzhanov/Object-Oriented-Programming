import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String passwd;
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{6,32}$";
        while(scan.hasNextLine()){
            passwd = scan.nextLine();
            System.out.println(passwd.matches(pattern) ? "Senha valida." : "Senha invalida.");

        }
    }
}