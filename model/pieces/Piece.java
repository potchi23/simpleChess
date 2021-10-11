package model.pieces;

public abstract class Piece {
	protected String _name;
	protected char _symbol;
	protected String _color;
	protected int _x;
	protected int _y;
	
	public Piece(String name, char symbol, String color, int x, int y) {
		_name = name;
		_symbol = symbol;
		_color = color;
		_x = x;
		_y = y;
	}
	
	public void setX(int x) {
		_x = x;
	}
	
	public void setY(int y) {
		_y = y;
	}
	
	public int getX() {
		return _x;
	}
	
	public int getY() {
		return _y;
	}
	
	public String getColor() {
		return _color;
	}
	
	public String getName() {
		return _name;
	}
	
	public char getSymbol() {
		return _symbol;
	}
	
	public void move(Piece[][] pieces, int new_x, int new_y) {		
		setX(new_x);
		setY(new_y);
	}
	
	public abstract boolean isValidMove(Piece[][] pieces, int new_x, int new_y);
}
