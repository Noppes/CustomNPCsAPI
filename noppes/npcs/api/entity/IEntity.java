package noppes.npcs.api.entity;

import net.minecraft.entity.Entity;
import noppes.npcs.api.INbt;
import noppes.npcs.api.IPos;
import noppes.npcs.api.IRayTrace;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.data.IData;
import noppes.npcs.api.item.IItemStack;

public interface IEntity<T extends Entity> {
	
	public double getX();
	
	public void setX(double x);
	
	public double getY();
	
	public void setY(double y);
	
	public double getZ();
	
	public void setZ(double z);

	public int getBlockX();
	
	public int getBlockY();
	
	public int getBlockZ();
	
	public IPos getPos();
	
	public void setPos(IPos pos);
	
	public void setPosition(double x, double y, double z);
		
	/**
	 * @param rotation The rotation to be set (0-360)
	 */
	public void setRotation(float rotation);
	
	/**
	 * @return Current rotation of the entity
	 */
	public float getRotation();
	
	/**
	 * @return Returns the height of the bounding box
	 */
	public float getHeight();

	/**
	 * @return Returns the eye height of the entity, used in this like canSee and such
	 */
	public float getEyeHeight();
		
	/**
	 * @return Returns the width of the bounding box
	 */
	public float getWidth();
	
	/**
	 * @param pitch The viewing pitch
	 */
	public void setPitch(float pitch);
	
	/**
	 * @return Entities viewing pitch
	 */
	public float getPitch();

	public IEntity getMount();
	
	public void setMount(IEntity entity);

	/**
	 * @return Returns the entities riding this entity
	 */
	public IEntity[] getRiders();
	
	/**
	 * @return Returns the entities riding this entity including the entities riding those entities
	 */
	public IEntity[] getAllRiders();

	public void addRider(IEntity entity);

	public void clearRiders();
	
	/**
	 * @param power How strong the knockback is
	 * @param direction The direction in which he flies back (0-360). Usually based on getRotation()
	 */
	public void knockback(int power, float direction);
	
	public boolean isSneaking();
	
	public boolean isSprinting();
	
	public IEntityItem dropItem(IItemStack item);
	
	public boolean inWater();
	
	public boolean inFire();
	
	public boolean inLava();
	
	/**
	 * Temp data stores anything but only untill it's reloaded
	 */
	public IData getTempdata();
	
	/**
	 * Stored data persists through world restart. Unlike tempdata only Strings and Numbers can be saved
	 */
	public IData getStoreddata();
	
	/**
	 * The Entity's extra stored NBT data
	 * @return The Entity's extra stored NBT data
	 */
	public INbt getNbt();
	
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
	 * Spawns this entity into the world (For NPCs dont forget to set their home position)
	 */
	public void spawn();

	/**
	 * Kill the entity, doesnt't despawn it
	 */
	public void kill();
		
	/**
	 * @return Return whether or not this entity is on fire
	 */
	public boolean isBurning();
	
	/**
	 * @param seconds Amount of seconds this entity will burn. 
	 */
	public void setBurning(int seconds);

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
	 * @return Returns the {@link noppes.npcs.api.constants.EntityType} of this entity
	 */
	public int getType();
	
	/**
	 * @param type {@link noppes.npcs.api.constants.EntityType} to check
	 * @return Returns whether the entity is type of the given {@link noppes.npcs.api.constants.EntityType}
	 */
	public boolean typeOf(int type);

	/**
	 * Expert users only
	 * @return Returns minecrafts entity
	 */
	public T getMCEntity();
	
	public String getUUID();
	
	public String generateNewUUID();
	
	/**
	 * Stores the entity as clone server side
	 * @param tab
	 * @param name
	 */
	public void storeAsClone(int tab, String name);

	/**
	 * This is not a function you should be calling every tick.
	 * Returns the entire entity as nbt
	 */
	public INbt getEntityNbt();

	/**
	 * This is not a function you should be calling every tick
	 */
	public void setEntityNbt(INbt nbt);

	/**
	 * Gets the first block within distance the npc is looking at
	 * @param distance
	 * @param stopOnLiquid
	 * @param ignoreBlockWithoutBoundingBox
	 * @return
	 */
	public IRayTrace rayTraceBlock(double distance, boolean stopOnLiquid, boolean ignoreBlockWithoutBoundingBox);

	/**
	 * Gets the entities within distance the npc is looking at sorted by distance
	 * @param distance
	 * @param stopOnLiquid
	 * @param ignoreBlockWithoutBoundingBox
	 * @return
	 */
	public IEntity[] rayTraceEntities(double distance, boolean stopOnLiquid, boolean ignoreBlockWithoutBoundingBox);
	
	/**
	 * Tags are used by scoreboards and can be used in commands
	 */
	public String[] getTags();
	
	public void addTag(String tag);
	
	public boolean hasTag(String tag);
	
	public void removeTag(String tag);

	/**
	 * Play specific minecraft animations client side
	 * 0 and 3 are for EntityLivingBase entities and 2 is only for players
	 * @param type 0:Swing main hand, 1:Hurt animation, 2:Wakeup Player 3:Swing offhand hand, 4:Crit particle, 5:Spell crit particle
	 */
	public void playAnimation(int type);

	public void damage(float amount);

	public double getMotionX();
	
	public double getMotionY();
	
	public double getMotionZ();

	public void setMotionX(double motion);
	
	public void setMotionY(double motion);
	
	public void setMotionZ(double motion);
	
	/**
	 * @return Returns the current name displayed by the entity
	 */
	public String getName();
	
	/**
	 * @param name Set a custom name for this entity
	 */
	public void setName(String name);

	public boolean hasCustomName();

	/**
	 * @return Returns the original name incase a custom name has been set
	 */
	public String getEntityName();
}
