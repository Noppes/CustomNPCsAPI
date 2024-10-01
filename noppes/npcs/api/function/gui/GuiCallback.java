package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;

@FunctionalInterface
public interface GuiCallback<T> {
    void onAction(ICustomGui gui, T v);
}
