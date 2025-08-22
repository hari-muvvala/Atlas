package trainertasks.day26;

public class EasyDifficulty implements Difficulty {
    @Override
    public void applyRules() {
        System.out.println("EASY: more hints, relaxed rules, slower opponent.");
    }
}