package model.pieces;

public class Bishop extends Piece{
	public Bishop(String color, int x, int y) {
		super("bishop", color.equals("white") ? 'B' : 'b', color,  x,  y);
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
