package pieces;

public class Knight extends AbstractPiece {
	
	public Knight(boolean isWhite){
		super(isWhite);
	}
		
	public int relativeValue(){
		return 3;
	}
	
	public void draw(){
		if (isWhite){
			System.out.print("\u2658 \t");
		}
		else{
			System.out.print("\u265E \t");
		}
	}
	
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
