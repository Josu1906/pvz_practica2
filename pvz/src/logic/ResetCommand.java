package logic;

import view.Messages;

public class ResetCommand extends NoParamsCommand {
	public ResetCommand() {
		super(Messages.COMMAND_RESET_NAME, Messages.COMMAND_RESET_SHORTCUT, Messages.COMMAND_RESET_DETAILS, Messages.COMMAND_RESET_HELP);
	}
}
