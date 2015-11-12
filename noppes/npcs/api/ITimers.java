package noppes.npcs.api;

public interface ITimers {

	public void start(int id, int ticks, boolean repeat);
	
	public boolean has(int id);
	
	/**
	 * @return Returns false if there was no timer with the giver id
	 */
	public boolean stop(int id);
}
