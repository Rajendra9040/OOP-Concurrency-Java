package adderSubtractorMutex;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Value> {
    public Value v;
    public Subtractor(Value v) {
        this.v = v;
    }

    public Value call() {

        for (int i=1; i<50000; i++) {
            this.v.decrementBy(i);
        }
        return this.v;
    }
}
