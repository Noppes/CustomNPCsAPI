package noppes.npcs.api.entity.data;

public interface INPCAi {

	public int getAnimation();

	public void setAnimation(int type);

	/**
	 * @return Returns the npcs current animation. E.g. when npc is set to LYING it wont be lying while walking so it will be NORMAL
	 * @see noppes.npcs.api.constants.AnimationType
	 */
	public int getCurrentAnimation();

	/**
	 * @param bo Whether or not the npc will try to return to his home position
	 */
	public void setReturnsHome(boolean bo);

	public boolean getReturnsHome();

	/**
	 * @return Retaliation type. 0:Normal, 1:Panic, 2:Retreat, 3:Nothing
	 */
	public int getRetaliateType();

	/**
	 * @param type Retaliation type. 0:Normal, 1:Panic, 2:Retreat, 3:Nothing
	 */
	public void setRetaliateType(int type);

	/**
	 * @return 0:Standing, 1:Wandering, 2:MovingPath
	 */
	public int getMovingType();

	/**
	 * @param type 0:Standing, 1:Wandering, 2:MovingPath
	 */
	public void setMovingType(int type);

	/**
	 * @return 0:RotateBody, 1:NoRotation, 2:Stalking, 3:HeadRotation
	 */
	public int getStandingType();

	/**
	 * @param type 0:RotateBody, 1:NoRotation, 2:Stalking, 3:HeadRotation
	 */
	public void setStandingType(int type);
	
}
