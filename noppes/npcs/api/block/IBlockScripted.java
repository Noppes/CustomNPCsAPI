package noppes.npcs.api.block;

import noppes.npcs.api.ITimers;
import noppes.npcs.api.item.IItemStack;

public interface IBlockScripted extends IBlock{

	/**
	 * @param item The item to be set as model
	 */
	public void setModel(IItemStack item);

	public void setModel(String name);

	public IItemStack getModel();
	
	public ITimers getTimers();

	/**
	 * @param strength Sets the strength of the redstone signal (0-15)
	 */
	public void setRedstonePower(int strength);

	/**
	 * @return Returns the current redstone power (0-15) this block is giving off
	 */
	public int getRedstonePower();

	public void setIsLadder(boolean enabled);

	public boolean getIsLadder();

	/**
	 * @param value Sets the light value (0-15)
	 */
	public void setLight(int value);

	/**
	 * @return Returns the light value (0-15)
	 */
	public int getLight();

	/**
	 * @param x Scale x (0-10)
	 * @param y Scale y (0-10)
	 * @param z Scale z (0-10)
	 */
	public void setScale(float x, float y, float z);

	public float getScaleX();

	public float getScaleY();

	public float getScaleZ();

	/**
	 * @param x Rotation x (0-359)
	 * @param y Rotation y (0-359)
	 * @param z Rotation z (0-359)
	 */
	public void setRotation(int x, int y, int z);

	public int getRotationX();

	public int getRotationY();

	public int getRotationZ();

	/**
	 * On servers the enable-command-block option in the server.properties needs to be set to true <br>
	 * Use /gamerule commandBlockOutput false/true to turn off/on command block feedback <br>
	 * Setting NpcUseOpCommands to true in the CustomNPCs.cfg should allow the npc to run op commands, be warned this could be a major security risk, use at own risk <br>
	 * For permission plugins the commands are run under uuid:c9c843f8-4cb1-4c82-aa61-e264291b7bd6 and name:[customnpcs]
	 * @param command The command to be executed
	 * @return Returns the commands output
	 */
	public String executeCommand(String command);

	public boolean getIsPassible();
	
	public void setIsPassible(boolean bo);
	
	/**
	 * @return Harvesting hardness (-1 makes it unharvestable)
	 */
	public float getHardness();
	
	public void setHardness(float hardness);
	
	/**
	 * @return Explosion resistance (-1 makes it unexplodable)
	 */
	public float getResistance();
	
	public void setResistance(float resistance);

	public ITextPlane getTextPlane();

	public ITextPlane getTextPlane2();

	public ITextPlane getTextPlane3();

	public ITextPlane getTextPlane4();

	public ITextPlane getTextPlane5();

	public ITextPlane getTextPlane6();

}
