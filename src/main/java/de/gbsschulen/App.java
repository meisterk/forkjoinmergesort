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
        // Eingabe: unsortiert
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(17);
        list.add(35);
        list.add(-8);
        list.add(0);
        list.add(36);
        list.add(1);

        // sortieren
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        SortierenTask sortierenTask = new SortierenTask(list);
        forkJoinPool.invoke(sortierenTask);

        try {
            // Ausgabe: sortiert
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
