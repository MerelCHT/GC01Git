package pieces;

/**
 * Creates the knight.
 * @author mereltheisen
 *
 */
public class Knight extends AbstractPiece {
	
	/**
	 * Checks whether the Knight needs to be white or black. 
	 * @param isWhite
	 */
	public Knight(boolean isWhite){
		super(isWhite);
	}
	
	/**
	 * Returns how much the Knight is worth when it's taken. 
	 * @return integer
	 */
	
	public int relativeValue(){
		return 3;
	}
	
	/**
	 * Draws a white Knight if isWhite is true, and a black Knight otherwise. 
	 */
	public void draw(){
		if (isWhite){
			System.out.print("\u2658 \t");
		}
		else{
			System.out.print("\u265E \t");
		}
	}
	
	/**
	 * Checks whether the player is moving the knight in a valid way. 
	 */
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol){
		int newRow = Math.abs(destRow - srcRow);
		int newColumn = Math.abs(destCol - srcCol);
		
		if ((newRow == 2 && newColumn == 1) || (newRow == 1 && newColumn == 2))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
