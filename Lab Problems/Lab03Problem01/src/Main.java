import javax.crypto.ExemptionMechanismException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Calculator of Rational numbers");
        do{
            System.out.print("Enter 1st rational (Ctrl-Z: exit): ");
            if(!scan.hasNext()) break;
            Rational a;
            try{
                a = Rational.parse(scan.nextLine());
            }catch (Exception e){
                System.err.println(e.getMessage());
                continue;
            }

            System.out.print("Enter the operator: ");
            if(!scan.hasNext()) break;
            String op = scan.nextLine();

            System.out.print("Enter 2nd rational (Ctrl-Z: exit): ");
            if(!scan.hasNext()) break;
            Rational b;
            try{
                b = Rational.parse(scan.nextLine());
            }catch (Exception e){
                System.err.println(e.getMessage());
                continue;
            }

            String res = "";
            switch (op){
                case "+":
                    res = a.add(b).toString();
                    break;
                case "-":
                    res = a.sub(b).toString();
                    break;
                case "/":
                    res = a.div(b).toString();
                    break;
                case "*":
                    res = a.mul(b).toString();
                    break;
                case "<":
                    res = String.valueOf(a.compareTo(b) < 0);
                    break;
                case ">":
                    res = String.valueOf(a.compareTo(b) > 0);
                    break;
                case "=":
                    res = String.valueOf(a.compareTo(b) == 0);
                    break;
                case "!=":
                    res = String.valueOf(a.compareTo(b) != 0);
                    break;
                case "<=":
                    res = String.valueOf(a.compareTo(b) <= 0);
                    break;
                case ">=":
                    res = String.valueOf(a.compareTo(b) >= 0);
                    break;
                default:
                    System.err.println("Incorrect operation " + op);
                    continue;
            }
            System.out.printf("Result %s %s %s = %s%n", a, op, b, res);
        }while(true);
    }
}