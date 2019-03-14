public class Field {

    final static char MARKED_CELL = '*';
    final static char EMPTY_CELL = '.';
    final static char TURTLE_CELL = 'T';

    private char[][] data;



    Field(int height, int width){

        data = new char[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                data[y][x] = EMPTY_CELL;
            }
        }
    }

    int getWidth(){
        return data.length;
    }

    int getHeight(){
        return data[0].length;
    }

    void print(Turtle turtle){
        for (int y = 0; y < data.length; y++) {
            for (int x = 0; x < data[0].length; x++) {
                if(x == turtle.getX() && y == turtle.getY()){
                    System.out.print(TURTLE_CELL);
                }
                else {
                    System.out.print(data[y][x]);
                }
            }
            System.out.println();
        }
    }

    void mark(int x, int y){
        data[y][x] = MARKED_CELL;
    }
}
