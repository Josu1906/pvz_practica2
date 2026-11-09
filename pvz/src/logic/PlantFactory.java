package logic;

public class PlantFactory {

	  private static final List<Plant> AVAILABLE_PLANTS = Arrays.asList(
	      // ...
	  );


	  public static Plant spawnPlant(String plantName, GameWorld game, Position position) {
	    // ...
	  }

	  public static List<Plant> getAvailablePlants() {
	    return Collections.unmodifiableList(AVAILABLE_PLANTS);
	  }
	  // ...
	}