import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Player {
    String name;
    int Score;
    private final List<Player> players = new ArrayList<>();

    public Player(String name, int score) {
        this.name = name;
        Score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return Score;
    }



    @Override
    public String toString() {
        return String.format("%s: name=%s, score=%s",getClass().getSimpleName(),getName(),getScore());
    }
}