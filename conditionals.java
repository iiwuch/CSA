public class Conditionals {
    public boolean chimpTrouble(boolean aSmile, boolean bSmile){
        if (aSmile == bSmile){
            return true;
        } 
        else{
            return false;
        }
    }
   
    public boolean negPos(int a, int b, boolean c){
        if (a*b<0 && c==false) return true;
        if (a<0 && b < 0 && c== true) return true;
        else return false;
    }
   
    public boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isMorning == true && isMom == true && isAsleep == false) return true;
        if (isMorning == false && isAsleep == true) return false;
        else return true;
    }
   
    public String setAlarm(int day, boolean onVacation){
        if (onVacation == true && 0 < day < 6) return true;
        if (onVacation == true && (day == 0 || day == 6)) return off;
        i
    }
    
    public static void main(String [] args){
        Conditionals ab = new Conditionals();
        // System.out.println(chimpTrouble (true, true));
        // System.out.println(chimpTrouble (false, false));
        // System.out.println(chimpTrouble (true, false));
        // System.out.println(chimpTrouble (false, true));
        // System.out.println();
        // System.out.println(ab.negPos(1, -1, false));
        // System.out.println(ab.negPos (-1, 1, false));
        // System.out.println(ab.negPos(1, 1, false));
        // System.out.println(ab.negPos (-1, -1, false));
        // System.out.println(ab.negPos (-4, -5, true));
        // System.out.println(ab.negPos (-4, 5, true));
        // System.out.println(ab.negPos (4, 5, true));
        // System.out.println(ab.negPos (4, -5, true));
        // System.out.println(ab.pickUpPhone (false, false, true));
        // System.out.println(ab.pickUpPhone (true, true, true));
        // System.out.println(ab.pickUpPhone (true, true, false));
        // System.out.println(ab.pickUpPhone (false, true, false));
        // System.out.println(ab.pickUpPhone (true, false, false));
        // System.out.println(ab.pickUpPhone (false, false, false));

    }
}
