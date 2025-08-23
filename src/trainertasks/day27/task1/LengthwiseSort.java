package trainertasks.day27.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LengthwiseSort implements SortingStrategy {
    @Override
    public List<String> sort(List<String> items) {
        List<String> out = new ArrayList<>(items);
        out.sort(Comparator
                .comparingInt(String::length).reversed()
                .thenComparing(String::compareToIgnoreCase));
        return out;
    }
}