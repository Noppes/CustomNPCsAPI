package noppes.npcs.api.entity;

import noppes.npcs.api.entity.data.INPCDisplayData;
import noppes.npcs.api.entity.data.INPCInventoryData;

public interface ICustomNpc extends IEntityLivingBase{
	
	public INPCDisplayData getDisplay();

	public INPCInventoryData getInventory();
}
