public class Turtle {

    private int turtleX, turtleY;
    private int dx, dy;
    private boolean isPenDown;

    Turtle(){

        turtleX = turtleY = 0;
        dx = 1; dy = 0;
        isPenDown = false;
    }

    int getX(){
        return turtleX;
    }

    int getY(){
        return turtleY;
    }

    void putPenUp(){
        isPenDown = false;
    }

    void putPenDown(){
        isPenDown = true;
    }

    void turnLeft(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dy = -dy;
    }

    void turnRight(){
        int temp = dx;
        dx = dy;
        dy = temp;

        dx = -dx;
    }

    void move(int steps, Field field){

        for (int i = 0; i < steps; i++) {
            int nextX = turtleX + dx;
            int nextY = turtleY + dy;

            if(nextX < 0 || nextY < 0 || nextX >= field.getWidth() || nextY == field.getHeight()){
                break;
            }

            if(isPenDown){
                field.mark(turtleX, turtleY);
            }

            turtleX = nextX;
            turtleY = nextY;
        }
    }

}
