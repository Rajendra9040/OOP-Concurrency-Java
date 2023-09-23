package cuncurrency;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        HelloWorldPrinter hwp = new HelloWorldPrinter();
//        hwp.run();
//        Thread t = new Thread(hwp);
//        t.start();
//        System.out.println("Main Function : " + Thread.currentThread().getName());
//        ExecutorService ex = Executors.newFixedThreadPool(5);
        ExecutorService ex = Executors.newCachedThreadPool();
        for (int i=0; i<1000; i++) {
            NumberPrinter np = new NumberPrinter(i);
//            Thread t = new Thread(np);
//            t.start();
            ex.execute(np);
        }
    }
}
