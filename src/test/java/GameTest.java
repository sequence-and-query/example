import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    public void throwExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () ->  {
            game.guess(null);
        });
    }

    @Test
    public void throwExceptionWhenInputLengthIsUnmatched(){
        assertThrows(IllegalArgumentException.class, () -> {
            game.guess("11");
        });
    }
}
