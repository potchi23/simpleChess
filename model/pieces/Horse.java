package model.pieces;

public class Horse extends Piece{
	public Horse(String color, int x, int y) {
		super("horse", color.equals("white") ? 'H' : 'h', color,  x,  y);
	}

	@Override
	public void isValidMove() {
		// TODO Auto-generated method stub
		
	}
}
