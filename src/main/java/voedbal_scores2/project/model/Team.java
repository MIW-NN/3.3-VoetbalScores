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

    public Team(String teamName, int totalContestPoints, int totalGoals, int totalGoalsConceded) {
        this.teamName = teamName;
        this.totalContestPoints = totalContestPoints;
        this.totalGoals = totalGoals;
        this.totalGoalsConceded = totalGoalsConceded;
    }

    public Team(String teamName) {
        this(teamName, DEFAULT_CONTEST_POINTS, DEFAULT_GOALS,DEFAULT_GOALS_CONCEDED);
    }

    public Team() {
        this(DEFAULT_TEAM_NAME);
    }

    public int getGoalBalance() {
        return totalGoals - totalGoalsConceded;
    }

    public void printStatusTeam() {
        System.out.printf("Het team %s heeft %d wedstrijdpunten en een doelsaldo van %d\n", teamName, totalContestPoints, this.getGoalBalance());
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTotalPoints() {
        return totalContestPoints;
    }

    public void setTotalPoints(int wedstrijdPunten) {
        this.totalContestPoints = wedstrijdPunten;
    }

    public int getTotalGoals() {
        return totalGoals;
    }

    public void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    public int getTotalGoalsConceded() {
        return totalGoalsConceded;
    }

    public void setTotalGoalsConceded(int totalGoalsConceded) {
        this.totalGoalsConceded = totalGoalsConceded;
    }
}
