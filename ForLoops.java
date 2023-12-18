public class ForLoops {

    public int addEvens(int n){
        int sum = 0;
        for(int x = 2; x <= n; x += 2){
            sum += x;
        }
        return sum;
    }

    public void printSquaresBack(int n){
        for (int x = n; x>= 2; x--){
            System.out.print(x*x + ", ");
        }
        System.out.print(1);
        System.out.println();
    }

    public void sillyNumbers(){
        for(int x = 0; x < 3; x++){
            for(int z = 0; z < 10; z++){
                for(int y=0; y < 3; y++){
                    System.out.print(z);
                }
            }
            System.out.println();
        }
    }

    public void sillyNumbers2(){
        for(int x = 0; x < 4; x++){
            for(int z = 9; z >= 1; z--){
                for(int y = 1; y <= z; y++){
                    System.out.print(z);
                }
            }
            System.out.println();
        }
    }
    public void dollarsAndStars(){
        for(int x=1; x <= 7; x++){
            for(int i = 2; i<=x; i++){
                System.out.print("**");
            }
            for(int i = 7; i>=x; i--){
                System.out.print("$");
            }
            for(int i = 14; i>=x*2; i-=2){
                System.out.print("**");
            }    
            for(int i = 7; i>=x; i--){
                System.out.print("$");
            }
             for(int i = 2; i<=x; i++){
                System.out.print("**");
            }  
            System.out.println();
        }
    }
    public static void main(String [] args){
        ForLoops test = new ForLoops();
        System.out.println(test.addEvens(5));
        System.out.println(test.addEvens(6));
        System.out.println(test.addEvens(8));
        System.out.println();
        test.printSquaresBack(8);
        test.printSquaresBack(6);
        test.printSquaresBack(4);
        System.out.println();
        test.sillyNumbers();
        System.out.println();
        test.sillyNumbers2();
        System.out.println();
        test.dollarsAndStars();
    }
}
