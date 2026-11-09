package logic;

import utils.Position;

public interface GameWorld {

	public static final int NUM_ROWS = 4;
	public static final int NUM_COLS = 8;
	
	public boolean isEmpty(Position p);
	public boolean hasZombie(Position p);
	public boolean isInsideBoard(Position p);
	GameItem getGameItemInPosition(Position position);
	
}
