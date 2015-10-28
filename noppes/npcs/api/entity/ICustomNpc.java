package noppes.npcs.api.entity;

import noppes.npcs.api.entity.data.INPCDisplay;
import noppes.npcs.api.entity.data.INPCInventory;
import noppes.npcs.api.entity.data.INPCStats;

public interface ICustomNpc extends IEntityLivingBase{
	
	public INPCDisplay getDisplay();

	public INPCInventory getInventory();

	public INPCStats getStats();

	public int getHomeX();

	public int getHomeY();

	public int getHomeZ();

	public void setHome(int x, int y, int z);

	/**
	 * Basically completely resets the npc. This will also call the Init script
	 */
	public void reset();

	public void say(String message);

	/**
	 * Kill the npc, doesnt't despawn it
	 */
	public void kill();
}
