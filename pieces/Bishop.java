package pieces;

public class Bishop extends Piece{
	public Bishop(String color, int x, int y) {
		super("bishop", color.equals("white") ? 'B' : 'b', color,  x,  y);
	}

	@Override
	public void isValidMove() {
		// TODO Auto-generated method stub
		
	}
}
