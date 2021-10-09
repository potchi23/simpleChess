package model.pieces;

public class Tower extends Piece{
	public Tower(String color, int x, int y) {
		super("tower", color.equals("white") ? 'T' : 't', color,  x,  y);
	}

	@Override
	public void isValidMove() {
		// TODO Auto-generated method stub
		
	}
}
