package launcher;

import Exceptions.GameExceptions;
import controller.Game;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game();
		
		while(true) {
			
			try {
				game.initGame();
			}
			catch(GameExceptions e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
