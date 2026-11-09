package logic;

import view.Messages;

public class AddPlantCommand extends Command {
	private String type_of_plant;
	private int row;
	private int col;
	
	public AddPlantCommand() {
		super(Messages.COMMAND_ADD_PLANT_NAME, Messages.COMMAND_ADD_PLANT_SHORTCUT, Messages.COMMAND_ADD_PLANT_DETAILS, Messages.COMMAND_ADD_PLANT_HELP);	
		
	}
	
	public AddPlantCommand(String type_of_plant, int row, int col) {
		super(Messages.COMMAND_ADD_PLANT_NAME, Messages.COMMAND_ADD_PLANT_SHORTCUT, Messages.COMMAND_ADD_PLANT_DETAILS, Messages.COMMAND_ADD_PLANT_HELP);
		this.type_of_plant = type_of_plant;
		this.row = row;
		this.col = col;
		
	}
	
	public Command create(String[] c) {
		
		if(c.length == 4) {
				String type_of_plant = c[1];
				return new AddPlantCommand(type_of_plant, Integer.parseInt(c[3]), Integer.parseInt(c[2]));
			}
		
		return null;
	}

	@Override
	public void execute(GameModel game, GameView view) {
		Position p = new Position(x,y);
		if(isInsideBoard(p)) {
			// Plant plant = PlantFactory.parse(this.plantName, ...);
	        // game.addPlant(plant);
		}
		
	}
	
	
}
