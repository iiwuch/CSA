public class AdvancedForLoops {

    public void eights(){
        for(int x = 8; x> 0; x-=2){
            for(int y = 0; y<8-x; y+=2){
                System.out.print(" ");
            }
            for(int z = 0; z<x; z++){
                System.out.print(x);
            }
            System.out.println();
            }
        }

    public void alternate(int n){
        for(int x=1; x<=n; x++){
            for(int y = 1; x%2 != 0 && y<=x; y++){
                System.out.print(y);
                }
            for(int z = x; x%2 ==0 && z>0; z--){
                System.out.print(z);
            }
            System.out.println();
        }
    }

    public void isosceles(int n){
        for(int x=1; x<=n; x++){
            for(int y = 0; y < n -x; y++){
                System.out.print(" ");
            }
            for(int y = 1; y <=x; y++){
                System.out.print(y);
            }
            for(int y = x-1; y > 0; y--){
                System.out.print(y);
            }
            System.out.println();
        }

    }

    public void upSideDown(int n1, int n2){
        for(int x = 0; x <= n1 - n2; x++){
            for(int y = 0; y < x; y++){
                System.out.print(" ");
            }
            for(int y = n1 - x; y >= n2; y--){
                System.out.print(y);
            }
            for(int y = n2 + 1; y <= n1 - x; y++){
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdvancedForLoops test = new AdvancedForLoops();
        test.eights();
        System.err.println();
        test.alternate(6);
        test.alternate(5);
        System.out.println();
        test.isosceles(5);  
        test.isosceles(6);
        System.out.println();
        test.upSideDown(9, 5);
        test.upSideDown(8, 6);
    }
}