package adderSubtractorMutex;

public class Value {
    public int val;
    public Value(int v) {
        this.val = v;
    }

    public synchronized void incrementBy(int n) {
        this.val += n;
    }
    public synchronized void decrementBy(int n) {
        this.val -= n;
    }
}
