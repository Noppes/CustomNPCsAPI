package noppes.npcs.api.item;

import net.minecraft.item.ItemStack;
import noppes.npcs.api.INbt;
import noppes.npcs.api.entity.IEntityLiving;
import noppes.npcs.api.entity.data.IData;

public interface IItemStack {

	public int getStackSize();
	
	/**
	 * @param size The size of the itemstack. A number between 1 and 64
	 */
	public void setStackSize(int size);

	public int getMaxStackSize();
	
	/**
	 * @return Returns the item damage of this item. For tools this is the durability for other items the color and more.
	 */
	public int getItemDamage();	

	/**
	 * @param value The value to be set as item damage. For tools this is the durability for other items the color and more.
	 */
	public void setItemDamage(int value);
	
	public int getMaxItemDamage();
	
	public double getAttackDamage();
	
	public void damageItem(int damage, IEntityLiving living);

	/**
	 * @param id The enchantment id
	 * @param strenght The strenght of the enchantment
	 */
	public void addEnchantment(String id, int strenght);
	
	public boolean isEnchanted();

	/**
	 * @param id The enchantment id
	 */
	public boolean hasEnchant(String id);

	/**
	 * @param id The enchantment id
	 * @return Returns whether something was removed or not
	 */
	public boolean removeEnchant(String id);
	
	/**
	 * @deprecated
	 * @return Returns whether or not this item is a block
	 */
	public boolean isBlock();
	
	public boolean isWearable();
	
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
	 * @deprecated
	 * @return Whether this is a writable book item. If it is check IItemBook for more info
	 */
	public boolean isBook();
	
	/**
	 * @return A copy of the ItemStack
	 */
	public IItemStack copy();
	
	/**
	 * No support is given for this method. Dont use if you dont know what you are doing.
	 * @return Minecraft ItemStack
	 */
	public ItemStack getMCItemStack();

	/**
	 * @return Used to get the extra NBT, which is used by enchantments and customname
	 */
	public INbt getNbt();

	/**
	 * @return Returns false if the nbt of this itemstack is null or empty
	 */
	public boolean hasNbt();
	
	/**
	 * Removes the nbt from the itemstack
	 */
	public void removeNbt();
	
	/**
	 * @return The entire item as nbt
	 */
	public INbt getItemNbt();

	/**
	 * @return Returns true if this itemstack is air or the stacksize is 0
	 */
	public boolean isEmpty();
	
	public int getType();
	
	public String[] getLore();
	
	public void setLore(String[] lore);

	/**
	 * @param name Attribute name see (https://minecraft.gamepedia.com/Attribute)
	 * @param value
	 * @deprecated Replaced by setAttribute(String name, double value, int slot)
	 */
	public void setAttribute(String name, double value);

	/**
	 * @param name Attribute name see (https://minecraft.gamepedia.com/Attribute)
	 * @param value
	 * @param slot Slot in which the attribute is active -1:ALL, 0:MAINHAND, 1:OFFHAND, 2:FEET, 3:LEGS, 4:CHEST, 5:HEAD 
	 */
	public void setAttribute(String name, double value, int slot);

	/**
	 * @param name Attribute name see (https://minecraft.gamepedia.com/Attribute)
	 * @return Returns the value of this attribute
	 */
	public double getAttribute(String name);

	/**
	 * @param name Attribute name see (https://minecraft.gamepedia.com/Attribute)
	 * @return Whether or not this item has the attribute
	 */
	public boolean hasAttribute(String name);
	
	/**
	 * Temp data stores anything but only untill it's reloaded
	 */
	public IData getTempdata();
	
	/**
	 * Stored data persists through world restart. Unlike tempdata only Strings and Numbers can be saved
	 */
	public IData getStoreddata();

	/**
	 * @return Returns 0 if the item isnt food and otherwise the amount it restores hunger
	 */
	public int getFoodLevel();

	public boolean compare(IItemStack item, boolean ignoreNBT);
	
}
