package noppes.npcs.api.function.gui;

import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.ICustomGuiComponent;
import noppes.npcs.api.gui.ITextField;

@FunctionalInterface
public interface GuiComponentUpdate<T extends ICustomGuiComponent> {
    void onChange(ICustomGui gui, T comp);
}
