package noppes.npcs.api;

public interface IScoreboardObjective {

	public String getName();

	public String getDisplayName();

	/**
	 * @param name Name used for display (1-32 chars)
	 */
	public void setDisplayName(String name);

	public String getCriteria();

	/**
	 * @return Return whether or not the objective value can be changed. E.g. player health can't be changed
	 */
	public boolean isReadyOnly();

}
