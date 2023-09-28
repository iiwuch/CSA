public class MathEx {
    public static void main(String [] args){
        System.out.println(swap(132));
        System.out.println(swap(304));
        timeLeft(1, 15, 4, 36);
        timeLeft(1,34,8,20);
        System.out.println(dayOfWeek(0,1));
        System.out.println(dayOfWeek(0,14));
        System.out.println(dayOfWeek(6,22));
        System.out.println(dayOfWeek(5,4));
    }
    
    public static int swap(int y){
        int onesPlace = y%10;
        int tensPlace = y%100/10;
        int hundredsPlace = y/100;
        int result = hundredsPlace*100 + onesPlace*10 + tensPlace;
        return result;
    }

    public static void timeLeft(int curHour, int curMin, int depHour, int depMin){
        
        int result = (depMin + depHour*60) - (curHour*60 + curMin);
        int mins = result%60;
        int hours = result/60;
        System.out.println(hours + " hours and " + mins + " minutes");
    }

    public static int dayOfWeek(int dayOfWeek, int date){
        int result = (dayOfWeek + date - 1)%7;
        return result;
    }
}