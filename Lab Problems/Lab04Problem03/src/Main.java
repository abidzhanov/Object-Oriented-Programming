import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayListInt list = new ArrayListInt();

        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }

        System.out.println("Before reversing: ");
        printNumbers(list);

        reverseNumbers(list);

        System.out.println("After reversing: ");
        printNumbers(list);

        insertZero(list);
        System.out.println("After insertions:");
        printNumbers(list);

        deleteOdd(list);
        System.out.println("After deletions:");
        printNumbers(list);
    }

    private static void printNumbers(ArrayListInt list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    private static void deleteOdd(ArrayListInt list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0) {
                list.remove(i);
                --i;
            }
        }
    }

    private static void insertZero(ArrayListInt list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.add(i, 0);
                ++i;
            }
        }
    }

    private static void reverseNumbers(ArrayListInt list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, --j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
        }
    }
}