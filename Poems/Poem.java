package Poems;

public class Poem {
    private int lines; 

    public Poem(){
        lines = 0;
    }

    public Poem (int l){
        this.lines = l;
    }

    public int getNumlines(){
        return lines;
    }

    public void printRhythm(){
        System.out.println("Free Verse!");
    }

    public void print_Rhythm(int k){
        for(int i = 0; i < k; i++){
            if(i != k-1) System.out.print("ta-");
            else System.out.print("ta");

        }
        System.out.println();
    }
}
