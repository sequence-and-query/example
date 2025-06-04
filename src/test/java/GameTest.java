import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    private Game game;

    @BeforeEach
    public void setUp() {
        game = new Game();
    }

    @Test
    public void createGame() {
        assertNotNull(game);
    }

    private void assertIllegalArgument(String guessNumber) {
        try {
            game.guess(guessNumber);
            fail();
        } catch (IllegalArgumentException e) {

        }
    }

    @Test
    public void throwIllegalArgumentExceptionInvalidInput() {
        assertIllegalArgument(null);
        assertIllegalArgument("12");
        assertIllegalArgument("1234");
        assertIllegalArgument("12h");
        assertIllegalArgument("121");
    }

    @Test
    void returnSolvedResultIfMatchedNumber() {
        generateQuestion("123");
        assertMatched(game.guess("123"), true, 3, 0);
    }

    @Test
    public void returnSolvedResultIfUnMatchedNumber() {
        generateQuestion("123");
        assertMatched(game.guess("456"), false, 0, 0);
    }

    @Test
    public void returnResultTwoStrikesZeroBall() {
        generateQuestion("123");
        assertMatched(game.guess("143"), false, 2, 0);
    }

    @Test
    public void returnResultOneStrikeTwoBalls() {
        generateQuestion("123");
        assertMatched(game.guess("132"), false, 1, 2);
    }

    private void assertMatched(GuessResult result, boolean solved, int strikes, int balls) {
        assertThat(result).isNotNull();
        assertThat(result.isSolved()).isEqualTo(solved);
        assertThat(result.getStrikes()).isEqualTo(strikes);
        assertThat(result.getBalls()).isEqualTo(balls);
    }

    private void generateQuestion(String question) {
        game.question = question;
    }
}
