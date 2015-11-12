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

	/**
	 * @return Returns whether or not he can attack invisible entities
	 */
	public boolean getAttackInvisible();

	public void setAttackInvisible(boolean attack);

	public int getWanderingRange();

	/**
	 * @param range (1-50)
	 */
	public void setWanderingRange(int range);

	public boolean getInteractWithNPCs();

	public void setInteractWithNPCs(boolean interact);

	public boolean getStopOnInteract();

	public void setStopOnInteract(boolean stopOnInteract);

	public int getWalkingSpeed();

	/**
	 * @param speed 0-10
	 */	
	public void setWalkingSpeed(int speed);
	
	/**
	 * @return 0:Looping, 1:Backtracking
	 */
	public int getMovingPathType();

	public boolean getMovingPathPauses();

	/**
	 * @param type 0:Looping, 1:Backtracking
	 */
	public void setMovingPathType(int type, boolean pauses);
	
}
