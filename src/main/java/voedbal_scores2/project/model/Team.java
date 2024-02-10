package voedbal_scores2.project.model;

public class Team {
    private static final String DEFAULT_TEAM_NAME = "";
    private static final int DEFAULT_CONTEST_POINTS = 0;
    private static final int DEFAULT_GOALS = 0;
    private static final int DEFAULT_GOALS_CONCEDED = 0;


    private String teamName;
    private int totalContestPoints;
    private int totalGoals;
    private int totalGoalsConceded  ;


    public Team(String teamName) {
    }

    public Team() { }

    public int getGoalBalance() {
return 0;
    }

    public void printStatusTeam() {
    }

    public int getTotalPoints() {
        return 0;
    }

    public void setTotalPoints(int wedstrijdPunten) {
    }

    public int getTotalGoals() {
        return 0;
    }

    public void setTotalGoals(int totalGoals) {
    }

    public int getTotalGoalsConceded() {
        return totalGoalsConceded;
    }

    public void setTotalGoalsConceded(int totalGoalsConceded) {
        this.totalGoalsConceded = totalGoalsConceded;
    }
}
