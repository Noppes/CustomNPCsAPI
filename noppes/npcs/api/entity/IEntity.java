package noppes.npcs.api.entity;

import net.minecraft.entity.Entity;
import noppes.npcs.api.IItemStack;
import noppes.npcs.api.IWorld;

public interface IEntity{
	public double getX();
	public void setX(double x);
	
	public double getY();
	public void setY(double y);
	
	public double getZ();
	public void setZ(double z);

	public int getBlockX();
	public int getBlockY();
	public int getBlockZ();
	
	public void setPosition(double x, double y, double z);
		
	/**
	 * @param rotation The rotation to be set (0-360)
	 */
	public void setRotation(float rotation);
	
	/**
	 * @return Current rotation of the npc
	 */
	public float getRotation();

	public IEntity getMount();
	public void setMount(IEntity entity);
	
	public IEntity getRider();
	public void setRider(IEntity entity);
	
	/**
	 * @param power How strong the knockback is
	 * @param direction The direction in which he flies back (0-360). Usually based on getRotation()
	 */
	public void knockback(int power, float direction);
	
	public boolean isSneaking();
	public boolean isSprinting();
	public void dropItem(IItemStack item);
	
	public boolean inWater();
	public boolean inFire();
	public boolean inLava();
	
	/**
	 * @param key Get temp data for this key
	 * @return Returns the stored temp data (you might have to cast it back to the correct type)
	 */
	public Object getTempData(String key);
	/**
	 * Tempdata gets cleared when the entity gets unloaded or the world restarts
	 * @param key The key for the data stored
	 * @param value The data stored
	 */
	public void setTempData(String key, Object value);
	public boolean hasTempData(String key);
	public void removeTempData(String key);
	public void clearTempData();
	
	/**
	 * @param key The key of the data to be returned
	 * @return Returns the stored data (you might have to cast it back to the correct type)
	 */
	public Object getStoredData(String key);
	/**
	 * Stored data persists through world restart. Unlike tempdata only Strings and Numbers can be saved
	 * @param key The key for the data stored
	 * @param value The data stored. This data can be either a Number or a String. Other data is not stored
	 */
	public void setStoredData(String key, Object value);
	public boolean hasStoredData(String key);
	public void removeStoredData(String key);
	public void clearStoredData();
	
	public boolean isAlive();
	/**
	 * @return The age of this entity in ticks
	 */
	public long getAge();
	
	/**
	 * Despawns this entity. Removes it permanently
	 */
	public void despawn();
	/**
	 * @return Return whether or not this entity is on fire
	 */
	public boolean isBurning();
	
	/**
	 * @param ticks Amount of world ticks this entity will burn. 20 ticks equals 1 second
	 */
	public void setBurning(int ticks);

	/**
	 * Removes fire from this entity
	 */
	public void extinguish();
	
	/**
	 * @return Returns the {@link noppes.npcs.api.IWorld}
	 */
	public IWorld getWorld();

	/**
	 * @return Name as which it's registered in minecraft
	 */
	public String getTypeName();
	/**
	 * @return Returns the {@link noppes.npcs.scripted.constants.EntityType} of this entity
	 */
	public int getType();
	
	/**
	 * @param type {@link noppes.npcs.scripted.constants.EntityType} to check
	 * @return Returns whether the entity is type of the given {@link noppes.npcs.scripted.constants.EntityType}
	 */
	public boolean typeOf(int type);

	/**
	 * Expert users only
	 * @return Returns minecrafts entity
	 */
	public Entity getMCEntity();
}
