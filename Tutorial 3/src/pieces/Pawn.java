package pieces;

public class Pawn extends AbstractPiece{
	
	public Pawn(boolean isWhite){
		super(isWhite);
	}
		
	public int relativeValue(){
		return 1;
	}
	
	public void draw(){
		if (isWhite){
			System.out.print( "\u2659 \t");
		}
		else{
			System.out.print("\u265F \t");
		}
	}
	
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol){
		return true;
	}

}

