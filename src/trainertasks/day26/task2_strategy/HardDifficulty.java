package trainertasks.day26.task2_strategy;

public class HardDifficulty implements DifficultyStrategy {
    @Override public void changeGameRules() {
        System.out.println("[Hard] More obstacles, no hints.");
    }
    @Override public String name() { return "HARD"; }
}