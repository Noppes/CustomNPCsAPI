package noppes.npcs.api.item;

import net.minecraft.world.entity.EquipmentSlot;

public interface IItemArmor extends IItemStack {

	int getArmorSlot();
	
	String getArmorMaterial();

    EquipmentSlot getSlotType();
}
