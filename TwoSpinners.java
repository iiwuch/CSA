public class TwoSpinners {
    /** Precondition: min < max
    */
    /*The spin method simulates a spin of a fair spinner.
    * The method returns a random integer between min and max,
    * inclusive. Complete the spin method below by assigning
    * this random integer to result.
    */
    public int spin(int min, int max){
        int result=0;
        result =(int)(Math.random()*max + min);
        return result;
        }
   
    /** Simulates one round of the game as described in part (b).
    */
    public void playRound(){
        if (p1.spin(1,10) >= comp.spin(2,8));
        // add code here    	
    }
   
    public static void main(String[] args) {
        TwoSpinners ds = new TwoSpinners();
        TwoSpinners comp = new TwoSpinners();
        TwoSpinners p1 = new TwoSpinners();
        System.out.println(ds.spin(1,9));
        for(int i = 0; i < 10; i++){    //This will save you time by running playground 10 times
            ds.playRound();
        }
    }
}

