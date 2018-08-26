package noppes.npcs.api.entity.data;

public interface INPCAdvanced {

	/**
	 * @param type 0:Interact, 1:Attack, 2:World, 3:Killed, 4:Kill, 5:NPC Interact
	 * @param slot 0-7
	 */
	public void setLine(int type, int slot, String text, String sound);

	/**
	 * @param type 0:Interact, 1:Attack, 2:World, 3:Killed, 4:Kill, 5:NPC Interact
	 * @param slot 0-7
	 */
	public String getLine(int type, int slot);

	/**
	 * @param type 0:Interact, 1:Attack, 2:World, 3:Killed, 4:Kill, 5:NPC Interact
	 */
	public int getLineCount(int type);

	/**
	 * @param type 0:Idle, 1:Angry, 2:Hurt, 3:Death, 4:Step
	 */
	public String getSound(int type);
	
	/**
	 * @param type 0:Idle, 1:Angry, 2:Hurt, 3:Death, 4:Step
	 */
	public void setSound(int type, String sound);

}
