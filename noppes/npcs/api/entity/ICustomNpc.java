package noppes.npcs.api.entity;

import net.minecraft.entity.EntityCreature;
import noppes.npcs.api.ITimers;
import noppes.npcs.api.entity.data.INPCAdvanced;
import noppes.npcs.api.entity.data.INPCAi;
import noppes.npcs.api.entity.data.INPCDisplay;
import noppes.npcs.api.entity.data.INPCInventory;
import noppes.npcs.api.entity.data.INPCJob;
import noppes.npcs.api.entity.data.INPCRole;
import noppes.npcs.api.entity.data.INPCStats;
import noppes.npcs.api.handler.data.IFaction;
import noppes.npcs.api.item.IItemStack;

public interface ICustomNpc<T extends EntityCreature> extends IEntityLivingBase<T>{
	
	public INPCDisplay getDisplay();

	public INPCInventory getInventory();

	public INPCStats getStats();

	public INPCAi getAi();

	public INPCAdvanced getAdvanced();
	
	public IFaction getFaction();

	public void setFaction(int id);

	public INPCRole getRole();
	
	public INPCJob getJob();
	
	public ITimers getTimers();

	public int getHomeX();

	public int getHomeY();

	public int getHomeZ();

	public void setHome(int x, int y, int z);

	/**
	 * Basically completely resets the npc. This will also call the Init script
	 */
	public void reset();

	public void say(String message);

	public void sayTo(IPlayer player, String message);

	/**
	 * Kill the npc, doesnt't despawn it
	 */
	public void kill();

	/**
	 * @param item The item you want to shoot
	 * @param accuracy Accuracy of the shot (1-100)
	 */
	public void shootItem(IEntityLivingBase target, IItemStack item, int accuracy);

	/**
	 * If the player can't carry the item it will fall on the ground. (unless the player is in creative)
	 */
	public void giveItem(IPlayer player, IItemStack item);

	/**
	 * On servers the enable-command-block option in the server.properties needs to be set to true
	 */
	public void executeCommand(String command);

	@Override
	public T getMCEntity();
	
}
