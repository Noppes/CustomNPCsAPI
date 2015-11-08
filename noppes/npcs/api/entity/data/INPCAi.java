package noppes.npcs.api.entity.data;

public interface INPCAi {

	/**
	 * @param bo Whether or not the npc will try to return to his home position
	 */
	public void setReturnsHome(boolean bo);

	boolean getReturnsHome();

}
