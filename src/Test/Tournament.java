package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eitan on 05/02/2018.
 */
public class Tournament {

    private List<Game1> games;
    private List<Team> teams;

    public Tournament(){
        super();
        this.games = new ArrayList<>();
        this.teams = new ArrayList<>();
    }


    public List<Game1> getGames() {
        return games;
    }

    public void setGames(List<Game1> games) {
        this.games = games;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "games=" + games +
                ", teams=" + teams +
                '}';
    }
}
