package model.pieces;

public class Queen extends Piece{
	public Queen(String color, int x, int y) {
		super("queen", color.equals("white") ? 'Q' : 'q', color,  x,  y);
	}

	@Override
	public boolean isValidMove(Piece[][] pieces, int new_x, int new_y) {
		// TODO Auto-generated method stub
		
		return true;
	}
	
	public void move(Piece[][] pieces, int new_x, int new_y) {
		pieces[new_x][new_y] = this;
		pieces[_x][_y] = null;
		
		super.move(pieces, new_x, new_y);
	}
}
