package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.IItemSlot;
import noppes.npcs.api.gui.ITextField;

@FunctionalInterface
public interface GuiItemSlotUpdate {
    void onUpdate(ICustomGui gui, IItemSlot slot);
}
