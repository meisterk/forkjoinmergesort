package de.gbsschulen;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        List<Integer> list = new ArrayList<>();

        SortierenTask sortierenTask = new SortierenTask(list);
        forkJoinPool.invoke(sortierenTask);
        try {
            List<Integer> listSortiert = sortierenTask.get();
            for (int zahl : listSortiert) {
                System.out.print(zahl + " ");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
