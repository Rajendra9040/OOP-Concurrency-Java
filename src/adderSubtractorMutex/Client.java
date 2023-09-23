package adderSubtractorMutex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception{
        Value v = new Value(0);
        Adder add = new Adder(v);
        Subtractor sub = new Subtractor(v);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Value> addFuture = es.submit(add);
        Future<Value> subFuture = es.submit(sub);
        addFuture.get();
        subFuture.get();
        System.out.println(v.val);
    }
}
