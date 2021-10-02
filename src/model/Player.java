package model;

import java.util.List;

public class Player {

    private String name;

    public Player(String name, List<Video> lastMatches) {
        this.name = name;
        this.lastMatches = lastMatches;
    }

    private List<Video> lastMatches;


    public String getName() {
        return name;
    }

    public List<Video> getLastMatches() {
        return lastMatches;
    }
}
