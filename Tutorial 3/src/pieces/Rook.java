package pieces;

/**
 * Creates the Rooks.
 * @author mereltheisen
 *
 */
public class Rook extends AbstractPiece {
	
	/**
	 * Checks whether the Rook needs to be white or black. 
	 * @param isWhite
	 */
	public Rook(boolean isWhite){
		super(isWhite);
	}
	
	/**
	 * Returns how much the Rook is worth when it's taken. 
	 * @return integer
	 */
	public int relativeValue(){
		return 5;
	}
	
	/**
	 * Draws a white Rook if isWhite is true, and a black Rook otherwise. 
	 */
	public void draw(){
		if(isWhite){
			System.out.print("\u2656 \t");
		}
		else{
			System.out.print("\u265C \t");
		}
	}
	
	/**
	 * Checks whether the player is moving the Rook in a valid way. 
	 */
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol){
		if (destRow != srcRow || destCol != srcCol)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
