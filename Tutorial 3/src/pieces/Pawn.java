package pieces;

/**
 * Creates the Pawns. 
 * @author mereltheisen
 *
 */
public class Pawn extends AbstractPiece{
	
	/**
	 * Checks whether the Pawn needs to be white or black. 
	 * @param isWhite
	 */
	public Pawn(boolean isWhite){
		super(isWhite);
	}
	
	/**
	 * Returns how much the Pawn is worth when it's taken. 
	 * @return integer
	 */
	public int relativeValue(){
		return 1;
	}
	
	/**
	 * Draws a white pawn if isWhite is true, and a black pawn otherwise. 
	 */
	public void draw(){
		if (isWhite){
			System.out.print( "\u2659 \t");
		}
		else{
			System.out.print("\u265F \t");
		}
	}
	
	/**
	 * Checks whether the player is moving the Pawn in a valid way. 
	 */
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol){
		return true;
	}

}

