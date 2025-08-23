package trainertasks.day27.task1;

import java.util.ArrayList;
import java.util.List;

public class AlphabeticalSort implements SortingStrategy {
    @Override
    public List<String> sort(List<String> items) {
        List<String> out = new ArrayList<>(items);
        out.sort(String.CASE_INSENSITIVE_ORDER);
        return out;
    }
}