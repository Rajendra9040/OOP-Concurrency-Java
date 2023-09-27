package producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) throws Exception {
        Store st = new Store(6);
        ExecutorService es = Executors.newCachedThreadPool();
        Semaphore producerSema = new Semaphore(5);
        Semaphore consumerSema = new Semaphore(0);

        for (int i=0; i<5; i++) {
            es.execute(new Producer(st, producerSema, consumerSema));
        }

        for (int i=0; i<5; i++) {
            es.execute(new Consumer(st, producerSema, consumerSema));
        }


    }


}
