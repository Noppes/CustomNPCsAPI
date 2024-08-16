package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;

@FunctionalInterface
public interface GuiAction {
    void onAction(ICustomGui gui);
}
