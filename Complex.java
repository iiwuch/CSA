public class Complex {
    
    private double a = 0;
    private double b = 0;

    public Complex(double a1){
        this(a1, 0.0);
    }

    public Complex(double a1, double b1){
        a = a1;
        b = b1;
    }

    public double abs(){
        return (Math.sqrt(a*a + b*b));
    }

    public Complex add(Complex other){
        double real = this.a + other.a;
        double imaginary = this.b + other.b;
        Complex num = new Complex(real,imaginary);
        return num;
    }

    public Complex Multiply(Complex other){
        double real = (this.a*other.b) - this.b*other.b;
        double imaginary = (this.a*other.b) + this.b*other.a;
        Complex product = new Complex(real, imaginary);
        return product;
    }

    public String toString(){
        String string = a + " + " + b + "i";
        return string;
    }

    public static void main(String [] args){
        Complex test1 = new Complex(1,2);
        Complex test2 = new Complex(3,-4);
        Complex test3 = new Complex(-3,-4);
        Complex test4 = new Complex(0.0,4);
        Complex test5 = new Complex(-3,5);
        Complex test6 = new Complex(0.0,-3);
        Complex test7 = new Complex(5);
        Complex test1a2 = test1.add(test2);
        Complex test3a4 = test3.add(test4);
        Complex test5a6 = test5.add(test6);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
        System.out.println(test7);
        System.out.println(test1a2);
        System.out.println(test3a4);
        System.out.println(test5a6);
        System.out.println(test1.abs());
        System.out.println(test2.abs());
        System.out.println(test5.abs());
        System.out.println(test1.Multiply(test2));
        System.out.println(test3.Multiply(test4));
        System.out.println(test5.Multiply(test6));
        }    
}
