package trainertasks.day26.task2_strategy;

public class ChessGameContext {
    private DifficultyStrategy strategy;

    // default to MEDIUM
    public ChessGameContext() {
        this.strategy = new MediumDifficulty();
    }

    public void setDifficulty(DifficultyStrategy strategy) {
        this.strategy = strategy;
        System.out.println(">> Difficulty set to " + strategy.name());
    }

    public void startGame() {
        System.out.println("Starting Chess with rules for " + strategy.name());
        strategy.changeGameRules();
    }
}