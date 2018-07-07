package noppes.npcs.api.entity;

import net.minecraft.entity.item.EntityItem;
import noppes.npcs.api.item.IItemStack;

public interface IEntityItem<T extends EntityItem> extends IEntity<T>{

	/**
	 * @return The owner of the item, only the owner can pick the item up
	 */
	public String getOwner();

	/**
	 * @param name The owner of the item, only the owner can pick up the item
	 * (note that the item can also be picked up if the lifetime - age is equal or smaller than 200)
	 */
	public void setOwner(String name);

	/**
	 * @return Ticks remaining before it can be picked up (32767 is infinite)
	 */
	public int getPickupDelay();

	/**
	 * @param delay Delay before the item can be picked up (32767 is infinite delay)
	 */
	public void setPickupDelay(int delay);
	
	/** 
	 * @return Returns the age of the item
	 */
	public long getAge();

	/**
	 * @param age Age of the item (-32767 is infinite age)
	 */
	public void setAge(long age);

	/**
	 * @return When the age reaches this the item despawns
	 */
	public int getLifeSpawn();
	
	/**
	 * @param age Age at which the item despawns
	 */
	public void setLifeSpawn(int age);

	public IItemStack getItem();

	public void setItem(IItemStack item);
}
