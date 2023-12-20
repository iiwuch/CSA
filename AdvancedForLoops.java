public class AdvancedForLoops {

    public void eights(){ //fix this 
        for(int x = 8; x>= 2; x-=2){
            for(int y = 6; y>=x; y--){
                System.out.print(" ");
            }
            for(int z = 1; z<=x; z++){
                System.out.print(x);
            }
            System.out.println();
            }
        }

    public void alternate(int n){
        for(int x=1; x<=n; x++){
            for(int y = 1; y<=n; y++){
                System.out.print(y);
                }
            System.out.println();
            }
        }

    public static void main(String[] args) {
        AdvancedForLoops test = new AdvancedForLoops();
        test.eights();
        System.err.println();
        // test.alternate(6);
    }
}