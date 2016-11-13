package noppes.npcs.api;

import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import noppes.npcs.api.item.IItemStack;

public interface IContainer {

	public int getSize();
	
	public IItemStack getSlot(int slot);
	
	public void setSlot(int slot, IItemStack item);
	
	/**
	 * Expert users only
	 * @return Returns minecrafts container
	 */
	public IInventory getMCInventory();
	
	/**
	 * Expert users only
	 * @return Returns minecrafts container
	 */
	public Container getMCContainer();
}
