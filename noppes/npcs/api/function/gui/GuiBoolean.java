package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.ICustomGuiComponent;

@FunctionalInterface
public interface GuiBoolean {
    void onAction(ICustomGui gui, boolean bo);
}
