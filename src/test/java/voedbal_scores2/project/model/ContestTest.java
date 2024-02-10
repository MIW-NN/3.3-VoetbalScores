package voedbal_scores2.project.model;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ContestTest {

    Team homeTeam;
    Team awayTeam;
    Contest contest;

    @Before
    public void initContest() {
        homeTeam =new Team("homeTeam");
        awayTeam = new Team("awayTeam");

        contest = new Contest(homeTeam, awayTeam, 0, 0);
    }

    @Test
    public void whenContestIsADraw_expect1PointForHomeAndAway(){
        Assert.assertEquals(1,contest.getPointsHomeTeam());
        Assert.assertEquals(1,contest.getPointsAwayTeam());
    }

    @Test
    public void whenHomeTeamWins_expect3PointForHomeAnd0ForAway(){
        contest.setHomeGoals(1);
        Assert.assertEquals(3,contest.getPointsHomeTeam());
        Assert.assertEquals(0,contest.getPointsAwayTeam());
    }

    @Test
    public void whenAwayTeamWins_expect0PointForHomeAnd3ForAway(){
        contest.setAwayGoals(1);
        Assert.assertEquals(0,contest.getPointsHomeTeam());
        Assert.assertEquals(3,contest.getPointsAwayTeam());
    }



    @Test
    public void whenCallingSetTotalGoalsTeams_expectGoalsToBeSetInTeams(){
        homeTeam.setTotalGoals(2);
        homeTeam.setTotalGoalsConceded(3);

        awayTeam.setTotalGoals(5);
        awayTeam.setTotalGoalsConceded(2);

        contest.setHomeGoals(5);
        contest.setAwayGoals(5);

        contest.setTotalGoalsTeams();

        Assert.assertEquals(7, homeTeam.getTotalGoals());
        Assert.assertEquals(8, homeTeam.getTotalGoalsConceded());

        Assert.assertEquals(10, awayTeam.getTotalGoals());
        Assert.assertEquals(7, awayTeam.getTotalGoalsConceded());
    }

    @Test
    public void whenCAllingSetPoints_expectPointsToBeSetInTeam(){
        homeTeam.setTotalPoints(6);

        awayTeam.setTotalPoints(3);

        contest.setHomeGoals(2);
        contest.setAwayGoals(1);

        contest.setPointsHomeTeam();
        contest.setPointsAwayTeam();

        Assert.assertEquals(9,homeTeam.getTotalPoints());
        Assert.assertEquals(3,awayTeam.getTotalPoints());
    }
}