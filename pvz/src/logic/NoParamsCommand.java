package logic;

public abstract class NoParamsCommand extends Command {

	protected String[] c;
	
	public NoParamsCommand(String name, String shorcut, String details, String help) {
		super(name, shorcut, details, help);
	}
	
	public Command create(String[] c) {
		if(c.length == 1) {			
			return this;
		}
		
		return null;
	
	}
}
