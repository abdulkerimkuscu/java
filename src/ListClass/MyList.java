package ListClass;

public class MyList<T> {
    private T[] array;
    private T[] arrayTemp;
    private int dimeensionSize = 0;
    private int capacity;


    public void setArray() {
        this.array = (T[]) new Object[this.capacity];
    }

    public void increaseCapacity() {
        this.arrayTemp = (T[]) new Object[this.capacity];
        for (int i = 0; i < this.array.length; i++) {
            this.arrayTemp[i] = this.array[i];
        }
        this.array = this.arrayTemp;
    }
    public MyList(int capacity){
        this.capacity=capacity;
        this.setArray();
    }
    public MyList() {
        this.capacity = 10;
        this.setArray();
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return this.dimeensionSize;
    }

    public void sizeCalc() {
        int count = 0;
        for (int i = 0; i < this.array.length; i++) {
            if (this.array[i] != null) {
                count++;
            }
        }
        this.dimeensionSize = count;
    }

    public void add(T data) {
        if (this.size() < this.capacity) {
            array[this.dimeensionSize] = data;
            this.sizeCalc();
        } else {
            this.capacity = this.capacity * 2;
            this.increaseCapacity();
            this.add(data);
        }
    }

    @Override
    public String toString() {
        System.out.print("[");
        for (T arr : array) {
            if (arr != null) {
                System.out.print(arr + " , ");
            }
        }
        System.out.print("]");
        return "";
    }

    public T get(int index) {
        T i = this.array[index];
        return i;
    }

    public void remove(int index) {
        replaceForRemove(index);
        this.dimeensionSize--;
    }

    public void replaceForRemove(int index) {
        T[] arrayTemp2 = this.array;
        this.array[index] = null;
        for (int i = 0; i < arrayTemp2.length - 1; i++) {
            if (index == 0) {
                this.array[i] = arrayTemp2[i + 1];
            } else if (index != 0 && i < index) {
                this.array[i] = arrayTemp[i];
            } else if (index != 0 && i > index) {
                this.array[i] = arrayTemp2[i + 1];
            }
        }
    }

    public void set(int index, T data) {
        this.array[index] = data;
    }

    public int indexOf(T data){
        for(int i = 0; i< this.array.length; i++){
            if (data == this.array[i]){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data){
        int lastIndex = -1;
        for(int i = 0; i<this.array.length; i++){
            if (data == this.array[i]){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public boolean isEmpty(){
        if (this.size() == 0){
            return true;
        }
        return false;
    }

    public Object[] toArray(){
        Object[] tempObj = new Object[this.array.length];
        for (int i = 0; i< this.array.length; i++){
            tempObj[i] = this.array[i];
        }
        return tempObj;
    }

    public MyList<T> subList(int x, int y){
        MyList<T> sub =new MyList<>(y-x+1);
        for (int i=x;i<=y;i++){
            sub.add((T)this.array[i]);
        }
        return sub;
    }

    public boolean contains(T data){
        for (int i=0;i<this.array.length;i++){
            if (data ==this.array[i]){
                return true;
            }
        }
        return false;
    }
    public void clear(){
        for (int i=0;i<this.array.length;i++){
            this.array[i] =null;
        }
    }

}
