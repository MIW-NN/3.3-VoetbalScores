package voedbal_scores2.project.controller;

import voedbal_scores2.project.model.*;

import java.util.Scanner;

public class SoccerScoresLauncher {

    public static void main(String[] args) {
        // stap 3: test Team
        Team twente = new Team("Twente", 15, 28, 12);
        twente.printStatusTeam();
        System.out.println();

        // stap 5: test Wedstrijd
        Team ajax = new Team("Ajax");
        Team pec = new Team("PEC");
        Contest wedstrijd = new Contest(ajax, pec, 5, 0);
        wedstrijd.printResult();
        wedstrijd.printContestPoints();
        System.out.println();

        // stap 6: basis
        final int NUMBER_OF_TEAMS = 3;
        Team[] teams = new Team[NUMBER_OF_TEAMS];
        teams[0] = new Team("VVV");
        teams[1] = new Team("NAC");
        teams[2] = new Team("PEC");
        final int NUMBER_OF_CONTESTS = 6;
        Contest[] contests = new Contest[NUMBER_OF_CONTESTS];
        contests[0] = new Contest(teams[0],teams[1]);
        contests[1] = new Contest(teams[0],teams[2]);
        contests[2] = new Contest(teams[1],teams[2]);
        contests[3] = new Contest(teams[1],teams[0]);
        contests[4] = new Contest(teams[2],teams[0]);
        contests[5] = new Contest(teams[2],teams[1]);
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < NUMBER_OF_CONTESTS; i++) {
            System.out.print("Geef van de wedstrijd " + contests[i].getHomeTeam().getTeamName() + "-" +
                    contests[i].getAwayTeam().getTeamName() + " de thuisdoelpunten: ");
            contests[i].setHomeGoals(input.nextInt());
            System.out.print("Geef van de wedstrijd " + contests[i].getHomeTeam().getTeamName() + "-" +
                    contests[i].getAwayTeam().getTeamName() + " de uitdoelpunten: ");
            contests[i].setAwayGoals(input.nextInt());
        }
        for (int i = 0; i < NUMBER_OF_CONTESTS; i++) {
            contests[i].printResult();
            contests[i].setPointsHomeTeam();
            contests[i].setPointsAwayTeam();
            contests[i].setTotalGoalsTeams();
        }

        for (int i = 0; i < teams.length; i++) {
            teams[i].printStatusTeam();
        }

		/*
		// stap 7 gevorderden
		// Vraag naar aantal teams
		int numberOfTeams;
		System.out.print("Voor hoeveel teams wil je wedstrijden bijhouden: ");
		numberOfTeams = input.nextInt();
		teams = new Team[numberOfTeams];
		// Vraag naar de namen van de teams
		for (int i = 0; i < teams.length; i++) {
			System.out.print("Geef de naam van team " + (i+1) +": ");
			teams[i] = new Team(input.next());
		}

		// Bepaal het aantal wedstrijden
		int numberOfContests = numberOfTeams * (numberOfTeams - 1);
		contests = new Contest[numberOfContests];
		// Vul de array wedstrijden. Hier wordt de eerste helft van de competitie gevuld.
		int contestCounter = 0;
		for (int homeTeamCounter = 0; homeTeamCounter < numberOfTeams - 1; homeTeamCounter++) {
			for (int awayTeamCounter = homeTeamCounter + 1; awayTeamCounter < numberOfTeams; awayTeamCounter++) {
				contests[contestCounter] = new Contest(teams[homeTeamCounter], teams[awayTeamCounter]);
				contestCounter++;
			}
		}

		// Voor de tweede helft van de competitie woorden de thuisTeams en uitTeams gewisseld
		for (int wedstrijdTeller2 = numberOfContests / 2; wedstrijdTeller2 < numberOfContests; wedstrijdTeller2++) {
			int nrHeenWedstrijd = wedstrijdTeller2 - numberOfContests / 2;
			contests[wedstrijdTeller2] = new Contest(contests[nrHeenWedstrijd].getAwayTeam(), contests[nrHeenWedstrijd].getHomeTeam());
		}

		// Vraag naar de uitslagen
		for (int i = 0; i < numberOfContests; i++) {
			System.out.print("Geef van de wedstrijd " + contests[i].getHomeTeam().getTeamName() + "-" +
					contests[i].getAwayTeam().getTeamName() + " de thuisdoelpunten: ");
			contests[i].setHomeGoals(input.nextInt());
			System.out.print("Geef van de wedstrijd " + contests[i].getHomeTeam().getTeamName() + "-" +
					contests[i].getAwayTeam().getTeamName() + " de uitdoelpunten: ");
			contests[i].setAwayGoals(input.nextInt());
		}

		// Toon de resultaten en werk de teams bij.
		for (int i = 0; i < numberOfContests; i++) {
            contests[i].printResult();
            contests[i].setPointsHomeTeam();
            contests[i].setPointsAwayTeam();
            contests[i].setTotalGoalsTeams();
		}

		for (int i = 0; i < teams.length; i++) {
			teams[i].printStatusTeam();
		}
	*/
    }
}
