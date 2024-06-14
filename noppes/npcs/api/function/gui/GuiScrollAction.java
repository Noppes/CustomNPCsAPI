package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.ICustomGuiComponent;
import noppes.npcs.api.gui.ScrollItem;

@FunctionalInterface
public interface GuiScrollAction<T extends ICustomGuiComponent> {
    void onAction(ICustomGui gui, T comp, ScrollItem item);
}
