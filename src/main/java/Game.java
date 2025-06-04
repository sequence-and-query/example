public class Game {

    public void guess(Object o) {
        if(o == null) {
            throw new IllegalArgumentException("Input value is null");
        }
    }
}
