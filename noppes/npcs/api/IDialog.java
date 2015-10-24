package noppes.npcs.api;

import java.util.List;

public interface IDialog {
	public int getId();

	public String getName();

	public IQuest getQuest();

	public List<IDialogOption> getOptions();
}
