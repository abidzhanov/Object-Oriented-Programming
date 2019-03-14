import java.util.Scanner;

public class Main {

    static int turtleX, turtleY;
    static int dx, dy;
    static boolean isPenUp;

    final static char EMPTY_CELL = '.';
    final static int WIDTH = 20, HEIGHT = 20;
    final static char MARKED_CELL = '*';
    final static char TURTLE_CELL = 'T';
    static char[][] field;

    public static void constructTurtle(){
        turtleX = turtleY = 0;
        dx = 1; dy = 0;
        isPenUp = false;
    }

    public static void constructField(){
        field = new char[HEIGHT][WIDTH];
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {
                field [y][x] = EMPTY_CELL;
            }
        }
    }

    public static void printField(){
        for (int y = 0; y < HEIGHT; y++) {
            for (int x = 0; x < WIDTH; x++) {

                if (x == turtleX && y == turtleY){
                    System.out.print(TURTLE_CELL);
                }

                else {
                    System.out.print(field[y][x]);
                }

            }
            System.out.println();
        }
    }

    public static void putPenUp(){
        isPenUp = true;
    }

    public static void putPenDown(){
        isPenUp = false;
    }

    public static void turnRight(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = -dx;
    }

    public static void turnLeft(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }

    public static void move(int steps){
        for (int i = 0; i < steps; i++) {
            int nextX = turtleX + dx;
            int nextY = turtleY + dy;

            if(nextX < 0 || nextX >= WIDTH || nextY < 0 || nextY >= HEIGHT)
                break;

            if (isPenUp)
                field[turtleY][turtleX] = MARKED_CELL;

            turtleX = nextX;
            turtleY = nextY;
        }
    }

    public static void main(String[] args) {
        constructTurtle();
        constructField();

        boolean working = true;
        Scanner scan = new Scanner(System.in);
        String[] parts;
        do{
            parts = scan.nextLine().split(" ");
            String command = parts[0].toLowerCase();
            switch (command){

                case "penup":
                    putPenUp();
                    break;
                case "pendown":
                    putPenDown();
                    break;
                case "turnright":
                    turnRight();
                    break;
                case "turnleft":
                    turnLeft();
                    break;
                case "move":
                    if(parts.length >= 2) {
                        int steps = Integer.parseInt(parts[1]);
                        move(steps);
                    }
                    else{
                        System.out.println("Please, specify the number of steps");
                    }
                    break;
                case "print":
                    printField();
                    break;
                case "exit":
                    working = false;
                    break;
                 default:
                     System.out.println("Invalid command, please try again");
            }
        } while(working);
    }
}
