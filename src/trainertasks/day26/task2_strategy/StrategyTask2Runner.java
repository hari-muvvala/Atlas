package trainertasks.day26.task2_strategy;

public class StrategyTask2Runner {
    public static void main(String[] args) {
        ChessGameContext game = new ChessGameContext(); // default MEDIUM
        game.startGame();

        game.setDifficulty(new EasyDifficulty());
        game.startGame();

        game.setDifficulty(new HardDifficulty());
        game.startGame();
    }
}