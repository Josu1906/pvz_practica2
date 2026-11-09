package logic;

import view.Messages;

public class HelpCommand extends Command {

	public HelpCommand() {
		super(Messages.COMMAND_HELP_NAME, Messages.COMMAND_HELP_SHORTCUT, Messages.COMMAND_HELP_DETAILS, Messages.COMMAND_HELP_HELP);
	}

}
