package noppes.npcs.api.entity.data;

import noppes.npcs.api.item.IItemStack;

public interface INPCInventory {

	public IItemStack getRightHand();
	
	public void setRightHand(IItemStack item);

	public IItemStack getLeftHand();
	
	public void setLeftHand(IItemStack item);

	public IItemStack getProjectile();
	
	public void setProjectile(IItemStack item);
	

	/**
	 * @param slot The armor slot to return. 0:head, 1:body, 2:legs, 3:boots
	 * @return Returns the armor item
	 */
	public IItemStack getArmor(int slot);
	

	/**
	 * @param slot The armor slot to return. 0:head, 1:body, 2:legs, 3:boots
	 * @param item
	 */
	public void setArmor(int slot, IItemStack item);

	/**
	 * @param slot 0-8
	 * @param item
	 * @param chance 1-100
	 */
	public void setDropItem(int slot, IItemStack item, int chance);

	/**
	 * @param slot 0-8
	 */
	public IItemStack getDropItem(int slot);

	public int getExpMin();

	public int getExpMax();

	/**
	 * @return Returns a value between expMin and expMax
	 */
	public int getExpRNG();

	/**
	 * Sets the random exp dropped when the npc dies
	 */
	public void setExp(int min, int max);

}
