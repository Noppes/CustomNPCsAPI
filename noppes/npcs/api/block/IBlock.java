package noppes.npcs.api.block;

import net.minecraft.block.Block;
import net.minecraft.tileentity.TileEntity;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.data.IData;
import noppes.npcs.api.item.IItemStack;

public interface IBlock {

	public int getX();
	
	public int getY();
	
	public int getZ();
	
	public int getMetadata();
	
	public void setMetadata(int i);
	
	/**
	 * @return Returns this blocks name
	 */
	public String getName();

	/**
	 * Removes this block
	 */
	public void remove();
	
	/**
	 * @return Returns whether or not this block has been replaced by another
	 */
	public boolean isRemoved();
	
	/*
	 * @param name Sets the block to replace this one using the blocks name
	 * @return Returns the new block
	 */
	public IBlock setBlock(String name);

	/**
	 * @param block Sets the block to replace this one
	 * @return Returns the new block
	 */
	public IBlock setBlock(IBlock block);
	

	/**
	 * @return Returns whether it has items stored inside it (e.g. chests, droppers, hoppers, etc)
	 */
	public boolean isContainer();
	
	public IContainer getContainer();
	
	/**
	 * @return Returns whether this block can store temp/stored data. Currently only works with CustomNPCs blocks.
	 */
	public boolean canStoreData();

	/**
	 * Temp data stores anything but only untill it's reloaded
	 */
	public IData getTempdata();
	
	/**
	 * Stored data persists through world restart. Unlike tempdata only Strings and Numbers can be saved
	 */
	public IData getStoreddata();
		
	public IWorld getWorld();
	
	/**
	 * Expert users only
	 * @return Returns minecrafts block
	 */
	public Block getMCBlock();
	
	/**
	 * Expert users only
	 * @return Returns minecrafts tilentity
	 */
	public TileEntity getMCTileEntity();

}
