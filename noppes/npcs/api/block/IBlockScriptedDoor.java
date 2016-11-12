package noppes.npcs.api.block;

import noppes.npcs.api.ITimers;

public interface IBlockScriptedDoor extends IBlock{
	
	public ITimers getTimers();

	public boolean getOpen();

	public void setOpen(boolean open);

	/**
	 * @param name The items name for the blocks model to be set
	 */
	public void setBlockModel(String name);

	public String getBlockModel();
	
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

}
