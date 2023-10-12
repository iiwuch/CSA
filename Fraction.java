public class Fraction {
	private int numerator;		//attributes
	private int denominator;
	
	// constructor
	public Fraction(int n, int d)	// constructor
	{
		numerator = n;
		denominator = d;
	}
	
	//TODO default constructor (no arguments)
	
	public int getNum()
	{
		return numerator;
	}
	public int getDenom()
	{
		return denominator;
	}
	public Fraction add(Fraction other)
	{
		int n = this.numerator*other.denominator + this.denominator*other.numerator;
		int d = this.denominator * other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	
	// TODO  subtract()
	public Fraction subtract(Fraction other){
		int n = this.numerator*other.denominator - this.denominator*other.numerator;
		int d = this.denominator*other.getDenom();
		
		Fraction result = new Fraction(n,d);
		return result;
	}
	// TODO multiply()
	public Fraction multiply(Fraction other){
		int n = this.numerator*other.getNum();
		int d = this.denominator*other.getDenom();

		Fraction result = new Fraction(n,d);
		return result;
	}
	
	// TODO toString()
	public String toString(Fraction other){
		return numerator + "/" + denominator;
	}
	// TODO reciprocal()
	public Fraction reciprocal(Fraction other){
		Fraction result = new Fraction(denominator,numerator);
		return result;
	}
	
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3,4);	// create an instance of fraction
		Fraction f2 = new Fraction(4,5);	
		String string2 = f2.toString(f2);
		String string1 = f1.toString(f1);
		
		Fraction f3 = f1.add(f2);			// add 2 fractions
		String string3 = f3.toString(f3);
		System.out.println("3/4 + 4/5 = " + string3);	// print the answer

		Fraction f4 = f1.subtract(f2);
		String string4 = f4.toString(f4);
		System.out.println(string1 + " - " + string2 + " = " + string4);

		Fraction f5 = f1.multiply(f2);
		String string5 = f5.toString(f5);
		System.out.println(string1 + " * " + string2 + " = " + string5);

		Fraction f6 = f1.reciprocal(f1);
		String string6 = f6.toString(f6);
		System.out.println("reciprocal of " + string1 + " is " + string6);

		Fraction f7 = new Fraction(1,2);
		Fraction f8 = new Fraction(1,3);
		Fraction f9 = f7.add(f8);
		String string9 = f9.toString(f9);
		System.out.println("1/2 + 1/3 = " + string9);
		
		/*
		Fraction f4 = f1.subtract(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
		
		Add code to multiply f1 and f2 here
		
		Add code to call reciprocal here
		
		create 2 new fractions and add them here.
		
		*/	
	}

}