package voedbal_scores2.project.model;

public class Contest {
    private static final int DEFAULT_GOALS = 0;
    private static final Team DEFAULT_TEAM = new Team();


    private Team homeTeam;
    private Team awayTeam;
    private int homeGoals;
    private int awayGoals;

    public Contest(Team homeTeam, Team awayTeam, int homeGoals, int awayGoals) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public Contest(Team homeTeam, Team awayTeam) {
        this(homeTeam, awayTeam, DEFAULT_GOALS,DEFAULT_GOALS );
    }

    public Contest() {
        this(DEFAULT_TEAM,DEFAULT_TEAM);
    }

    public int getPointsHomeTeam() {
        if (homeGoals > awayGoals) {
            return 3;
        } else if (homeGoals == awayGoals) {
            return 1;
        } else {
            return 0;
        }
    }

    public int getPointsAwayTeam() {
        if (homeGoals < awayGoals) {
            return 3;
        } else if (homeGoals == awayGoals) {
            return 1;
        } else {
            return 0;
        }
    }

    public void setPointsHomeTeam() {
        int pointsHomeTeam = homeTeam.getTotalPoints();
        homeTeam.setTotalPoints(pointsHomeTeam + this.getPointsHomeTeam());
    }

    public void setPointsAwayTeam() {
        int pointsAwayTeam = awayTeam.getTotalPoints();
        awayTeam.setTotalPoints(pointsAwayTeam + this.getPointsAwayTeam());
    }

    public void setTotalGoalsTeams() {
        // 1. Werk het totaalVoorDoelpunten voor het thuisTeam bij.
        // Haal eerst het huidige totaalVoorDoelpunten van het thuisTeam op
        int totalGoalsHomeTeam = homeTeam.getTotalGoals();
        // Verhoog dit met de voorDoelpunten in deze wedstrijd (= thuisDoelpunten)
        totalGoalsHomeTeam += homeGoals;
        // Sla de nieuwe waarde op voor het thuisTeam
        homeTeam.setTotalGoals(totalGoalsHomeTeam);

        // 2. Werk het totaalTegenDoelpunten voor het thuisTeam bij.
        // Haal eerst het huidige totaalTegenDoelpunten van het thuisTeam op
        int totalGoalsConcededHomeTeam = homeTeam.getTotalGoalsConceded();
        // Verhoog dit met de tegenDoelpunten in deze wedstrijd (= uitDoelpunten)
        totalGoalsConcededHomeTeam += awayGoals;
        // Sla de nieuwe waarde op voor het thuisTeam
        homeTeam.setTotalGoalsConceded(totalGoalsConcededHomeTeam);

        // 3. Werk het totaalVoorDoelpunten voor het uitTeam bij.
        // Haal eerst het huidige totaalVoorDoelpunten van het uitTeam op
        int totalGoalsAwayTeam = awayTeam.getTotalGoals();
        // Verhoog dit met de voorDoelpunten in deze wedstrijd (= uitDoelpunten!!!)
        totalGoalsAwayTeam += awayGoals;
        // Sla de nieuwe waarde op voor het uitTeam
        awayTeam.setTotalGoals(totalGoalsAwayTeam);

        // 4. Werk het totaalTegenDoelpunten voor het uitTeam bij.
        // Haal eerst het huidige totaalTegenDoelpunten van het uitTeam op
        int totalGoalsConcededAwayTeam = awayTeam.getTotalGoalsConceded();
        // Verhoog dit met de tegenDoelpunten in deze wedstrijd (= thuisDoelpunten!!!)
        totalGoalsConcededAwayTeam += homeGoals;
        // Sla de nieuwe waarde op voor het uitTeam
        awayTeam.setTotalGoalsConceded(totalGoalsConcededAwayTeam);
        int totalGoalsConcededAway = awayTeam.getTotalGoalsConceded();

        // N.B. Je kunt de drie regels per stap ook combineren tot één regel.
        // Bijvoorbeeld de laatste stap wordt:
        // uitTeam.setTotaalTegenDoelpunten(uitTeam.getTotaalTegenDoelpunten() + thuisDoelpunten);
    }

    public void printResult() {
        System.out.println("De uitslag van de wedstrijd " + this.homeTeam.getTeamName() + "-" + this.awayTeam.getTeamName() + ": " + this.homeGoals + "-" + this.awayGoals);
    }

    public void printContestPoints() {
        if (getPointsHomeTeam() == 1) {
            System.out.printf("Dit levert 1 wedstrijdpunt voor %s en 1 wedstrijdpunt voor %s.\n", homeTeam, awayTeam);
        } else {
            System.out.printf("Dit levert %d wedstrijdpunten voor %s en %d wedstrijdpunten voor %s.\n",
                    getPointsHomeTeam(), homeTeam.getTeamName(), getPointsAwayTeam(),
                    awayTeam.getTeamName());
        }
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }


}
