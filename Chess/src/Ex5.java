	import java.util.Scanner;
	
	public class Ex5 {
	
		/**
		 * @param args
		 */
		//Creates all the possible chess pieces, including empty for an empty space on the chess board.
		public enum Chessmen{
			WHITE_KING,
			WHITE_QUEEN,
			WHITE_ROOK,
			WHITE_BISHOP,
			WHITE_KNIGHT,
			WHITE_PAWN,
			BLACK_KING,
			BLACK_QUEEN,
			BLACK_ROOK,
			BLACK_BISHOP,
			BLACK_KNIGHT,
			BLACK_PAWN,
			EMPTY
		}
	
		//Creates a chessboard matrix of size 8 x 8. 
		public static void main(String[] args) {
			Scanner chessmove = new Scanner(System.in);
			Chessmen[][] chessboard = new Chessmen [8] [8];
			for(int i = 0; i < 8 ; i++)
			{
				for(int j = 0; j < 8; j++)
				{
					if(i == 1)
					{
						chessboard[i][j] = Chessmen.BLACK_PAWN;
					}
	
					else if(i == 0 && (j == 0 || j == 7))
					{
						chessboard[i][j] = Chessmen.BLACK_ROOK;
					}
	
					else if(i == 0 && (j == 1 || j == 6))
					{
						chessboard[i][j] = Chessmen.BLACK_KNIGHT;
					}
	
					else if(i == 0 && (j == 2 || j == 5))
					{
						chessboard[i][j] = Chessmen.BLACK_BISHOP;
					}
	
					else if(i == 0 && j == 3)
					{
						chessboard[i][j] = Chessmen.BLACK_QUEEN;
					}
	
					else if(i == 0 && j == 4)
					{
						chessboard[i][j] = Chessmen.BLACK_KING;
					}
	
					else if(i == 6)
					{
						chessboard[i][j] = Chessmen.WHITE_PAWN;
					}
	
					else if(i == 7 && (j == 0 || j == 7))
					{
						chessboard[i][j] = Chessmen.WHITE_ROOK;
					}
	
					else if(i == 7 && (j == 1 || j == 6))
					{
						chessboard[i][j] = Chessmen.WHITE_KNIGHT;
					}
	
					else if(i == 7 && (j == 2 || j == 5))
					{
						chessboard[i][j] = Chessmen.WHITE_BISHOP;
					}
	
					else if(i == 7 && j == 3)
					{
						chessboard[i][j] = Chessmen.WHITE_QUEEN;
					}
	
					else if(i == 7 && j == 4)
					{
						chessboard[i][j] = Chessmen.WHITE_KING; 
					}
	
					else
					{
						chessboard[i][j] = Chessmen.EMPTY;
					}
	
				}
			}
			
			//Checks whether the user wants to perform a next move or wants to exit. 
			Boolean exit = false;
			while(!exit)
			{
				printBoard(chessboard);
				System.out.println("What is your next move?");
				String move = chessmove.nextLine();
				if(move.equals("exit"))
				{
					System.exit(0);
				}
				else if(move.length() != 8)
				{
					System.err.println("That's invalid input.");
				}
				else
				{
					move(chessboard, move);
				}
			}
		}
		
		//This method takes the chessboard as an input and print it to the console.
		public static void printBoard(Chessmen[][] chessboard){
			String piece;
			int rows = 8;
			int columns = 8;
			System.out.println("\t a \t b \t c \t d \t e \t f \t g \t h");
			for(int i = 0; i< rows ; i++)
			{
				System.out.print(i + 1 + "." + "\t");
	
				for(int j = 0; j < columns ; j++)
				{
	
					switch(chessboard[i][j]){
					case WHITE_KING: piece = "\u2654 \t"; break;
					case WHITE_QUEEN: piece = "\u2655 \t"; break;
					case WHITE_BISHOP: piece = "\u2657 \t"; break;
					case WHITE_ROOK: piece = "\u2656 \t"; break;
					case WHITE_KNIGHT: piece = "\u2658 \t"; break;
					case WHITE_PAWN: piece = "\u2659 \t"; break;
					case BLACK_KING: piece = "\u265A \t"; break;
					case BLACK_QUEEN: piece = "\u265B \t"; break;
					case BLACK_BISHOP: piece = "\u265D \t"; break;
					case BLACK_ROOK: piece = "\u265C \t"; break;
					case BLACK_KNIGHT: piece = "\u265E \t"; break;
					case BLACK_PAWN: piece = "\u265F \t"; break;
					case EMPTY: piece = "\t"; break;
					default: piece = "invalid"; break;
					}
					System.out.print(piece);
				}
				System.out.print("\n");
	
			}
		}
		
		//This method takes a chessboard and a move as input and performs the move on the board.
		public static void move(Chessmen[][] chessboard, String move)
		{	

			//parse move string into components
			String[] components = move.split(" ");
			
			//if you assume that the move is "e1 to e5" then
			//components[0].charAt(0) = 'e'
			//components[0].charAt(1) == '1'
			
			int oldPosY;
			int oldPosX = Character.getNumericValue(components[0].charAt(1) - 1);
			int newPosY;
			int newPosX = Character.getNumericValue(components[2].charAt(1) - 1); 
			
			
			if (components[0].charAt(0) == 'a')
			{
				oldPosY = 0;
			}
			
			else if(components[0].charAt(0) == 'b')
			{
				oldPosY = 1;
			}
			
			else if(components[0].charAt(0) == 'c')
			{
				oldPosY = 2;
			}
			
			else if(components[0].charAt(0) == 'd')
			{
				oldPosY = 3;
			}
			
			else if(components[0].charAt(0) == 'e')
			{
				oldPosY = 4;
			}
			
			else if(components[0].charAt(0) == 'f')
			{
				oldPosY = 5;
			}
			
			else if(components[0].charAt(0) == 'g')
			{
				oldPosY = 6;
			}
			
			else 
			{
				oldPosY = 7;
			}
			
			//Set the new position of Y. 
			if (components[2].charAt(0) == 'a')
			{
				newPosY = 0;
			}
			
			else if(components[2].charAt(0) == 'b')
			{
				newPosY = 1;
			}
			
			else if(components[2].charAt(0) == 'c')
			{
				newPosY = 2;
			}
			
			else if(components[2].charAt(0) == 'd')
			{
				newPosY = 3;
			}
			
			else if(components[2].charAt(0) == 'e')
			{
				newPosY = 4;
			}
			
			else if(components[2].charAt(0) == 'f')
			{
				newPosY = 5;
			}
			
			else if(components[2].charAt(0) == 'g')
			{
				newPosY = 6;
			}
			
			else 
			{
				newPosY = 7;
			}
			
			//make the move: replace the original position with Chessmen.EMPTY
			//and place the piece into the new position
			if ((Character.getNumericValue(components[0].charAt(1))  > 8) || (Character.getNumericValue(components[2].charAt(1)) > 8))
			{
				System.err.println("That's invalid input.");
			}
			
			else if(checkMove(chessboard, oldPosX, oldPosY, newPosX, newPosY))
			{
				chessboard[newPosX][newPosY] = chessboard[oldPosX][oldPosY];
				chessboard[oldPosX][oldPosY] = Chessmen.EMPTY;
			}
			else
			{
				System.err.println("That is an invalid move.");
			}
		}
		
		public static boolean checkMove(Chessmen[][] chessboard, int oldPosX, int oldPosY, int newPosX, int newPosY)
		{
			boolean validMove = false;
			if((chessboard[oldPosX][oldPosY] == Chessmen.BLACK_KING) || (chessboard[oldPosX][oldPosY] == Chessmen.WHITE_KING))
			{
				if((chessboard[oldPosX][oldPosY-1] != Chessmen.EMPTY) &&
						   (chessboard[oldPosX][oldPosY+1] != Chessmen.EMPTY) &&
						   (chessboard[Math.abs(oldPosX-1)][oldPosY] != Chessmen.EMPTY) &&
						   (chessboard[oldPosX+1][oldPosY] != Chessmen.EMPTY) &&
						   (chessboard[oldPosX+1][oldPosY+1] != Chessmen.EMPTY) &&
						   (chessboard[oldPosX+1][Math.abs(oldPosY-1)] != Chessmen.EMPTY) &&
						   (chessboard[Math.abs(oldPosX-1)][Math.abs(oldPosY-1)] != Chessmen.EMPTY) &&
						   (chessboard[Math.abs(oldPosX-1)][oldPosY+1] != Chessmen.EMPTY))
				{
					validMove = false;
				}
				else if((newPosX <= oldPosX + 1 && newPosX >= Math.abs(oldPosX -1)) && (newPosY <= oldPosY + 1 && newPosY >= Math.abs(oldPosY -1)))
				{
					validMove = true;
					
				}
				
				else
				{
					return false;
				}
			}
			
			else if((chessboard[oldPosX][oldPosY] == Chessmen.BLACK_KNIGHT) || (chessboard[oldPosX][oldPosY] == Chessmen.WHITE_KNIGHT))
			{
				int newRow = Math.abs(newPosX - oldPosX);
				int newColumn = Math.abs(newPosY - oldPosY);
				
				if ((newRow == 2 && newColumn == 1) || (newRow == 1 && newColumn == 2))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
			else
			{
				validMove = true;
			}
			/*
			if ((chessboard[i][j] == Chessmen.BLACK_ROOK) || (chessboard[i][j] == Chessmen.WHITE_ROOK))
			{
				if((chessboard[oldPosX][oldPosY-1] != Chessmen.EMPTY) &&
				   (chessboard[oldPosX][oldPosY+1] != Chessmen.EMPTY) &&
				   (chessboard[oldPosX-1][oldPosY] != Chessmen.EMPTY) &&
				   (chessboard[oldPosX+1][oldPosY] != Chessmen.EMPTY))
				{
					return false;
				}
				
				else if((newPosX == oldPosX + 1) && (chessboard[oldPosX+1][oldPosY] == Chessmen.EMPTY))
				{
					return true;
				}
			}
			*/
			return validMove;
		}
		
	
	}