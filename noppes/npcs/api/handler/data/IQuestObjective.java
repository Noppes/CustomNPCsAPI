package noppes.npcs.api.handler.data;

import net.minecraft.network.chat.Component;



public interface IQuestObjective {

	public int getProgress();
	
	/**
	 * Does not work for Item or Dialog quests
	 * @param progress Progress of the objective
	 */
	public void setProgress(int progress);
	
	public int getMaxProgress();
	
	public boolean isCompleted();

	public String getText();

	public Component getMCText();
}
