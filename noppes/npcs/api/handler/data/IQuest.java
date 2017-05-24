package noppes.npcs.api.handler.data;

import noppes.npcs.api.constants.EnumQuestType;

public interface IQuest {
	public int getId();
	
	public String getName();
	
	public EnumQuestType getType();
	
	public IQuestCategory getCategory();
	
	public String getLogText();
	
	public String getCompleteText();
	
	public IQuest getNextQuest();
}
