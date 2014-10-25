package pieces;

public class Queen extends AbstractPiece {

	public Queen(boolean isWhite){
		super(isWhite);
	}
		
	public int relativeValue(){
		return 9;
	}
	
	public void draw(){
		if(isWhite){
			System.out.print("\u2655 \t");
		}
		else{
			System.out.print("\u265B \t");
		}
		
	}
	
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
