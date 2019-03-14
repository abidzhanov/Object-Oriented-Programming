import java.util.Scanner;

public class Main {

    private final static int DEFAULT_FIELD_WIDTH = 20;
    private final static int DEFAULT_FIELD_HEIGHT = 20;

    public static void main(String[] args) {

        Turtle turtle = new Turtle();
        Field field = new Field(DEFAULT_FIELD_WIDTH, DEFAULT_FIELD_HEIGHT);

        boolean working = true;
        Scanner scan = new Scanner(System.in);
        do {

            String[] parts = scan.nextLine().split(" ");
            String command = parts[0].toLowerCase();

            switch (command){
                case "penup":
                    turtle.putPenUp();
                    break;
                case "pendown":
                    turtle.putPenDown();
                    break;
                case "turnleft":
                    turtle.turnLeft();
                    break;
                case "turnright":
                    turtle.turnRight();
                    break;
                case "move":
                    if(parts.length >= 2){
                        int steps = Integer.parseInt(parts[1]);
                        turtle.move(steps, field);
                    }
                    break;
                case "print":
                    field.print(turtle);
                    break;
                case "exit":
                    working = false;
                    break;
            }

        }while(working);

    }
}
