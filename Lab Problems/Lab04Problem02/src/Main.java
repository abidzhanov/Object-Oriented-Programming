import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }
        insertZero(list);
        System.out.println("After insertions:");
        printNumbers(list);

        deleteOdd(list);
        System.out.println("After deletions:");
        printNumbers(list);
    }

    private static void printNumbers(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private static void deleteOdd(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0) {
                list.remove(i);
                --i;
            }
        }
    }

    private static void insertZero(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.add(i, 0);
                ++i;
            }
        }
    }
}
