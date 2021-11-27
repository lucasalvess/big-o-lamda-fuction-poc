package com.lucasalvess.service;

import com.lucasalvess.model.Player;
import com.lucasalvess.model.Video;
import com.lucasalvess.model.Team;

import java.util.Collection;
import java.util.List;

public class PlayerService {

    public static void getPlayerInfo(Player player) {
        //Constant complexity O(1)
        System.out.println("Player: " + player.getName());
        System.out.println("Level: " + player.getLevel());
    }

    public static void watchPlayerMatches(Player player) {
        //Linear complexity O(n)
        List<Video> matches = player.getLastMatches();

        for (Video match : matches) {
            match.watch();
        }
    }

    public static void watchTeamMatches(Team team) {
        //Quadratic complexity O(2)
        for (Player player : team.getPlayers()){
            for (Video match : player.getLastMatches()) {
                match.watch();
            }
        }
    }

    public static void watchPlayerMatchesWithLambda(Player player) {
        //Linear complexity O(n)
        player.getLastMatches().forEach(Video::watch);
    }

    public static void watchTeamMatchesWithLambda(Team team) {
        //Quadratic complexity O(2)
        team.getPlayers().stream()
                .map(Player::getLastMatches)
                .flatMap(Collection::stream)
                .forEach(Video::watch);

    }
}
