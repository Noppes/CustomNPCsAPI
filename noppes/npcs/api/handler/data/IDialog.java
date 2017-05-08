package noppes.npcs.api.handler.data;

import java.util.List;

public interface IDialog {
	public int getId();

	public String getName();

	public IQuest getQuest();

	public List<IDialogOption> getOptions();
	
	public IAvailability getAvailability();
}
