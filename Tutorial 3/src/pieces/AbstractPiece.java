package pieces;

public abstract class AbstractPiece {
	boolean isWhite;
	
	/**
	 * If piece is white, set true, false otherwise.
	 * @param isWhite
	 */
	public AbstractPiece(boolean isWhite){
		this.isWhite = isWhite;
	}
	
	/**
	 * Returns ture if white, false otherwise.
	 * @return
	 */
	public boolean isWhite(){
		return isWhite;
	}
	
	/**
	 * Draws given piece into the console.
	 */
	public abstract void draw();
	
	/**
	 * Checks whether given move is valid. Returns true if valid, false otherwise.
	 */
	public abstract boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol);
	
	/**
	 * Returns relative chess piece value of this chessman.
	 * @return
	 */
	public abstract int relativeValue();

}
