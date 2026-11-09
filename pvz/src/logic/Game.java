package logic;

import utils.Position;

public class Game implements GameStatus, GameWorld, GameModel {

	public static final int INITIAL_COINS = 50;	  
	private boolean isThePlayerOut = false;
	
	
	private int coins = INITIAL_COINS;
	private int cycles = 0;
	
	public int getCycles() {
		return cycles;
	}
	
	public int getCoins() {
		return coins;
	}
	
	public boolean playerWins() {
		
		if(hasGameFinished() && zombies.allZombiesWereKilled()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void quit() {
		this.isThePlayerOut = true;
	}
	
	public boolean playerQuits() {
		return this.isThePlayerOut;
	}
	
	public void update() {
		sunflowers.update();
		peashooters.update();
		zombies.update();
		cycles++;
	}
	
	public void getDescription() {
		System.out.println(Messages.SUNFLOWER_DESCRIPTION);
		System.out.println(Messages.PEASHOOTER_DESCRIPTION);
	}
	
	public int getRemainingZombies() {
		return zombies.getRemainingZombies();
	}
	
	public boolean hasGameFinished() {
		return zombies.doZombiesReachedTheHouse() || zombies.allZombiesWereKilled(); 
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	public boolean isEmpty(Position p) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasZombie(Position p) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isInsideBoard(Position p) {
		// TODO Auto-generated method stub
		return false;
	}

	public String positionToString(Position p) {
		// TODO Auto-generated method stub
		return null;
	}
}
