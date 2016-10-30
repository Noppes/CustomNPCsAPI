package noppes.npcs.api.entity;

import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.api.item.IItemStack;

public interface IEntityLivingBase<T extends EntityLivingBase> extends IEntity<T>{

	public float getHealth();
	
	public void setHealth(float health);
	
	public float getMaxHealth();
	
	public void setMaxHealth(float health);
	
	public boolean isAttacking();
	
	public void setAttackTarget(IEntityLivingBase living);
	
	public IEntityLivingBase getAttackTarget();
	
	public IEntityLivingBase getLastAttacked();
	
	public boolean canSeeEntity(IEntity entity);

	/**
	 * @since 1.9
	 */
	public void swingMainhand();

	/**
	 * @since 1.9
	 */
	public void swingOffhand();
	
	/**
	 * @since 1.9
	 */
	public IItemStack getMainhandItem();

	/**
	 * @since 1.9
	 */
	public void setMainhandItem(IItemStack item);

	/**
	 * @since 1.9
	 */
	public IItemStack getOffhandItem();

	/**
	 * @since 1.9
	 */
	public void setOffhandItem(IItemStack item);
	
	/**
	 * Note not all Living Entities support this
	 * @param slot Slot of what armor piece to get, 0:boots, 1:pants, 2:body, 3:head
	 * @return The item in the given slot
	 */
	public IItemStack getArmor(int slot);
	
	/**
	 * @param slot Slot of what armor piece to set, 0:boots, 1:pants, 2:body, 3:head
	 * @param item Item to be set
	 */
	public void setArmor(int slot, IItemStack item);
	
	/**
	 * Works the same as the <a href="http://minecraft.gamepedia.com/Commands#effect">/effect command</a>
	 * @param effect
	 * @param duration The duration in seconds
	 * @param strength The amplifier of the potion effect
	 * @param hideParticles Whether or not you want to hide potion particles
	 */
	public void addPotionEffect(int effect, int duration, int strength, boolean hideParticles);
	
	public void clearPotionEffects();
	
	public int getPotionEffect(int effect);
	
	public boolean isChild();

	@Override
	public T getMCEntity();
}
