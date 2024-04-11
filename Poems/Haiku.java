package Poems;

public class Haiku extends Poem {

    public Haiku(){
        super(3);
    }

    public int getSyllables(int k){
        if(k == 1) return 5;
        if(k == 3) return 5;
        else return 7;
    }
    
    public void printRhythm(){
        print_Rhythm(getSyllables(1));
        print_Rhythm(getSyllables(2));
        print_Rhythm(getSyllables(3));
    }
}
