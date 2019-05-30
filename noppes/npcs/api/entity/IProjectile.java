package noppes.npcs.api.entity;

import net.minecraft.entity.projectile.EntityThrowable;
import noppes.npcs.api.item.IItemStack;

public interface IProjectile<T extends EntityThrowable> extends IThrowable<T> {

	public IItemStack getItem();
	
	public void setItem(IItemStack item);

	/**
	 * @return Returns whether the arrow flies in a straight line or not
	 */
	public boolean getHasGravity();

	/**
	 * @param bo Whether the arrow flies in a straight line or not
	 */
	public void setHasGravity(boolean bo);

	public int getAccuracy();

	public void setAccuracy(int accuracy);

	/**
	 * Entity where the projectile heads towards
	 * The position for the projectile needs to have been set for this
	 */
	public void setHeading(IEntity entity);

	/**
	 * Position where the projectile heads towards.
	 * The position for the projectile needs to have been set for this
	 */
	public void setHeading(double x, double y, double z);

	/**
	 * @param yaw Rotation yaw
	 * @param pitch Rotation pitch
	 */
	public void setHeading(float yaw, float pitch);
	
	/**
	 * For scripters to enable projectile events in their current scripting container
	 */
	public void enableEvents();

	
}
