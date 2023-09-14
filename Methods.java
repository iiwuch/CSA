public class Methods {
    public static void main(String [] args){
        method1(4);
        method1(7);
    }
    public static int method2(String name, int x){
        System.out.println("hello" + name);
        int rem = x%2;
        return rem;
    }
    public static void method1(int x){
        int y = x+1;
        System.out.println("added one to get" + y);
    }
   
}
