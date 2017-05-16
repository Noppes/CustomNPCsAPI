package noppes.npcs.api.handler;

import java.util.List;

import noppes.npcs.api.handler.data.IQuest;
import noppes.npcs.api.handler.data.IQuestCategory;

public interface IQuestHandler {
	
	public List<IQuestCategory> categories();
	
	public IQuest get(int id);
}
