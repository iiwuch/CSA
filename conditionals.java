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
        if (isAsleep == true) return false;
        if (isMorning == true && isMom == false) return false;
        else return true;
    }
   
    public String setAlarm(int day, boolean onVacation){
        if (onVacation == true && (0 < day && day < 6)) return "10:00";
        if (onVacation == true && (day == 0 || day == 6)) return "off";
        if (onVacation == false && (0 < day && day < 6)) return "7:00";
        if (onVacation == false && (day == 0 || day == 6)) return "10:00";
        return null;
    }
    
    public boolean onesDigitSame(int a, int b, int c){
        if (a%10 == b%10 || b%10 == c%10 || a%10 == c%10){
            return true;
        }
        else return false;
    }

    public int blackjack(int a, int b){
        if (a <= 21 && a>=b || a <=21 && b>21) return a;
        if (b <= 21 && b>=a || b <=21 && a>21) return b;
        else return 0;
    }

    public static void main(String [] args){
        Conditionals ab = new Conditionals();
        System.out.println(ab.chimpTrouble (true, true));
        System.out.println(ab.chimpTrouble (false, false));
        System.out.println(ab.chimpTrouble (true, false));
        System.out.println(ab.chimpTrouble (false, true));
        System.out.println();
        System.out.println(ab.negPos(1, -1, false));
        System.out.println(ab.negPos (-1, 1, false));
        System.out.println(ab.negPos(1, 1, false));
        System.out.println(ab.negPos (-1, -1, false));
        System.out.println(ab.negPos (-4, -5, true));
        System.out.println(ab.negPos (-4, 5, true));
        System.out.println(ab.negPos (4, 5, true));
        System.out.println(ab.negPos (4, -5, true));
        System.out.println();
        System.out.println(ab.pickUpPhone (false, false, true));
        System.out.println(ab.pickUpPhone (true, true, true));
        System.out.println(ab.pickUpPhone (true, true, false));
        System.out.println(ab.pickUpPhone (false, true, false));
        System.out.println(ab.pickUpPhone (true, false, false));
        System.out.println(ab.pickUpPhone (false, false, false));
        System.out.println();
        System.out.println(ab.setAlarm(1, false));
        System.out.println(ab.setAlarm(5, false));
        System.out.println(ab.setAlarm(0, false));
        System.out.println(ab.setAlarm(2, true));
        System.out.println(ab.setAlarm(4, true));
        System.out.println(ab.setAlarm(6, true));
        System.out.println();
        System.out.println(ab.onesDigitSame(23, 19, 13));
        System.out.println(ab.onesDigitSame(23, 19, 12));
        System.out.println(ab.onesDigitSame(23, 19, 3));
        System.out.println(ab.onesDigitSame(423, 13, 3));
        System.out.println(ab.onesDigitSame(23, 29, 25));
        System.out.println();
        System.out.println(ab.blackjack(19, 21));
        System.out.println(ab.blackjack(21, 19));
        System.out.println(ab.blackjack(19, 22));
        System.out.println(ab.blackjack(8, 8));
        System.out.println(ab.blackjack(25, 24));
        System.out.println(ab.blackjack(17, 9));
        System.out.println(ab.blackjack(12, 18));
    }
}