package noppes.npcs.api;

import net.minecraft.world.Container;
import net.minecraft.world.inventory.AbstractContainerMenu;
import noppes.npcs.api.item.IItemStack;

public interface IContainer {

	public int getSize();
	
	public IItemStack getSlot(int slot);
	
	public void setSlot(int slot, IItemStack item);
	
	/**
	 * Expert users only
	 * @return Returns minecrafts container
	 */
	public Container getMCInventory();
	
	/**
	 * Expert users only
	 * @return Returns minecrafts container
	 */
	public AbstractContainerMenu getMCContainer();

	/**
	 * @param item
	 * @param ignoreDamage Whether to ignore the item_damage value when comparing
	 * @param ignoreNBT Whether to ignore NBT when comparing
	 * @return
	 */
	public int count(IItemStack item, boolean ignoreDamage, boolean ignoreNBT);
	
	public IItemStack[] getItems();
}
