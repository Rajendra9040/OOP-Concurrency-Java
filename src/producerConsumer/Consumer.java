package producerConsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;


    public Consumer(Store st, Semaphore producerSema, Semaphore consumerSema) {
        this.store = st;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }

    public void run() {
        while (true) {
//            synchronized (this.store) {
//                if (this.store.getItems().size()>0) {
//                    this.store.removeItem();
//                }
//            }

            try {
                this.consumerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.store.removeItem();
            this.producerSema.release();

        }

    }
}
