package noppes.npcs.api;

public interface IData {

	public void put(String key, Object value);
	
	public Object get(String key);

	public void remove(String key);
	
	public boolean has(String key);

	/**
	 * Removes all data
	 */
	public void clear();
	
}
