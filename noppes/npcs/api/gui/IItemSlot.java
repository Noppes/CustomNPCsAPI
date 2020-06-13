package noppes.npcs.api.gui;

import net.minecraft.inventory.Slot;
import noppes.npcs.api.item.IItemStack;

public interface IItemSlot extends ICustomGuiComponent {

    boolean hasStack();
    IItemStack getStack();
    IItemSlot setStack(IItemStack itemStack);

    Slot getMCSlot();

}
