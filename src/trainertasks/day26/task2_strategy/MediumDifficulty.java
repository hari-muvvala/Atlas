package trainertasks.day26.task2_strategy;

public class MediumDifficulty implements DifficultyStrategy {
    @Override public void changeGameRules() {
        System.out.println("[Medium] Balanced obstacles, limited hints.");
    }
    @Override public String name() { return "MEDIUM"; }
}