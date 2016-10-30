package noppes.npcs.api.entity.data.role;

import noppes.npcs.api.entity.data.INPCRole;
import noppes.npcs.api.item.IItemStack;

public interface IRoleTrader extends INPCRole{

	/**
	 * @param slot Slot number 0-17
	 */
	public IItemStack getSold(int slot);
	
	/**
	 * @param slot Slot number 0-17
	 */
	public IItemStack getCurrency1(int slot);
	
	/**
	 * @param slot Slot number 0-17
	 */
	public IItemStack getCurrency2(int slot);

	/**
	 * @param slot Slot number 0-17
	 */
	public void set(int slot, IItemStack currency, IItemStack currency2, IItemStack sold);

	/**
	 * @param slot Slot number 0-17
	 */
	public void remove(int slot);

	public void setMarket(String name);

	public String getMarket();
}
