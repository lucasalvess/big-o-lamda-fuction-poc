package util;

import model.Player;
import model.Team;
import service.PlayerService;

public class TimeUtil {

    public static void getPlayerInfoWithMetrics(String processCase, Player player) {
        long start = System.currentTimeMillis();
        PlayerService.getPlayerInfo(player);
        long time = System.currentTimeMillis() - start;
        System.out.printf("Process %s took %d ms %n", processCase, time);
    }

    public static void watchPlayerMatchesWithMetrics(String processCase, Player player) {
        long start = System.currentTimeMillis();
        PlayerService.watchPlayerMatches(player);
        long time = System.currentTimeMillis() - start;
        System.out.printf("Process %s took %d ms %n", processCase, time);
    }

    public static void watchTeamMatchesWithMetrics(String processCase, Team team) {
        long start = System.currentTimeMillis();
        PlayerService.watchTeamMatches(team);
        long time = System.currentTimeMillis() - start;
        System.out.printf("Process %s took %d ms %n", processCase, time);
    }

}
