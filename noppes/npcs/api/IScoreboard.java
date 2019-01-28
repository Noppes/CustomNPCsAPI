package noppes.npcs.api;

public interface IScoreboard {

	public IScoreboardObjective[] getObjectives();

	
	/**
	 * @return Returns null if the objective is not found
	 */
	public IScoreboardObjective getObjective(String name);


	public boolean hasObjective(String objective);


	public void removeObjective(String objective);


	/**
	 * @param objective Scoreboard objective name (1-16 chars)
	 * @param criteria The criteria see http://minecraft.gamepedia.com/Scoreboard#Objectives
	 * @return Returns the created ScoreboardObjective
	 */
	public IScoreboardObjective addObjective(String objective, String criteria);


	/**
	 * @param datatag Can be left empty
	 */
	public void setPlayerScore(String player, String objective, int score, String datatag);


	/**
	 * @param datatag Can be left empty
	 */
	public int getPlayerScore(String player, String objective, String datatag);


	/**
	 * @param datatag Can be left empty
	 */
	public boolean hasPlayerObjective(String player, String objective, String datatag);


	/**
	 * @param datatag Can be left empty
	 */
	public void deletePlayerScore(String player, String objective, String datatag);


	public IScoreboardTeam[] getTeams();


	public boolean hasTeam(String name);


	public IScoreboardTeam addTeam(String name);


	public IScoreboardTeam getTeam(String name);


	public void removeTeam(String name); 

	/**
	 * @param player the player whos team you want to get
	 * @return The players team
	 */
	public IScoreboardTeam getPlayerTeam(String player);

	/**
	 * @param player The players who should be removed from his team
	 */
	public void removePlayerTeam(String player);


	public String[] getPlayerList();
}
