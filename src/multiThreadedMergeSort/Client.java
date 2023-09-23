package multiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> arrToSort = List.of(1, 8, 2, 9, 6, 3, 4, 5, 12, 10);

        ExecutorService es = Executors.newCachedThreadPool();
        Sorter toSortSorter = new Sorter(arrToSort, es);
        Future<List<Integer>> toSortFuture = es.submit(toSortSorter);
        List<Integer> response = toSortFuture.get();

        for(int num: response) {
            System.out.println(num);
        }
    }
}
