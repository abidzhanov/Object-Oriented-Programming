import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        System.out.println("Before reversing: ");
        printNumbers(list);

        reverseNumbers(list);

        System.out.println("After reversing: ");
        printNumbers(list);
    }

    private static void reverseNumbers(ArrayList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, --j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }

    private static void printNumbers(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); ++i){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
