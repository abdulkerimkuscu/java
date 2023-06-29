package Thread;

import java.util.ArrayList;
import java.util.List;

public class Threads implements Runnable {

    private int firstNum = 1;

    private static final Object LOCK = new Object();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();
    private List<Integer> list3 = new ArrayList<>();
    private List<Integer> list4 = new ArrayList<>();
    private List<Integer> oddList = new ArrayList<>();
    private List<Integer> evenList = new ArrayList<>();

    @Override
    public void run() {

        synchronized (LOCK) {


            if (this.firstNum <= 2500) {
                this.list1.add(this.firstNum);
                System.out.println(this.firstNum + " added to ==> list1");
            } else if (this.firstNum > 2500 && this.firstNum <= 5000) {
                this.list2.add(this.firstNum);
                System.out.println(this.firstNum + " added to ==> list2");
            } else if (this.firstNum > 5000 && this.firstNum <= 7500) {
                this.list3.add(this.firstNum);
                System.out.println(this.firstNum + " added to ==> list3");
            }else {
                this.list4.add(this.firstNum);
                System.out.println(this.firstNum + " added to ==> list4");
            }

            if (this.firstNum %2 == 0){
                this.evenList.add(this.firstNum);
                System.out.println(this.firstNum + " added to ==> even list");
            }else {
                this.oddList.add(this.firstNum);
                System.out.println(this.firstNum + " added to ==> odd list");
            }
            this.firstNum++;
        }

    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public synchronized List<Integer> getList1() {
        return list1;
    }

    public synchronized List<Integer> getList2() {
        return list2;
    }

    public synchronized List<Integer> getList3() {
        return list3;
    }

    public synchronized List<Integer> getList4() {
        return list4;
    }

    public synchronized List<Integer> getOddList() {
        return oddList;
    }

    public synchronized List<Integer> getEvenList() {
        return evenList;
    }
}
