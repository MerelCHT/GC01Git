package pieces;

public class Bishop extends AbstractPiece {
	
	public Bishop(boolean isWhite){
		super(isWhite);
	}
		
	public int relativeValue(){
		return 3;
	}
	
	public void draw(){
		if(isWhite){
			System.out.print("\u2657 \t");
		}
		else{
			System.out.print("\u265D \t");
		}
		
	}
	
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol){
		if(destRow != destCol)
		{
	        return false;
		}
		else{
			return true;
		}
	}

}
