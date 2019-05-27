package noppes.npcs.api.entity.data;

import noppes.npcs.api.IContainer;
import noppes.npcs.api.handler.data.IQuest;

public interface IPlayerMail {
	
	public String getSender();
	
	public void setSender(String sender);
	
	public String getSubject();
	
	public void setSubject(String subject);
	
	public String[] getText();
	
	public void setText(String[] text);
	
	public IQuest getQuest();
	
	public void setQuest(int id);
	
	public IContainer getContainer();
	
}
