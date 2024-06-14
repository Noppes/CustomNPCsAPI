package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.IItemSlot;

@FunctionalInterface
public interface GuiItemSlotClicked {
    boolean onClick(ICustomGui gui, IItemSlot comp, int dragType, String clickType);
}
