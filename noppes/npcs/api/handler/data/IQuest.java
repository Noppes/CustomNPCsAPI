package noppes.npcs.api.handler.data;

import noppes.npcs.api.constants.QuestType;

public interface IQuest {
	public int getId();
	
	public String getName();
	
	public void setName(String name);
	
	public int getType();
	
	public void setType(int type);
	
	public String getLogText();
	
	public void setLogText(String text);
	
	public String getCompleteText();
	
	public void setCompleteText(String text);
	
	public IQuest getNextQuest();
	
	public void setNextQuest(IQuest quest);
	
	public IQuestCategory getCategory();
	
	public void save();
}
