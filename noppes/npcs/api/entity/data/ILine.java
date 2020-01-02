package noppes.npcs.api.entity.data;

public interface ILine {
	
	public String getText();
	
	public void setText(String text);
	
	public String getSound();
	
	public void setSound(String sound);
	
	/**
	 * @return If false the text will not show in the chat only in the text bubble
	 */
	public boolean getShowText();
	
	public void setShowText(boolean show);
}
