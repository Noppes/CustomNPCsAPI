package noppes.npcs.api.entity.data;

import noppes.npcs.api.handler.data.IAvailability;

public interface IMark {

	public IAvailability getAvailability();
	
	public int getColor();
	
	public void setColor(int color);
	
	public int getType();
	
	public void setType(int type);
	
	/**
	 * Calling this will send the changes you've made to the clients
	 */
	public void update();
}
