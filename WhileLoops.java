public class WhileLoops {
    
    public int addOdds(int n){
        int a = 1;
        int sum = 0;
        while(a <= n){
            sum = sum+a;
            a = a + 2;
        }
        return sum;
    }

    public int sumDigits(int x){
        int num = 0;
        int sum = 0;
        while(num < x){
            num++;
            sum += num;
        }
        return sum;
    }

    public int howManyYears(double startpop, double endpop){
        double rate = 1.0113;
        int years = 0;
        while(startpop < endpop){
            years++;
            startpop *= rate;
        }
        return years;
    }

    public void printSum(int n){ //fix code
        int a = 1;
        int sum = 1;
        System.out.print("1");
        while(a < n){  
            a++;
            sum += a;
            System.out.print(" + " + a);
        }
        System.out.println(" = " + sum);
    }

    public boolean isPerfectSquare(int n){
        int a = 1;
        int sum = 0;
        while(sum < n){
            sum = sum + a;
            a = a + 2;
        }
        return (sum == n);
    }
    
    public static void main(String [] args){
        WhileLoops test = new WhileLoops();
        System.out.println(test.addOdds(6));
        System.out.println(test.addOdds(5));
        System.out.println(test.addOdds(9));
        System.out.println();
        System.out.println(test.sumDigits(10));
        System.out.println(test.sumDigits(11));
        System.out.println(test.sumDigits(12));
        System.out.println();
        System.out.println(test.howManyYears(111.2, 120));
        System.out.println(test.howManyYears(111.2, 150));
        System.out.println();
        test.printSum(11);
        test.printSum(13);
        test.printSum(15);
        System.out.println();
        System.out.println(test.isPerfectSquare(64));
        System.out.println(test.isPerfectSquare(121));
        System.out.println(test.isPerfectSquare(45));
        System.out.println(test.isPerfectSquare(80));
    }
}
