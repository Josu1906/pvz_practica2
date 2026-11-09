package logic;

import view.Messages;

public class ListPlantsCommand extends NoParamsCommand {
	public ListPlantsCommand() {
		super(Messages.COMMAND_ADD_PLANT_NAME, Messages.COMMAND_LIST_PLANTS_SHORTCUT, Messages.COMMAND_LIST_ZOMBIES_DETAILS, Messages.COMMAND_LIST_PLANTS_HELP);
	}

	@Override
	public void execute(GameModel game, GameView view) {
		// TODO Auto-generated method stub
		
	}
}
