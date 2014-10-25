package pieces;

/**
 * Creates the Queens.
 * @author mereltheisen
 *
 */
public class Queen extends AbstractPiece {

	/**
	 * Checks whether the Queen needs to be white or black. 
	 * @param isWhite
	 */
	public Queen(boolean isWhite){
		super(isWhite);
	}
	
	
	/**
	 * Returns how much the Queen is worth when it's taken. 
	 * @return integer
	 */
	public int relativeValue(){
		return 9;
	}
	
	/**
	 * Draws a white Queen if isWhite is true, and a black Queen otherwise. 
	 */
	public void draw(){
		if(isWhite){
			System.out.print("\u2655 \t");
		}
		else{
			System.out.print("\u265B \t");
		}
		
	}
	
	/**
	 * Checks whether the player is moving the Queen in a valid way. 
	 */
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol){
		if((destRow == destCol) || (destRow != srcRow || destCol != srcCol))
		{
	        return true;
		}
		else{
			return false;
		}
	}
}
