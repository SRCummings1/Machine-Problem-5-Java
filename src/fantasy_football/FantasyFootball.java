package fantasy_football;

import java.util.Scanner;

	public class FantasyFootball {

	    private int numberOfTeams; // Same as teamAverage.length.
	    private int numberOfWeeks; // Same as weekAverage.length.
	    private int[][] scores; //numberOfTeams rows and numberOfWeeks columns.
	    private double[] weekAverage; // contains an entry for each week
	    private double[] teamAverage; // contains an entry for each team
	    private String[] teamName; // contains an entry for each team

	    public void enterInData() {
	        Scanner keyboard = new Scanner(System.in);
	        System.out.println("Enter number of teams:");
	        numberOfTeams = keyboard.nextInt();
	        System.out.println("Enter number of weeks:");
	        numberOfWeeks = keyboard.nextInt();keyboard.nextLine();
	// ************** Fill in Code ***************
	// Allocate array memory for teamName to store the team names.
	        teamName = new String[numberOfTeams];
	// Allocate array memory for scores (2 dimensional array) to store a// score for each team for each week.
	        scores = new int[numberOfTeams][numberOfWeeks];
	        for (int team = 0; team < numberOfTeams; team++) {
	            System.out.println("Enter team name");
	            teamName[team] = keyboard.nextLine();
	// ************* Fill in Code **************
	// Read in Team name and store it in teamName
	            for (int week = 0; week < numberOfWeeks; week++) {
	                System.out.print("Enter score for team " + teamName[team]);
	                System.out.print("on week number " + (week + 1)+"\n");
	                scores[team][week] = keyboard.nextInt();keyboard.nextLine();
	// ************ Fill in Code ***************
	// Read in a score and store it in the proper spot in the scores array
	            }
	        }
	    }

	    public void fillTeamAverage() {
	//********* Fill in Code *************
	// Allocate memory for the teamAverage.
	// Each entry in this array will contain the
	// average weekly score for a given team.
	        teamAverage = new double[numberOfTeams];
	        for (int team = 0; team < numberOfTeams; team++) {
	            double totalPoints = 0;
	            for (int week = 0; week < numberOfWeeks; week++) {
	                totalPoints += scores[team][week];
	            }
	            teamAverage[team] = totalPoints / numberOfWeeks;
	        }
	    }

	    public void fillWeekAverage() {

	//*********** Fill in Code *************
	// Allocate memory for the weekAverage instance variable.
	// Each entry in this array will contain the average of
	// all teams for a given week.
	        weekAverage = new double[numberOfWeeks];
	        for (int week = 0; week < numberOfWeeks; week++) {
	            double totalWeeklyPoints = 0.0;
	            for (int team = 0; team < numberOfTeams; team++) {
	                totalWeeklyPoints += scores[team][week];
	            }
	            weekAverage[week] = totalWeeklyPoints / numberOfTeams;
	        }
	    }

	    public void display() {

	//********* Fill in Code ****************
	// This method will print out the display that was shown above.
	// At this point all of the information can be found in the
	// private instance variables of the FantasyFootball class

	        for (int team = 0; team < numberOfTeams; team++) {
	            System.out.print("\n"+teamName[team] + " ");
	            for (int week = 0; week < numberOfWeeks; week++) {
	                System.out.print(scores[team][week] + " ");
	            }
	            System.out.print("Avg = " + (int) teamAverage[team]);
	        }

	        System.out.print("\nWeekly Ave: ");
	        for (int week = 0; week < numberOfWeeks; week++) {
	            System.out.print((int) weekAverage[week]+" ");
	        }
	    }

	    public static void main(String[] args) {

	        FantasyFootball f = new FantasyFootball();
	        f.enterInData();
	        f.fillTeamAverage();
	        f.fillWeekAverage();
	        f.display();

	    }

	}
