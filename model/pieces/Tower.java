package model.pieces;

public class Tower extends Piece{
	public Tower(String color, int x, int y) {
		super("tower", color.equals("white") ? 'T' : 't', color,  x,  y);
	}

	@Override
	public boolean isValidMove(Piece[][] pieces, int new_x, int new_y) {
		// TODO Auto-generated method stub
		boolean valid;
		
		return true;
	}
	
	public void move(Piece[][] pieces, int new_x, int new_y) {
		pieces[new_x][new_y] = this;
		pieces[_x][_y] = null;
		
		super.move(pieces, new_x, new_y);
	}
}
