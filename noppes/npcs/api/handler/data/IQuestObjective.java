package noppes.npcs.api.handler.data;

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
}
