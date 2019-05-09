package noppes.npcs.api;

import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import noppes.npcs.api.item.IItemStack;

public interface IContainerCustomChest extends IContainer {

	public void setName(String name);

	public String getName();
}
