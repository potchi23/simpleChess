package controller;

import java.util.Scanner;

import Exceptions.GameExceptions;
import model.board.Board;
import model.pieces.Piece;

public class Game {
	private Board _board;
	private Scanner _in;
	private String _turn;
	
	public Game() {
		_board = new Board();
		_in = new Scanner(System.in);
		_turn = "white";
	}
	
	public void initGame() throws GameExceptions{
		Piece[][] pieces = _board.getPieces();
		
		printBoard();
		
		int[] old_position = selectPieceFromInput(pieces);		
		int[] new_position = getNewPositionFromInput(pieces, old_position[0], old_position[1]);

		movePiece(pieces, old_position[0], old_position[1], new_position[0], new_position[1]);
				
		changeTurn();
	}
	
	public void printBoard() {
		System.out.println("\nTurn: " + _turn);
		System.out.println(_board.renderBoard());
	}
	
	public int[] selectPieceFromInput(Piece[][] pieces) throws GameExceptions{
		int[] oldPosition = new int[2];
		
		System.out.println("Select piece position: ");
		
		oldPosition[0] = _in.nextInt();
		oldPosition[1] = _in.nextInt();
		
		if (pieces[oldPosition[0]][oldPosition[1]] == null) {
			throw new GameExceptions(GameExceptions.NO_PIECE);
		}
		else if(pieces[oldPosition[0]][oldPosition[1]].getColor() != _turn) {
			throw new GameExceptions(GameExceptions.NOT_YOUR_PIECE);
		}
		
		return oldPosition;
	}
	
	public int[] getNewPositionFromInput(Piece[][] pieces, int old_x, int old_y) throws GameExceptions{
		int[] newPosition = new int[2];
		
		System.out.println("Set new position for " + pieces[old_x][old_y].getName() +" in X: " + old_x + " Y: " + old_y);
		newPosition[0] = _in.nextInt();
		newPosition[1] = _in.nextInt();
		
		if(!pieces[old_x][old_y].isValidMove(pieces, newPosition[0], newPosition[1])) {
			throw new GameExceptions(GameExceptions.NOT_VALID_MOVE);
		}
		
		return newPosition;
	}
	
	public void movePiece(Piece[][] pieces, int old_x, int old_y, int new_x, int new_y) {
		pieces[old_x][old_y].move(pieces, new_x, new_y);
	}
	
	public void changeTurn() {
		_turn = _turn == "white" ? "black" : "white";
	}
}
