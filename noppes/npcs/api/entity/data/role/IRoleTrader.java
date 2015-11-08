package noppes.npcs.api.entity.data.role;

import noppes.npcs.api.IItemStack;
import noppes.npcs.api.entity.data.INPCRole;

public interface IRoleTrader extends INPCRole{

	/**
	 * @param slot Slot number 0-17
	 */
	public void setOption(int slot, IItemStack currency, IItemStack currency2, IItemStack sold);

	/**
	 * @param slot Slot number 0-17
	 */
	public void removeOption(int slot);

	public void setMarket(String name);

	public String getMarket();
}
