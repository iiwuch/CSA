public class Factorial {

    public long CalcFactorial(int n){
        long product = 1;
        int i = 1;
        while(i < n){
            i++;
            product *= i;
        }
        return product;
    }

    public double CalcE(){ //fix decimal rounding

        double e = 1.0;
        double olde = 0.0;
        int i = 0;
        while(e - olde > 0.001){ 
            i++;
            olde = e;
            e += 1.0/(CalcFactorial(i));
        } 
        return e;
    }

    public double calcEX(int x){
        double e = 1.0;
        double olde = 0.0;
        int i = 0;
        while(e-olde > 0.001){
            i++;
            olde = e;
            e += (Math.pow(x,i)/CalcFactorial(i));
        }
        return e;
    }

    public static void main(String [] args){
        Factorial test = new Factorial();
        int n = 1;
        for (n=1; n <= 20; n++){
            System.out.println(test.CalcFactorial(n));
        }
        System.out.println();
        System.out.printf("e is %2.3f\n", test.CalcE());
        System.out.println();
        for (n=1; n <= 5; n++){
            System.out.printf("e is %2.3f\n", test.calcEX(n));
        }
    }
}