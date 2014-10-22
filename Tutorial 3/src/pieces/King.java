package pieces;

public class King extends AbstractPiece{
	
	public King(boolean isWhite){
		super(isWhite);
	}
		
	public int relativeValue(){
		return 0;
	}
	
	public void draw(){
		if(isWhite){
			System.out.print( "\u2654 \t");
		}
		else{
			System.out.print("\u265A \t");
		}
	}
	
	public boolean isMoveValid(int srcRow, int srcCol, int destRow, int destCol){
		if((destRow <= srcRow + 1 && destRow >= Math.abs(srcRow -1)) && (destCol <= srcCol + 1 && destCol >= Math.abs(srcCol -1)))
		{
			return true;
			
		}
		
		else
		{
			return false;
		}
	}

}
