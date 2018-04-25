package noppes.npcs.api.item;

public interface IItemBook extends IItemStack{

	/**
	 * @return If the item is a book, returns a string array with book pages
	 */
	public String[] getText();
	
	/**
	 * Set the text for multiple pages
	 */
	public void setText(String[] pages);

	public String getAuthor();
	
	public void setAuthor(String author);

	public String getTitle();
	
	public void setTitle(String title);

}
