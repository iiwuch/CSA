public class TriangleLoops {

    public void eights(){ //fix this 
        for(int x = 1; x<=4; x++){
            for(int y = 1; y<= 4; y++){
                System.out.println("  ");
            }
            for(int y = 8; y>2; y-=2){
                for(int z = y; z>=2; z-=2){
                    System.out.print(y);
                }
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        TriangleLoops test = new TriangleLoops();
        test.eights();
    }
}
