package com.lucasalvess;

import com.lucasalvess.model.Team;
import com.lucasalvess.util.PopulateHelper;
import com.lucasalvess.util.TimeUtil;

public class LambdaPerformanceTestApplication {

    public static void main(String[] args) {

        Team largeTeam = new Team("largeTeam", PopulateHelper.generatePlayerListByLength(100,100));
        TimeUtil.watchTeamMatchesWithMetrics("Quadratic complexity with large team LAMBDA", largeTeam);
    }
}
