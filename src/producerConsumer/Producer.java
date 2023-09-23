package producerConsumer;

public class Producer implements Runnable {
    private Store store;
    public Producer(Store st) {
        this.store = st;
    }
    public void run() {
        while (true) {
            synchronized (this.store) {
                if (this.store.getItems().size()<this.store.getMaxSize()) {
                    this.store.addItem();
                }
            }
        }

    }
}
