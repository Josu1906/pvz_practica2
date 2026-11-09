package logic;

import java.util.*;

public abstract class Command {
	public String name = "";
	public String shorcut = "";
	public String details = "";
	public String help = "";
	
	protected static final List<Object> AVAILABLE_COMMANDS = Arrays.asList(
		      new AddPlantCommand(),
		      new ListPlantsCommand(),
		      new ResetCommand(),
		      new HelpCommand()
		  );
	
	public Command(String name, String shorcut, String details, String help) {
		this.name = name;
		this.shorcut = shorcut;
		this.details = details;
		this.help = help;
	}
	
	protected boolean matchCommand(String c) {
		boolean ret = false;
		if((c.equalsIgnoreCase(name) || c.equalsIgnoreCase(shorcut)) ) {
			ret = true;
		}	
		
		return ret;	
	}
	
	protected abstract Command create(String[] c);
	public abstract void execute(GameModel game, GameView view);
	
	public static Command parse(String[] commandWords) {
		for(Object c : AVAILABLE_COMMANDS) {
			if(((Command) c).matchCommand(commandWords[0])) {
				return ((Command) c).create(commandWords);
			}
		}
		
		return null;
    }
	
}
