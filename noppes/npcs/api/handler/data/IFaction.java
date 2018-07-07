package noppes.npcs.api.handler.data;

import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IPlayer;

public interface IFaction {

	public int getId();
	
	public String getName();
	
	public int getDefaultPoints();
	
	public void setDefaultPoints(int points);
	
	public int getColor();
	
	/**
	 * @return Returns -1:Unfriendly, 0:Neutral, 1:Friendly
	 */
	public int playerStatus(IPlayer player);
	
	public boolean hostileToNpc(ICustomNpc npc);
	
	public boolean hostileToFaction(int factionId);
	
	public int[] getHostileList();
	
	public void addHostile(int id);
	
	public void removeHostile(int id);
	
	public boolean hasHostile(int id);
	
	public boolean getIsHidden();
	
	public void setIsHidden(boolean bo);
	
	public boolean getAttackedByMobs();
	
	public void setAttackedByMobs(boolean bo);
	
	public void save();
}
