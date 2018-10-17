package noppes.npcs.api.entity;

import net.minecraft.entity.EntityLiving;
import noppes.npcs.api.IPos;

public interface IEntityLiving<T extends EntityLiving> extends IEntityLivingBase<T>{

	/**
	 * @return Whether or not this entity is navigating somewhere
	 */
	public boolean isNavigating();
	
	/**
	 * Stop navigating wherever this npc was walking to
	 */
	public void clearNavigation();
	
	/**
	 * Start path finding toward this target
	 * @param x Destination x position
	 * @param y Destination x position
	 * @param z Destination x position
	 */
	public void navigateTo(double x, double y, double z, double speed);

	public void jump();

	@Override
	public T getMCEntity();

	public IPos getNavigationPath();
	
}
