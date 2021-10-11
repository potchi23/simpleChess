package Exceptions;

public class GameExceptions extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static String NOT_VALID_MOVE = "You can't do that move!";
	public static String NO_PIECE = "There is no piece there!";
	public static String NOT_YOUR_PIECE = "That is not your piece!";
	
	public GameExceptions(String msg) {
		super(msg);
	}
}
