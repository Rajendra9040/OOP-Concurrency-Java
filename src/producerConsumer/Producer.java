package producerConsumer;
import java.util.concurrent.Semaphore;


public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSema;
    private Semaphore consumerSema;

    public Producer(Store st, Semaphore producerSema, Semaphore consumerSema) {
        this.store = st;
        this.producerSema = producerSema;
        this.consumerSema = consumerSema;
    }
    public void run() {
        while (true) {
//            synchronized (this.store) {
//                if (this.store.getItems().size()<this.store.getMaxSize()) {
//                    this.store.addItem();
//                }
//            }
            try {
                this.producerSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.store.addItem();
            this.consumerSema.release();

        }

    }
}
