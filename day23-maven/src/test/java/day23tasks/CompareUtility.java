package day23tasks;

public class CompareUtility {
    public int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 < n2) return -1;
        return 0; // Handles case when both numbers are equal
    }
}