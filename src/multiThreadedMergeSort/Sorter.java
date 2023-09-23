package multiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {
    public List<Integer> arrayToSort;
    public  ExecutorService es;

    Sorter(List<Integer> x, ExecutorService es) {
        this.arrayToSort = x;
        this.es = es;
    }

    public List<Integer> call() throws Exception {

        int size = arrayToSort.size();
        if (size<=1) {
            return arrayToSort;
        }
        int mid = size/2;
        List<Integer> leftarr = new ArrayList<>();
        List<Integer> rightarr = new ArrayList<>();

        for (int i=0; i<mid; i++) {
            leftarr.add(arrayToSort.get(i));
        }

        for (int i=mid; i<size; i++) {
            rightarr.add(arrayToSort.get(i));
        }

//        ExecutorService es = Executors.newCachedThreadPool();
        Sorter leftArrToSorter = new Sorter(leftarr, es);
        Sorter rightArrToSorter = new Sorter(rightarr, es);

        Future<List<Integer>> leftArrToSorterFuture = es.submit(leftArrToSorter);
        Future<List<Integer>> rightArrToSorterFuture = es.submit(rightArrToSorter);

        List<Integer> sortedLeftArray = leftArrToSorterFuture.get();
        List<Integer> sortedRightArray = rightArrToSorterFuture.get();

        List<Integer> sortedArray = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1<sortedLeftArray.size() && p2<sortedRightArray.size()) {
            int lp = sortedLeftArray.get(p1);
            int rp = sortedRightArray.get(p2);
            if (lp<rp) {
                sortedArray.add(lp);
                p1++;
            }else{
                sortedArray.add(rp);
                p2++;
            }
        }
        if (p1==sortedLeftArray.size()) {
            while(p2<sortedRightArray.size()) {
                sortedArray.add(sortedRightArray.get(p2));
                p2++;
            }
        }else{
            while(p1<sortedLeftArray.size()) {
                sortedArray.add(sortedLeftArray.get(p1));
                p1++;
            }
        }

        return sortedArray;
    }
}
