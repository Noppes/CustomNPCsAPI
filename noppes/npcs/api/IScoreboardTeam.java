package noppes.npcs.api;

public interface IScoreboardTeam {

	public String getName();

	public String getDisplayName();

	/**
	 * @param name Name used as display (1-32 chars)
	 */
	public void setDisplayName(String name);

	public void addPlayer(String player);

	public boolean hasPlayer(String player);

	public void removePlayer(String player);

	public String[] getPlayers();

	public void clearPlayers();

	public boolean getFriendlyFire();

	public void setFriendlyFire(boolean bo);

	/**
	 * @param color Valid color values are "black", "dark_blue", "dark_green", "dark_aqua", "dark_red", "dark_purple", "gold", "gray", "dark_gray", "blue", "green", "aqua", "red", "light_purple", "yellow", and "white". Or "reset" if you want default 
	 */
	public void setColor(String color);

	/**
	 * @return Returns color string. Returns null if no color was set
	 */
	public String getColor();

	public void setSeeInvisibleTeamPlayers(boolean bo);

	public boolean getSeeInvisibleTeamPlayers();

}
