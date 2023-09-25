package noppes.npcs.api.item;

public interface IItemScripted extends IItemStack {
	
	boolean hasTexture(int damage);

	/**
	 * @deprecated will be removed in the future
	 */
	String getTexture(int damage);

	String getTexture();
	
	/**
	 * @deprecated will be removed in the future
	 */
	void setTexture(int damage, String texture);

	/**
	 * @param texture Item the scripted item will use as texture
	 */
	void setTexture(String texture);

	void setMaxStackSize(int size);

	/**
	 * @return Returns a value between 0 and 1, 0 is an empty durability bar and 1 a full one
	 */
	double getDurabilityValue();

	/**
	 * @param value A value between 0 and 1, 0 is an empty durability bar and 1 a full one
	 */
	void setDurabilityValue(float value);

	/**
	 * @return Returns whether the durability is visible or not
	 */
	boolean getDurabilityShow();

	/**
	 * @param bo Set whether the durability is visible
	 */
	void setDurabilityShow(boolean bo);

	/**
	 * @return Returns the customly set durability color for the bar. If no custom value is set it will return -1
	 */
	int getDurabilityColor();

	/**
	 * @param color Set a custom color hex value for durability bar.
	 */
	void setDurabilityColor(int color);

	/**
	 * @return Returns the color of the item. -1 for no color
	 */
	int getColor();

	/**
	 * @param color Set a custom color hex value for the item tint. -1 to remove the color
	 */
	void setColor(int color);
}
