package noppes.npcs.api.block;

public interface IBlockScriptedDoor extends IBlock{

	public boolean getOpen();

	public void setOpen(boolean open);

	/**
	 * @param name The items name for the blocks model to be set
	 */
	public void setBlockModel(String name);

	public String getBlockModel();

}
