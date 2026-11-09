package logic;

public interface GameModel {
	  void reset();
	  void update();
	  void quit();
	  boolean hasGameFinished();
	  void addPlant(Plant plant); 
	  void addZombie(Zombie zombie);

	  // ...
}
