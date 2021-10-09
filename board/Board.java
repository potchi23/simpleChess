package board;
import pieces.*;

public class Board {
	private Piece[][] pieces = new Piece[64][64];
	
	public Board() {
		//Black pieces
		pieces[0][0] = new Tower("black", 0, 0);
		pieces[1][0] = new Horse("black", 1, 0);
		pieces[2][0] = new Bishop("black", 2, 0);
		pieces[3][0] = new Queen("black", 3, 0);
		pieces[4][0] = new King("black", 4, 0);
		pieces[5][0] = new Bishop("black", 5, 0);
		pieces[6][0] = new Horse("black", 6, 0);
		pieces[7][0] = new Tower("black", 7, 0);
		
		for(int i = 0; i < 8; i++) {
			pieces[i][1] = new Pawn("black", i, 1);
		}
		
		// White pieces
		pieces[0][7] = new Tower("white", 0, 7);
		pieces[1][7] = new Horse("white", 1, 7);
		pieces[2][7] = new Bishop("white", 2, 7);
		pieces[3][7] = new Queen("white", 3, 7);
		pieces[4][7] = new King("white", 4, 7);
		pieces[5][7] = new Bishop("white", 5, 7);
		pieces[6][7] = new Horse("white", 6, 7);
		pieces[7][7] = new Tower("white", 7, 7);
		
		for(int i = 0; i < 8; i++) {
			pieces[i][6] = new Pawn("white", i, 6);
		}
	}
	
	public String renderBoard() {
		StringBuilder rowBuilder = new StringBuilder();
		rowBuilder.append("    a   b   c   d   e   f   g   h  \n");
		for(int i = 0; i <= 8; i++) {
			rowBuilder.append("  ---------------------------------\n");
			if(i != 8) {
				rowBuilder.append(i)
				  .append(" | ").append( pieces[0][i] == null ? " " : pieces[0][i].getSymbol())
				  .append(" | ").append( pieces[1][i] == null ? " " : pieces[1][i].getSymbol())
				  .append(" | ").append( pieces[2][i] == null ? " " : pieces[2][i].getSymbol())
				  .append(" | ").append( pieces[3][i] == null ? " " : pieces[3][i].getSymbol())
				  .append(" | ").append( pieces[4][i] == null ? " " : pieces[4][i].getSymbol())
				  .append(" | ").append( pieces[5][i] == null ? " " : pieces[5][i].getSymbol())
				  .append(" | ").append( pieces[6][i] == null ? " " : pieces[6][i].getSymbol())
				  .append(" | ").append( pieces[7][i] == null ? " " : pieces[7][i].getSymbol())
				  .append(" | " + (i) + "\n");
			}
		}
		rowBuilder.append("    a   b   c   d   e   f   g   h  \n");
		
		return rowBuilder.toString();
	}
}
