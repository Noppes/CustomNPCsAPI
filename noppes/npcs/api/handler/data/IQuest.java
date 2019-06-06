package noppes.npcs.api.handler.data;

import noppes.npcs.api.IContainer;
import noppes.npcs.api.constants.QuestType;
import noppes.npcs.api.entity.IPlayer;

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
	
	public IQuestObjective[] getObjectives(IPlayer player);
	
	public IQuestCategory getCategory();
	
	public IContainer getRewards();
	
	/**
	 * @return The npcs name where this quest can be completed
	 */
	public String getNpcName();
	
	/**
	 * @param name The npcs name where this quest can be completed
	 */
	public void setNpcName(String name);
	
	public void save();

	public boolean getIsRepeatable();
}
