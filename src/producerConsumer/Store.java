package producerConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public List<Object> getItems() {
        return this.items;
    }

    public void addItem() {
        this.items.add(new Object());
        System.out.println("Producer produced : size = " + this.getItems().size());
    }

    public void removeItem() {
        this.items.remove(this.items.size()-1);
        System.out.println("Consumer consume : size = " + this.getItems().size());
    }
}
