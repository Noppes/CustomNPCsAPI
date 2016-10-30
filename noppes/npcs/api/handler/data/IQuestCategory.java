package noppes.npcs.api.handler.data;

import java.util.List;

public interface IQuestCategory {
	public List<IQuest> quests();
	public String getName();
}
