package adderSubtractorMutex;

import java.util.concurrent.Callable;

public class Adder implements Callable<Value> {
    public Value v;
    public Adder(Value v) {
        this.v = v;
    }

    public Value call() {
        for (int i=1; i<50000; i++) {
            this.v.incrementBy(i);
        }
        return this.v;
    }
}
