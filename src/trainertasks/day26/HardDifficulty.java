package trainertasks.day26;

public class HardDifficulty implements Difficulty {
    @Override
    public void applyRules() {
        System.out.println("HARD: no hints, strict rules, strong opponent.");
    }
}