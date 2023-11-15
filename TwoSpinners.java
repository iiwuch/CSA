public class TwoSpinners {
    /** Precondition: min < max
    */
    /*The spin method simulates a spin of a fair spinner.
    * The method returns a random integer between min and max,
    * inclusive. Complete the spin method below by assigning
    * this random integer to result.
    */
    private int roll1 = 0;
    private int rollc = 0;
    private int points = 0;

    public int spin(int min, int max){
        int result = 0;
        if (min < max){
        result = (int)(Math.random()*max + min);
        return result;
        }
        else return result;
    }
    /** Simulates one round of the game as described in part (b).
    */
    public void playRound(){
        TwoSpinners p1 = new TwoSpinners();
        TwoSpinners comp = new TwoSpinners();
        roll1 = p1.spin(1,10);
        rollc = comp.spin(2,8);
        
        if (rollc < roll1){
            points = roll1 - rollc;
            System.out.println("You win! " + points + " points");
        }

        if (rollc > roll1){
            points = roll1 - rollc;
            System.out.println("You Lose! " + points + " points");
        }

        if (rollc == roll1){
            roll1 = p1.spin(1,10);
            rollc = comp.spin(2,8);
            
                if (rollc < roll1){
                    points = roll1 - rollc;
                    System.out.println("You win! " + points + " points");
            }

                if (rollc > roll1){
                    points = roll1 - rollc;
                    System.out.println("You Lose! " + points + " points");
                }

                if (rollc == roll1) {
                    points = roll1 - rollc;
                    System.out.println("Tie! " + points + " points");
                    }

                }
    }

    public static void main(String[] args) {
        TwoSpinners ds = new TwoSpinners();
        for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
            ds.playRound();
        }
    }
}