package noppes.npcs.api.item;

import noppes.npcs.api.block.IBlock;

public interface IItemArmor extends IItemStack {

	public int getArmorSlot();
	
	public String getArmorMaterial();
	
}
