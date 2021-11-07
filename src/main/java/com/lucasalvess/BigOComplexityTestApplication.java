package com.lucasalvess;

import com.lucasalvess.model.Player;
import com.lucasalvess.model.Team;
import com.lucasalvess.util.PopulateHelper;
import com.lucasalvess.util.TimeUtil;

public class BigOComplexityTestApplication {

    public static void main(String[] args) {

        Player player = new Player("lcluphus", 10,
                PopulateHelper.generateVideoListByLength(5));

        Player proPlayer = new Player("patriot", 999,
                PopulateHelper.generateVideoListByLength(50));

        Team smallTeam = new Team("smallTeam", PopulateHelper.generatePlayerListByLength(10, 10));
        Team largeTeam = new Team("largeTeam", PopulateHelper.generatePlayerListByLength(100,100));


        TimeUtil.getPlayerInfoWithMetrics("Constant complexity with normal player", player);
        TimeUtil.getPlayerInfoWithMetrics("Constant complexity with pro player", proPlayer);

        TimeUtil.watchPlayerMatchesWithMetrics("Linear complexity with normal player", player);
        TimeUtil.watchPlayerMatchesWithMetrics("Linear complexity with pro player", proPlayer);

        TimeUtil.watchTeamMatchesWithMetrics("Quadratic complexity with small team", smallTeam);
        TimeUtil.watchTeamMatchesWithMetrics("Quadratic complexity with large team", largeTeam);

        TimeUtil.watchPlayerMatchesWithMetrics("Linear complexity with normal player LAMBDA", player);
        TimeUtil.watchPlayerMatchesWithMetrics("Linear complexity with pro player LAMBDA", proPlayer);

        TimeUtil.watchTeamMatchesWithMetrics("Quadratic complexity with small team LAMBDA", smallTeam);
        TimeUtil.watchTeamMatchesWithMetrics("Quadratic complexity with large team LAMBDA", largeTeam);

    }
}