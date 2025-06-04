public class GuessResult {
    private boolean solved;
    private int strikes;
    private int balls;

    public GuessResult(boolean solved, int strikes, int balls) {
        this.solved = solved;
        this.strikes = strikes;
        this.balls = balls;
    }

    public GuessResult setSolved(boolean solved) {
        this.solved = solved;
        return this;
    }

    public GuessResult setStrikes(int strikes) {
        this.strikes = strikes;
        return this;
    }

    public GuessResult setBalls(int balls) {
        this.balls = balls;
        return this;
    }

    public boolean isSolved() {
        return solved;
    }

    public int getStrikes() {
        return strikes;
    }

    public int getBalls() {
        return balls;
    }
}
