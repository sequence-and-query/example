import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    public void createGame() {
        Game game = new Game();
        assertNotNull(game);
    }

    @Test
    public void throwExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () ->  {
            Game game = new Game();
            game.guess(null);
        });
    }
}
