package de.gbsschulen;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SortierenTask extends RecursiveTask<List<Integer>> {
    private List<Integer> unsortierteListe;

    public SortierenTask(List<Integer> unsortierteListe) {
        this.unsortierteListe = unsortierteListe;
    }

    @Override
    protected List<Integer> compute() {
        List<Integer> sortierteListe = unsortierteListe;
        // TODO: unsortierteListe sortieren
        return sortierteListe;
    }
}
