package producerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return this.items;
    }

    public void addItem() {
        this.items.add(new Object());
        System.out.println("Producer produced : size = " + this.getItems().size());
    }

    public void removeItem() {
        this.items.remove();
        System.out.println("Consumer consume : size = " + this.getItems().size());
    }
}
