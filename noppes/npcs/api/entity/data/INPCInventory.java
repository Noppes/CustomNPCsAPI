package noppes.npcs.api.entity.data;

import noppes.npcs.api.IItemStack;

public interface INPCInventory {

	public IItemStack getRightHand();
	
	public void setRightHand(IItemStack item);

	public IItemStack getLeftHand();
	
	public void setLeftHand(IItemStack item);

	public IItemStack getProjectile();
	
	public void setProjectile(IItemStack item);
	

	/**
	 * @param slot The armor slot to return. 0:head, 1:body, 2:legs, 3:boots
	 */
	public IItemStack getArmor(int slot);
	

	/**
	 * @param slot The armor slot to return. 0:head, 1:body, 2:legs, 3:boots
	 */
	public void setArmor(int slot, IItemStack item);

	/**
	 * @param slot 0-8
	 * @param chance 1-100
	 */
	public void setDropItem(int slot, IItemStack item, int chance);

	/**
	 * @param slot 0-8
	 */
	public IItemStack getDropItem(int slot);
}
