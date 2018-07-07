package noppes.npcs.api.entity.data.role;

import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.entity.data.INPCRole;

public interface IRoleFollower extends INPCRole{

	public int getDays();

	public void addDays(int days);

	public boolean getInfinite();

	public void setInfinite(boolean infinite);

	public boolean getGuiDisabled();

	public void setGuiDisabled(boolean disabled);
	
	public IPlayer getFollowing();
	
	public void setFollowing(IPlayer player);
	
	public boolean isFollowing();
	
	public void reset();

	public void setRefuseSoulstone(boolean refuse);

	public boolean getRefuseSoulstone();

}
