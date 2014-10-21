package pieces;

public class Rook extends AbstractPiece {
	
	public Rook(boolean isWhite){
		super(isWhite);
	}
		
	public int relativeValue(){
		return 5;
	}
	
	public void draw(){
		if(isWhite){
			System.out.print("\u2656 \t");
		}
		else{
			System.out.print("\u265C \t");
		}
	}
	
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
