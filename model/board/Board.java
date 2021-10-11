package model.board;
import model.pieces.*;

public class Board {
	private Piece[][] _pieces = new Piece[64][64];
	
	public Board() {
		//Black pieces
		_pieces[0][0] = new Tower("black", 0, 0);
		_pieces[1][0] = new Horse("black", 1, 0);
		_pieces[2][0] = new Bishop("black", 2, 0);
		_pieces[3][0] = new Queen("black", 3, 0);
		_pieces[4][0] = new King("black", 4, 0);
		_pieces[5][0] = new Bishop("black", 5, 0);
		_pieces[6][0] = new Horse("black", 6, 0);
		_pieces[7][0] = new Tower("black", 7, 0);
		
		for(int i = 0; i < 8; i++) {
			_pieces[i][1] = new Pawn("black", i, 1);
		}
		
		// White pieces
		_pieces[0][7] = new Tower("white", 0, 7);
		_pieces[1][7] = new Horse("white", 1, 7);
		_pieces[2][7] = new Bishop("white", 2, 7);
		_pieces[3][7] = new Queen("white", 3, 7);
		_pieces[4][7] = new King("white", 4, 7);
		_pieces[5][7] = new Bishop("white", 5, 7);
		_pieces[6][7] = new Horse("white", 6, 7);
		_pieces[7][7] = new Tower("white", 7, 7);
		
		for(int i = 0; i < 8; i++) {
			_pieces[i][6] = new Pawn("white", i, 6);
		}
	}
	
	public String renderBoard() {
		StringBuilder rowBuilder = new StringBuilder();
		rowBuilder.append("    a   b   c   d   e   f   g   h  \n");
		for(int i = 0; i <= 8; i++) {
			rowBuilder.append("  ---------------------------------\n");
			if(i != 8) {
				rowBuilder.append(i)
				  .append(" | ").append(_pieces[0][i] == null ? " " : _pieces[0][i].getSymbol())
				  .append(" | ").append(_pieces[1][i] == null ? " " : _pieces[1][i].getSymbol())
				  .append(" | ").append(_pieces[2][i] == null ? " " : _pieces[2][i].getSymbol())
				  .append(" | ").append(_pieces[3][i] == null ? " " : _pieces[3][i].getSymbol())
				  .append(" | ").append(_pieces[4][i] == null ? " " : _pieces[4][i].getSymbol())
				  .append(" | ").append(_pieces[5][i] == null ? " " : _pieces[5][i].getSymbol())
				  .append(" | ").append(_pieces[6][i] == null ? " " : _pieces[6][i].getSymbol())
				  .append(" | ").append(_pieces[7][i] == null ? " " : _pieces[7][i].getSymbol())
				  .append(" | " + (i) + "\n");
			}
		}
		rowBuilder.append("    0   1   2   3   4   5   6   7  \n");
		
		return rowBuilder.toString();
	}
	
	public Piece[][] getPieces() {
		return _pieces;
	}
}
