package Poems;

public class Limerick extends Poem{

    public Limerick(){
        super(5);
    }

    public void printRhythm(){
        print_Rhythm(getSyllables(1));
        print_Rhythm(getSyllables(2));
        print_Rhythm(getSyllables(3));
        print_Rhythm(getSyllables(4));
        print_Rhythm(getSyllables(5));
    }

    public int getSyllables(){
        if(l = 1) return 9;
        if(l = 2) return 9;
        if(l = 5) return 9;
        else return 6;
    }
}
