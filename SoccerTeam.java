public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    public static int gamesp;
    public static int goalss;

    public SoccerTeam(int win, int los, int tie){
        wins = win;
        losses = los;
        ties = tie;
    }

    public SoccerTeam(){
        wins = 0;
        losses = 0;
        ties = 0;
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        if(myScore > otherScore){
            this.wins++;
            other.losses++;
        }
        else if(myScore < otherScore){
            this.losses++;
            other.wins++;
        }
        else{
            this.ties++;
            other.ties++;
        }
        gamesp++;
        goalss = goalss +myScore + otherScore;
    }
    
    public int getPoints(){
        return wins*3 + ties;
    }

    public void reset(){
        wins = 0;
        ties = 0;
        losses = 0;
 
    }

    public void startTournament(){
        SoccerTeam.gamesp = 0;
        SoccerTeam.goalss = 0;
    }

    public static int getGamesPlayed(){
        return gamesp;
    }

    public static int getGoalsScored(){
        return goalss;
    }

    public static void main(String[] args) {
        SoccerTeam t1 = new SoccerTeam();
        SoccerTeam t2 = new SoccerTeam();
        SoccerTeam t3 = new SoccerTeam();
        SoccerTeam t4 = new SoccerTeam();

        t1.startTournament();
        System.out.println("Tournament 1: Regular Season");
        t1.played(t2, 2, 0);
        System.out.println("Team 1 points: " + t1.getPoints());
        System.out.println("Team 2 points: " + t2.getPoints());
        System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
        System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
        System.out.println();
        t3.played(t4, 5, 0);
        System.out.println("Team 3 points: " + t3.getPoints());
        System.out.println("Team 4 points: " + t4.getPoints());
        System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
        System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
        System.out.println();
        t1.played(t3, 3, 3);
        System.out.println("Team 1 points: " + t1.getPoints());
        System.out.println("Team 3 points: " + t3.getPoints());
        System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
        System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
        System.out.println();
        t2.played(t4, 2, 1);
        System.out.println("Team 2 points: " + t2.getPoints());
        System.out.println("Team 4 points: " + t4.getPoints());
        System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
        System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());
        System.out.println();

        t1.startTournament();
        System.out.println("Tournament 2: Gauntlet ");
        t1.reset();
        t2.reset();
        t3.reset();
        t4.reset();
        t1.played(t2, 1, 0);
        t1.played(t3, 3, 2);
        t1.played(t4, 4, 1);
        t2.played(t3, 0, 1);
        t2.played(t4, 2, 3);
        t3.played(t4, 2, 2);
        t1.played(t2, 1, 3);
        t1.played(t3, 1, 2);
        t1.played(t4, 1, 1);
        t2.played(t3, 3, 1);
        t2.played(t4, 0, 4);
        t3.played(t4, 3, 2);
        System.out.println("Team 1 points: " + t1.getPoints());
        System.out.println("Team 2 points: " + t2.getPoints());
        System.out.println("Team 3 points: " + t3.getPoints());
        System.out.println("Team 4 points: " + t4.getPoints());
        System.out.println("Games played: " + SoccerTeam.getGamesPlayed());
        System.out.println("Goals scored: " + SoccerTeam.getGoalsScored());   
    }
}
