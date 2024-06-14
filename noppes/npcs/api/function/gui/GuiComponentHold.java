package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.ICustomGuiComponent;

@FunctionalInterface
public interface GuiComponentHold<T extends ICustomGuiComponent> {
    void onAction(ICustomGui gui, T comp, long milliSec);
}
