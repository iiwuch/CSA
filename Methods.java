public class Methods {
    public static void main(String [] args){
        method1(5);
        method1(92);
        int y = method2("Yash", 7);
        System.out.println(y);
        int z = method2("Aiden", 16);
        System.out.println(z);
        double d1 = method3(4, 2.5);
        System.out.println(d1);
    }
    public static double method3(int y, double z){
        double result = z*y+7;
        return result;
    }
    public static int method2(String name, int x){
        System.out.println("Hello" + name);
        int y = x%2;
        return y;
    }
    public static void method1(int x){
        int y = x + 1;
        System.out.println("One more than " + y);
    }
   
}