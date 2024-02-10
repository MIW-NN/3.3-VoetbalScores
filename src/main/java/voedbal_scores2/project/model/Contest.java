package voedbal_scores2.project.model;

public class Contest {
    private static final int DEFAULT_GOALS = 0;
    private static final Team DEFAULT_TEAM = new Team();


    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;

    public Contest(Team homeTeam, Team awayTeam, int homeGoals, int awayGoals) {
    }

    public int getPointsHomeTeam() {
            return 0;
    }

    public int getPointsAwayTeam() {
            return 0;
    }

    public void setPointsHomeTeam() {
    }

    public void setPointsAwayTeam() {
    }

    public void setTotalGoalsTeams() {
}

    public void printResult() {
    }

    public void printContestPoints() {
    }

    public void setHomeGoals(int homeGoals) {
    }

    public void setAwayGoals(int awayGoals) {

    }
}
