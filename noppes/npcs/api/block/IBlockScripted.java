package noppes.npcs.api.block;

import noppes.npcs.api.IItemStack;

public interface IBlockScripted extends IBlock{

	/**
	 * @param item The item to be set as model
	 */
	public void setModel(IItemStack item);

	public void setModel(String name);

	public IItemStack getModel();

	/**
	 * @param strength Sets the strength of the redstone signal (0-15)
	 */
	public void setRedstonePower(int strength);

	/**
	 * @return Returns the current redstone power (0-15)
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
	 * On servers the enable-command-block option in the server.properties needs to be set to true
	 * @param command The command to be executed
	 */
	public void executeCommand(String command);

}
