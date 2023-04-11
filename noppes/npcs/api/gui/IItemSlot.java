package noppes.npcs.api.gui;

import net.minecraft.world.inventory.Slot;
import noppes.npcs.api.item.IItemStack;

public interface IItemSlot extends ICustomGuiComponent {

    boolean hasStack();
    IItemStack getStack();
    IItemSlot setStack(IItemStack itemStack);

    boolean getShowGui();
    IItemSlot setShowGui(boolean bo);

    boolean isPlayerSlot();

    Slot getMCSlot();

}
