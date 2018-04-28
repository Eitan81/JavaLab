package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eitan on 05/02/2018.
 */
public class Team {
    private String groupName;
    private List<Player> player;
    private int points;

    public Team() {
        super();
        this.groupName = new ArrayList<>();
        this.player = new ArrayList<>();
        this.points = new ArrayList<>();
    }
}
