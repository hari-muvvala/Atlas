package trainertasks.day27.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStretagy {
    private final List<String> items = new ArrayList<>();
    private SortingStrategy strategy;

    public void setStretegyForSorting(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void addItem(String s) {
        if (s != null && !s.isBlank()) items.add(s);
    }

    public List<String> performSort() {
        if (strategy == null) return getList();
        return strategy.sort(items);
    }

    public List<String> getList() {
        return Collections.unmodifiableList(items);
    }
}