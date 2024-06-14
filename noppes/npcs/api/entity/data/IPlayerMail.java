package noppes.npcs.api.entity.data;

import noppes.npcs.api.handler.data.IQuest;
import noppes.npcs.api.item.IItemStack;

public interface IPlayerMail {
	
	String getSender();
	
	void setSender(String sender);
	
	String getSubject();
	
	void setSubject(String subject);
	
	String getText();
	
	void setText(String text);
	
	IQuest getQuest();
	
	void setQuest(int id);

	IItemStack getItem(int slot);

	void setItem(int slot, IItemStack item);
	
}
