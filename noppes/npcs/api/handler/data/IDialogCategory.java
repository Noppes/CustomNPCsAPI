package noppes.npcs.api.handler.data;

import java.util.List;

public interface IDialogCategory {
	
	public List<IDialog> dialogs();
	
	public String getName();

    void setName(String name);

    public IDialog create();
}
