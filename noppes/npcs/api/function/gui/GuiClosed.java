package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;

@FunctionalInterface
public interface GuiClosed {
    void onAction(ICustomGui gui);
}
