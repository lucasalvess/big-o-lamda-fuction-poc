package service;

import model.Player;
import model.Team;
import model.Video;

import java.util.List;

public class PlayerService {

    public static void getPlayerInfo(Player player){
        //Constant complexity O(1)
        System.out.println("Player: " + player.getName());
        System.out.println("Level: " + player.getLevel());
    }

    public static void watchPlayerMatches(Player player){
        //Linear complexity O(n)
        List<Video> matches = player.getLastMatches();

        for (Video match : matches) {
            match.watch(player);
        }
    }

    public static void watchTeamMatches(Team team){
        //Quadratic complexity O(2)
        for (Player player : team.getPlayers()){
            for (Video match : player.getLastMatches()) {
                match.watch(player);
            }
        }
    }
}
