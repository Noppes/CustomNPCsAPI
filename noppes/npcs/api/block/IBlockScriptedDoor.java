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

	/**
	 * On servers the enable-command-block option in the server.properties needs to be set to true <br>
	 * Use /gamerule commandBlockOutput false/true to turn off/on command block feedback <br>
	 * Setting NpcUseOpCommands to true in the CustomNPCs.cfg should allow the npc to run op commands, be warned this could be a major security risk, use at own risk <br>
	 * For permission plugins the commands are run under uuid:c9c843f8-4cb1-4c82-aa61-e264291b7bd6 and name:[customnpcs]
	 * @param command The command to be executed
	 * @return Returns the commands output
	 */
	public String executeCommand(String command);
}
