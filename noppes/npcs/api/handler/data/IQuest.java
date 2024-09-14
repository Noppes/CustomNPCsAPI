package noppes.npcs.api.handler.data;

import noppes.npcs.api.IContainer;
import noppes.npcs.api.constants.QuestType;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.item.IItemStack;

public interface IQuest {
	int getId();
	
	String getName();
	
	void setName(String name);
	
	int getType();
	
	void setType(int type);
	
	String getLogText();
	
	void setLogText(String text);
	
	String getCompleteText();
	
	void setCompleteText(String text);
	
	IQuest getNextQuest();
	
	void setNextQuest(IQuest quest);
	
	IQuestObjective[] getObjectives(IPlayer player);
	
	IQuestCategory getCategory();

	IItemStack[] getRewards();
	void setRewards(IItemStack[] items);
	
	/**
	 * @return The npcs name where this quest can be completed
	 */
	String getNpcName();
	
	/**
	 * @param name The npcs name where this quest can be completed
	 */
	void setNpcName(String name);
	
	void save();

	boolean getIsRepeatable();

	String[] getCommands();

	void setCommands(String... commands);
}
