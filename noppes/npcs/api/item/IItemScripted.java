package noppes.npcs.api.item;

public interface IItemScripted extends IItemStack {
	
	public boolean hasTexture(int damage);

	/**
	 * @param damage
	 * @return Returns the texture associated with this damage value
	 */
	public String getTexture(int damage);
	
	/**
	 * All scripted items with the same damage value have the same texture.
	 * To change the actual texture of the item call setItemDamage afterwards with the same damage value
	 * @param damage The damage value
	 * @param texture Texture you want this damage value to have
	 */
	public void setTexture(int damage, String texture);

	public void setMaxStackSize(int size);

	/**
	 * @return Returns a value between 0 and 1, 0 is an empty durability bar and 1 a full one
	 */
	public double getDurabilityValue();

	/**
	 * @param value A value between 0 and 1, 0 is an empty durability bar and 1 a full one
	 */
	public void setDurabilityValue(float value);

	/**
	 * @return Returns whether the durability is visible or not
	 */
	public boolean getDurabilityShow();

	/**
	 * @param bo Set whether the durability is visible
	 */
	public void setDurabilityShow(boolean bo);

	/**
	 * @return Returns the customly set durability color for the bar. If no custom value is set it will return -1
	 */
	public int getDurabilityColor();

	/**
	 * @param color Set a custom color hex value for durability bar.
	 */
	public void setDurabilityColor(int color);

	/**
	 * @return Returns the color of the item. -1 for no color
	 */
	public int getColor();

	/**
	 * @param color Set a custom color hex value for the item tint. -1 to remove the color
	 */
	public void setColor(int color);
}
