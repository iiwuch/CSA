public class SoccerTeam {
    private int wins;
    private int losses;
    private int ties;
    private static int gamesp;
    private static int points;

    public SoccerTeam(int win, int los, int tie){
        wins = win;
        losses = los;
        ties = tie;
    }

    public void played(SoccerTeam other, int myScore, int otherScore){
        if(myScore > otherScore){
            this.wins ++;
            other.losses ++;

        }
        if(myScore < otherScore){
            this.losses++;
            other.wins++;
        }
        else{
            this.ties++;
            other.ties++;
        }
        this.gamesp++;
        other.gamesp++;
    }
    
    public int getPoints(SoccerTeam other){
        return wins*3 + ties;
    }

    public void reset(SoccerTeam other){
        wins = 0;
        ties = 0;
        losses = 0;
    }

    public static startTournament(){
        
    }

    public static void main(String[] args){

    }
}
