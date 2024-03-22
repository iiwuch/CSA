package WordPuzzle;

public class WordPuzzle {
    /* This question uses 2 classes, a Box class that represents an individual square in the puzzle
    and a WordPuzzle class that represents a word puzzle grid.
    */
    /** Each element is a Box object with a color (black or white)
     * and a number.  puzzle[r][c] represents the block in row r
     * column c.  There is at least one row in the puzzle.
     */
    private Box1 [][] puzzle;

    /* Write the WordPuzzle method toBeLabeled().  The method returns true
    if the box indexed by row r and column c in a word puzzle grid should be
    labeled with a positive number according to the word puzzle labeling rule;
    otherwise it returns false.  The parameter blackBoxes indicates which
    squares in the word puzzle grid are black.
     */
    /** Returns true if the square at row r, column c should be labeled
     * with a positive number, false otherwise.
     * The box at row r, column c is black if and only if blackBoxes[r][c]
     * is true.
     * Precondition: r and c are valid indexes in blackBoxes
     */
    public boolean toBeLabeled(int r, int c, boolean [][] blackBoxes){
        /* to be implemented in part a */
		if (blackBoxes[r][c] == true) return false;
        if (r==0) return true;
        if (c==0) return true;
        if (blackBoxes[r-1][c] == true) return true;
        if( blackBoxes[r][c-1] == true) return true;
        else return false;
    }

    /* Write the WordPuzzle Constructor.  The constructor should initialize the
    puzzle grid to have the same dimensions as the parameter blackBoxes.
    Each element of the puzzle grid should be initialized with a
    reference to a Box object with the appropriate color and number.
    The number is positive if the box is labeled and 0 if the box is not
    labeled.
     */

    /** Constructs a Word Puzzle grid.
     * Precondition: There is at least one row in blackBoxes
     * Postcondition:
     * - The puzzle grid has the same dimensions as blackBoxes.
     * - The Box object at row r, column c, in the word puzzle grid
     * is black if and only if blackBoxes[r][c] is true.
     * - The boxes in the puzzle are labeled according to the word
     * puzzle labeling rule.
     * @param blackBoxes - a 2D array of Boxes
     */
    public WordPuzzle(boolean [][] blackBoxes){
        /* to be implemented in part b */
        puzzle = new Box1[blackBoxes.length][blackBoxes[0].length];
        int count = 1;
          
        for(int i = 0; i < blackBoxes.length; i++){
            for(int x = 0; x < blackBoxes[0].length; x++){
                puzzle[i][x] = new Box1(blackBoxes[i][x], 0);
            }
        } 
        for(int i = 0; i < puzzle.length; i++){
            for(int x = 0; x < puzzle[0].length; x++){
                if(toBeLabeled(i, x, blackBoxes)){
                    puzzle[i][x] = new Box1(false, count); 
                    count++;
                } 
                else if(blackBoxes[i][x]== false){
                    puzzle[i][x] = new Box1(false, 0);
                } 
                else puzzle[i][x] = new Box1(true, 0); 
            }
        }
    }


    public String toString(){
        String s = "";
        for(int r =0; r < puzzle.length; r++){
            for(int c = 0; c < puzzle[0].length; c++){
                s += puzzle[r][c].toString();
            }
            s += "\n";
        }
        return s;
    }

    public static void main(String[] args){
		/* represents the word puzzle in the example */
        boolean[][]blackBoxes = {
                {true,false,false,true,true,true,false,false,false},
                {false,false,false,false,true,false,false,false,false},
                {false,false,false,false,false,false,true,true,true},
                {false,false,true,false,false,false,true,false,false},
                {true,true,true,false,false,false,false,false,false},
                {false,false,false,false,true,false,false,false,false},
                {false,false,false,true,true,true,false,false,true}};

        WordPuzzle wp = new WordPuzzle(blackBoxes);
        System.out.println(wp);
    }
}