package trainertasks.day26;

public class ChessGame {
    private Difficulty difficulty;

    public ChessGame(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public void start() {
        System.out.println("Starting Chess game (Strategy pattern)...");
        difficulty.applyRules();
        System.out.println("Game started.\n");
    }
}