package collections.game_leaderboard_system;

import java.util.*;

class Player {

    private String name;
    private List<Integer> scores;

    public Player(String name) {
        this.name = name;
        this.scores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getScores() {
        return scores;
    }
}
