package Poems;

public class Poem {
    private int lines; 

    public Poem(){
        lines = 0;
        printRhythm();
    }

    public Poem (int l){
        this.lines = l;
        printRhythm();
    }

    public int getNumLines(){
        return lines;
    }

    public void printRhythm(){
        System.out.println("Free Verse!");
    }

    public void print_Rhythm(int k){
        for(int i = 0; i < k; i++){
            if(i != k) System.out.println("sa-");
            else System.out.println("la");

        }
        System.out.println();
    }
}
