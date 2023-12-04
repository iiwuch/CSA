public class WhileLoops {
    
    public int addOdds(int n){
        int a = 1;
        int sum = 0;
        while(a < n){
            sum = sum+a;
            a = a+2;
        }
        return sum;
    }

    public int sumDigits(int x){
        int num = 0;
        int sum = 0;
        while(num < x){
            num++;
            sum+= num;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        double rate = 1.13;
        int years = 0;
        while(startpop < endpop){
            years++;
            startpop *= rate;
        }
        return years;
    }

    public void printSum(int n){
        int a = 1;
        int sum = 1;
        System.out.print("1");
        while(a < n){  
            a++;
            sum+=a;
            System.out.print(" + " + a);
        }
        System.out.println(" = " + sum);
    }

    public boolean isPerfectSquare(int n){
        int a = 1;
        int sum = 0;
        while(sum < n){
            sum = sum+a;
            a = a+2;
        }
        return (sum==n);
    }
    
    public static void main(String [] args){
        WhileLoops test = new WhileLoops();
        System.out.println(test.addOdds(6));
        System.out.println(test.addOdds(10));
        System.out.println(test.addOdds(12));
        System.out.println();
        System.out.println(test.sumDigits(2));
        System.out.println(test.sumDigits(3));
        System.out.println(test.sumDigits(4));
        System.out.println();
        System.out.println(test.howManyYears(120, 150 ));
        System.out.println();
        test.printSum(6);
        test.printSum(8);
        System.out.println();
        System.out.println(test.isPerfectSquare(25));
        System.out.println(test.isPerfectSquare(49));
        System.out.println(test.isPerfectSquare(10));
        System.out.println(test.isPerfectSquare(15));
    }
}
