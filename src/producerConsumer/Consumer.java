package producerConsumer;

public class Consumer implements Runnable {
    private Store store;


    public Consumer(Store st) {
        this.store = st;
    }

    public void run() {
        while (true) {
            synchronized (this.store) {
                if (this.store.getItems().size()>0) {
                    this.store.removeItem();
                }
            }

        }

    }
}
