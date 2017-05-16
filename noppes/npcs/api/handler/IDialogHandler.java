package noppes.npcs.api.handler;

import java.util.List;

import noppes.npcs.api.handler.data.IDialog;
import noppes.npcs.api.handler.data.IDialogCategory;

public interface IDialogHandler {
	
	public List<IDialogCategory> categories();
	
	public IDialog get(int id);
}
