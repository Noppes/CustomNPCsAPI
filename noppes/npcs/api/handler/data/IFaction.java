package noppes.npcs.api.handler.data;

import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IPlayer;

public interface IFaction {

	public int getId();
	
	public String getName();
	
	public int getDefaultPoints();
	
	public int getColor();
	
	/**
	 * @return Returns -1:Unfriendly, 0:Neutral, 1:Friendly
	 */
	public int playerStatus(IPlayer player);
	
	public boolean hostileToNpc(ICustomNpc npc);
}
