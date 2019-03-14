public class ArrayListIntFast {

    private int[] items;
    private int size;

    ArrayListIntFast(){

        items = new int[10];
        size = 0;
    }

    int size(){
        return size;
    }

    int get(int i){
        rangeCheck(i);
        return items[i];
    }

    void set(int i, int value){
        rangeCheck(i);
        items[i] = value;
    }

    void add(int value){
        if(size + 1 > items.length) {
            int[] newItems = new int[items.length + items.length / 2];

            for (int i = 0; i < size; i++) {
                newItems[i] = items[i];
            }

        }

        items[size] = value;
        ++size;
    }

    void add(int insertPosition, int value){
        if(insertPosition < 0 || insertPosition >= size + 1){
            throw new IndexOutOfBoundsException();
        }

        if(size + 1 > items.length) {
            int[] newItems = new int[items.length + items.length/2];

            for (int i = 0; i < insertPosition; i++) {
                newItems[ i] =items[i];
            }

            items[insertPosition] = value;

            for (int i = insertPosition; i < size; i++) {
                newItems[i + 1] = items[i];
            }

            items = newItems;
        }else{

            for (int i = size; i >= insertPosition; --i) {
                items[i] = items[i - 1];
            }

            items[insertPosition] = value;
        }

        ++size;

    }

    void remove(int removalPosition){
        rangeCheck(removalPosition);

        for (int i = removalPosition + 1; i < items.length; i++) {
            items[i - 1] = items[i];
        }

        --size;
    }

    void rangeCheck(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }
}
