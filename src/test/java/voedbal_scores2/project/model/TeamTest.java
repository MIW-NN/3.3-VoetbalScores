package voedbal_scores2.project.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TeamTest {

    @Test
    public void whenGettingCoalBalance_expectTheRightValue(){
        var team = new Team("team1");
        team.setTotalGoals(5);
        team.setTotalGoalsConceded(3);

        Assert.assertEquals(2,team.getGoalBalance());
    }
}