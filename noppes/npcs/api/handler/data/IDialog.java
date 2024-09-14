package noppes.npcs.api.handler.data;

import java.util.List;

public interface IDialog {
	
	int getId();

	String getName();
	
	void setName(String name);
	
	String getText();
	
	void setText(String text);

	IQuest getQuest();
	
	void setQuest(IQuest quest);
	
	String[] getCommands();
	
	void setCommands(String... commands);

	List<IDialogOption> getOptions();
	
	/**
	 * @param slot (0-5)
	 * @return
	 */
	IDialogOption getOption(int slot);
	
	IAvailability getAvailability();
	
	IDialogCategory getCategory();
	
	void save();
}
