public class Factorial {

    public int CalcFactorial(int n){
        int product = 1;
        int i = 1;
        while(1 < n){
            i++;
            product *= i;
        }
        return product;
    }

    public static void main(String [] args){
        Factorial test = new Factorial();
        System.out.println(test.CalcFactorial(4));
        System.out.println(test.CalcFactorial(8));
    }
}