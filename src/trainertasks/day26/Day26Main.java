package trainertasks.day26;

public class Day26Main {
    public static void main(String[] args) {
        ChessGame game = new ChessGame(new EasyDifficulty());
        game.start();

        game.setDifficulty(new MediumDifficulty());
        game.start();

        game.setDifficulty(new HardDifficulty());
        game.start();
    }
}