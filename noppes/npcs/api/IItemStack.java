package noppes.npcs.api;

import net.minecraft.item.ItemStack;
import noppes.npcs.api.entity.IEntityLiving;

public interface IItemStack {

	public int getStackSize();
	
	/**
	 * @param size The size of the itemstack. A number between 1 and 64
	 */
	public void setStackSize(int size);
	
	/**
	 * @return Returns the item damage of this item. For tools this is the durability for other items the color and more.
	 */
	public int getItemDamage();	

	/**
	 * @param value The value to be set as item damage. For tools this is the durability for other items the color and more.
	 */
	public void setItemDamage(int value);
	
	public void damageItem(int damage, IEntityLiving living);

	/**
	 * @param key The key of this NBTTag
	 * @param value The value to be stored. Can be a Number or String
	 */
	public void setTag(String key, Object value);
	
	/**
	 * @param key The key of the NBTTag
	 * @return Returns whether or not the key exists
	 */
	public boolean hasTag(String key);

	/**
	 * @param key The key of the NBTTag
	 * @return Returns the value associated with the key. Returns null of it doesnt exist. (note: you might need to cast the result to the correct type)
	 */
	public Object getTag(String key);
	
	public boolean isEnchanted();
	
	/**
	 * @return Returns whether or not this item is a block
	 */
	public boolean isBlock();
	
	/**
	 * @return Return whether or not the item has a custom name
	 */
	public boolean hasCustomName();
	
	/**
	 * @param name The custom name this item will get
	 */
	public void setCustomName(String name);
	
	/**
	 * @return Return the ingame displayed name. This is either the item name or the custom name if it has one.
	 */
	public String getDisplayName();
	
	/**
	 * @return Get the items ingame name. Use this incase the item ingame has custom name and you want the original name.
	 */
	public String getItemName();

	/**
	 * @return The minecraft name for this item
	 */
	public String getName();
	/**
	 * No support is given for this method. Dont use if you dont know what you are doing.
	 * @return Minecraft ItemStack
	 */
	public ItemStack getMCItemStack();
}
