package model.pieces;

public class Pawn extends Piece{
	public Pawn(String color, int x, int y) {
		super("pawn", color.equals("white") ? 'P' : 'p', color,  x,  y);
	}

	@Override
	public void isValidMove() {
		// TODO Auto-generated method stub
		
	}
}
