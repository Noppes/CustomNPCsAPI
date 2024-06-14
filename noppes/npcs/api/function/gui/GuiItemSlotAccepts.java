package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.IItemSlot;
import noppes.npcs.api.item.IItemStack;

@FunctionalInterface
public interface GuiItemSlotAccepts {
    boolean onAccepts(ICustomGui gui, IItemSlot slot, IItemStack itemstack);
}
