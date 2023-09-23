package cuncurrency;

public class NumberPrinter implements  Runnable {
    public int num;

    public NumberPrinter (int n) {
        this.num = n;
    }
    public void run() {
        System.out.println(this.num + Thread.currentThread().getName());
    }
}
