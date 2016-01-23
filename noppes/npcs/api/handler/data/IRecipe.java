package noppes.npcs.api.handler.data;

import net.minecraft.item.ItemStack;

public interface IRecipe {
	
	public String getName();
	
	
	public boolean isGlobal();
	
	public void setIsGlobal(boolean bo);
	
	public boolean getIgnoreNBT();
	
	public void setIgnoreNBT(boolean bo);
	
	public boolean getIgnoreDamage();
	
	public void setIgnoreDamage(boolean bo);
	
	public int getWidth();
	
	public int getHeight();
	
	public ItemStack getResult();
	
	public ItemStack[] getRecipe();
	
	/**
	 * @param bo Whether or not the recipe saves with customnpcs recipes
	 */
	public void saves(boolean bo);
	
	public boolean saves();
	
	public void save();
	
	public void delete();

	public int getId();
}
