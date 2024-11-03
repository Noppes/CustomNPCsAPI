package noppes.npcs.api.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.INbt;
import noppes.npcs.api.IPos;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.IEntityLiving;
import noppes.npcs.api.entity.data.IData;

public interface IBlock {

	int getX();
	
	int getY();
	
	int getZ();
	
	IPos getPos();
	
	Object getProperty(String name);
	
	void setProperty(String name, Object val);

	String[] getProperties();
	
	/**
	 * @return Returns this blocks name
	 */
	String getName();

	/**
	 * Removes this block
	 */
	void remove();
	
	/**
	 * @return Returns whether or not this block has been replaced by another
	 */
	boolean isRemoved();
	
	boolean isAir();
	
	/*
	 * @param name Sets the block to replace this one using the blocks name
	 * @return Returns the new block
	 */
	IBlock setBlock(String name);

	/**
	 * @param block Sets the block to replace this one
	 * @return Returns the new block
	 */
	IBlock setBlock(IBlock block);
	
	boolean hasTileEntity();

	/**
	 * @return Returns whether it has items stored inside it (e.g. chests, droppers, hoppers, etc)
	 */
	boolean isContainer();
	
	IContainer getContainer();
	
	/**
	 * Temp data stores anything but only untill it's reloaded. 
	 * (works only for customnpcs blocks)
	 */
	IData getTempdata();
	
	/**
	 * Stored data persists through world restart. Unlike tempdata only Strings and Numbers can be saved 
	 * (works only for blocks with TileEntities)
	 */
	IData getStoreddata();
		
	IWorld getWorld();
	

	INbt getBlockEntityNBT();

	void setTileEntityNBT(INbt nbt);
	
	/**
	 * Expert users only
	 * @return Returns minecrafts tilentity
	 */
	BlockEntity getMCTileEntity();
	
	/**
	 * Expert users only
	 * @return Returns minecrafts block
	 */
	Block getMCBlock();

	/**
	 * @param type Event type
	 * @param data Event data
	 * Example: 
	 * 	Chests - type:1 data:1 opens the lid, type:1 data:0 closes the lid
	 * 	Note block - type:(0-9) data:(0-24) plays different notes
	 * 
	 */
	void blockEvent(int type, int data);

	String getDisplayName();

	/**
	 * Expert users only
	 * @return Returns minecrafts iblockstate
	 */
	BlockState getMCBlockState();

	/**
	 * Simulates a player interacting with this block (can give weird results)
	 * @param side The side of the block interacted with
	 * @param entity Entity that clicked, can be null
	 */
	void interact(int side, IEntityLiving entity);

	/**
	 * Call to let minecraft know to save all changes made in the blocks data
	 */
	void setChanged();
}
