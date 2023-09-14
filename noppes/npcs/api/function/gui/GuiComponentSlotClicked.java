package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.IItemSlot;

@FunctionalInterface
public interface GuiComponentSlotClicked {
    boolean onClick(ICustomGui gui, IItemSlot comp, int dragType, String clickType);
}
