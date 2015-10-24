package noppes.npcs.api.entity;

import noppes.npcs.api.entity.data.INPCDisplayData;

public interface ICustomNpc extends IEntityLivingBase{
	
	public INPCDisplayData getDisplay();
}
