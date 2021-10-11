package model.pieces;

public class Pawn extends Piece{
	private boolean _touched;
	
	public Pawn(String color, int x, int y) {
		super("pawn", color.equals("white") ? 'P' : 'p', color,  x,  y);
		_touched = false;
	}
	
	@Override
	public boolean isValidMove(Piece[][] pieces, int new_x, int new_y) {
		// TODO Auto-generated method stub
		boolean valid;
		
		if(_color == "white") {
			valid = (new_x >= 0 && new_x <= 7 && new_y >= 0 && new_y <= 7) && // New position is inside the boundaries
					(new_x == _x && new_y == _y - 1 && pieces[new_x][new_y] == null) || // There's no block
					(new_x == _x - 1 && new_y == _y - 1 && pieces[new_x][new_y] != null && pieces[new_x][new_y].getColor() != _color) || // Can take a piece
					(new_x == _x + 1 && new_y == _y - 1 && pieces[new_x][new_y] != null && pieces[new_x][new_y].getColor() != _color) || // Can take a piece
					(!_touched && new_y == _y - 2) // If not touched, can go forward 2 positions					
					? true : false;
		}
		else {
			valid = (new_x >= 0 && new_x <= 7 && new_y >= 0 && new_y <= 7) && // New position is inside the boundaries
					(new_x == _x && new_y == _y + 1 && pieces[new_x][new_y] == null) || // There's no block
					(new_x == _x - 1 && new_y == _y + 1 && pieces[new_x][new_y] != null && pieces[new_x][new_y].getColor() != _color) || // Can take a piece
					(new_x == _x + 1 && new_y == _y + 1 && pieces[new_x][new_y] != null && pieces[new_x][new_y].getColor() != _color) || // Can take a piece
					(!_touched && new_y == _y + 2) // If not touched, can go forward 2 positions	
					? true : false;
			
		}
		
		return valid;
	}
	
	@Override
	public void move(Piece[][] pieces, int new_x, int new_y) {
		_touched = true;
		pieces[new_x][new_y] = this;
		pieces[_x][_y] = null;
		
		super.move(pieces, new_x, new_y);
	}
}
