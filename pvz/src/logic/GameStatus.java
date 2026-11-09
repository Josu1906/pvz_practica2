package logic;

import utils.Position;

public interface GameStatus {
		
	int getCycles();
	int getCoins();
	 boolean playerWins();
	 void quit();
	 boolean playerQuits();
	 int getRemainingZombies();
	 boolean hasGameFinished();
	 String positionToString(Position p);
}
