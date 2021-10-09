package pieces;

public class King extends Piece{
	public King(String color, int x, int y) {
		super("king", color.equals("white") ? 'K' : 'k', color,  x,  y);
	}

	@Override
	public void isValidMove() {
		// TODO Auto-generated method stub
		
	}
}
