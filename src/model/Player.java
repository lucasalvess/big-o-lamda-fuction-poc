package model;

import java.util.List;

public class Player {

    private String name;
    private Integer level;
    private List<Video> lastMatches;

    public Player(String name, Integer level, List<Video> lastMatches) {
        this.name = name;
        this.level = level;
        this.lastMatches = lastMatches;
    }

    public String getName() {
        return name;
    }

    public Integer getLevel() {
        return level;
    }

    public List<Video> getLastMatches() {
        return lastMatches;
    }
}
