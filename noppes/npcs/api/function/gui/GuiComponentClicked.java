package noppes.npcs.api.function.gui;

import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.ICustomGuiComponent;

@FunctionalInterface
public interface GuiComponentClicked<T extends ICustomGuiComponent> {
    void onClick(ICustomGui gui, T button);
}
