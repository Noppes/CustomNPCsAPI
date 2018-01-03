package noppes.npcs.api.item;

public interface IItemScripted extends IItemStack {
	
	public boolean hasTexture(int damage);

	public String getTexture(int damage);
	
	public void setTexture(int damage, String texture);

	public void setMaxStackSize(int size);
}
