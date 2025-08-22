package trainertasks.day26.task2_strategy;

public class EasyDifficulty implements DifficultyStrategy {
    @Override public void changeGameRules() {
        System.out.println("[Easy] Fewer obstacles, more hints.");
    }
    @Override public String name() { return "EASY"; }
}