package noppes.npcs.api.handler.data;

import java.util.List;

public interface IDialog {
	
	public int getId();

	public String getName();
	
	public void setName(String name);
	
	public String getText();
	
	public void setText(String text);

	public IQuest getQuest();
	
	public void setQuest(IQuest quest);
	
	public String getCommand();
	
	public void setCommand(String command);

	public List<IDialogOption> getOptions();
	
	/**
	 * @param slot (0-5)
	 * @return
	 */
	public IDialogOption getOption(int slot);
	
	public IAvailability getAvailability();
	
	public IDialogCategory getCategory();
	
	public void save();
}
