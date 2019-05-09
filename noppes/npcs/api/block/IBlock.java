package noppes.npcs.api.block;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.INbt;
import noppes.npcs.api.IPos;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.data.IData;
import noppes.npcs.api.item.IItemStack;

public interface IBlock {

	public int getX();
	
	public int getY();
	
	public int getZ();
	
	public IPos getPos();
	
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
	
	public boolean isAir();
	
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
	
	public boolean hasTileEntity();

	/**
	 * @return Returns whether it has items stored inside it (e.g. chests, droppers, hoppers, etc)
	 */
	public boolean isContainer();
	
	public IContainer getContainer();
	
	/**
	 * Temp data stores anything but only untill it's reloaded. 
	 * (works only for customnpcs blocks)
	 */
	public IData getTempdata();
	
	/**
	 * Stored data persists through world restart. Unlike tempdata only Strings and Numbers can be saved 
	 * (works only for blocks with TileEntities)
	 */
	public IData getStoreddata();
		
	public IWorld getWorld();
	

	public INbt getTileEntityNBT();

	public void setTileEntityNBT(INbt nbt);
	
	/**
	 * Expert users only
	 * @return Returns minecrafts tilentity
	 */
	public TileEntity getMCTileEntity();
	
	/**
	 * Expert users only
	 * @return Returns minecrafts block
	 */
	public Block getMCBlock();

	/**
	 * @param type Event type
	 * @param data Event data
	 * Example: 
	 * 	Chests - type:1 data:1 opens the lid, type:1 data:0 closes the lid
	 * 	Note block - type:(0-9) data:(0-24) plays different notes
	 * 
	 */
	public void blockEvent(int type, int data);

	public String getDisplayName();

	/**
	 * Expert users only
	 * @return Returns minecrafts iblockstate
	 */
	public IBlockState getMCBlockState();

	/**
	 * Simulates a player interacting with this block (can give weird results)
	 * @param side The side of the block interacted with
	 */
	public void interact(int side);
}
