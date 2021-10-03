import model.Player;
import model.Team;
import util.PopulateHelper;
import util.TimeUtil;

public class TestApplication {

    public static void main(String args[]) {

        Player player = new Player("lcluphus", 10,
                PopulateHelper.generateVideoListByLength(5));

        Player proPlayer = new Player("patriot", 999,
                PopulateHelper.generateVideoListByLength(500));

        Team smallTeam = new Team("smallTeam", PopulateHelper.generatePlayerListByLength(10));
        Team largeTeam = new Team("largeTeam", PopulateHelper.generatePlayerListByLength(100));


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