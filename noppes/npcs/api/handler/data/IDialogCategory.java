package noppes.npcs.api.handler.data;

import java.util.List;

public interface IDialogCategory {
	
	public List<IDialog> dialogs();
	
	public String getName();
	
	public IDialog create();
}
