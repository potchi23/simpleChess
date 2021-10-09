package pieces;

public class Queen extends Piece{
	public Queen(String color, int x, int y) {
		super("queen", color.equals("white") ? 'Q' : 'q', color,  x,  y);
	}

	@Override
	public void isValidMove() {
		// TODO Auto-generated method stub
		
	}
}
