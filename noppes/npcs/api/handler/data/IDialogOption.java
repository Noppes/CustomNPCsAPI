package noppes.npcs.api.handler.data;

public interface IDialogOption {
	int getSlot();
	
	String getName();
	IDialogOption setName(String name);

	String getText();
	IDialogOption setText(String text);

	/**
	 *
	 * @return see OptionType
	 */
	int getType();
	IDialogOption setType(int type);

	String[] getCommands();
	void setCommands(String... commands);
}