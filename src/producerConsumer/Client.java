package producerConsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws Exception {
        Store st = new Store(6);
        ExecutorService es = Executors.newCachedThreadPool();

        for (int i=0; i<5; i++) {
            es.execute(new Producer(st));
        }

        for (int i=0; i<5; i++) {
            es.execute(new Consumer(st));
        }


    }


}
