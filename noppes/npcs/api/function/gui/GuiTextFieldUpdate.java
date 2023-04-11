package noppes.npcs.api.function.gui;

import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.ITextField;

@FunctionalInterface
public interface GuiTextFieldUpdate {
    void onChange(ICustomGui gui, ITextField textfield);
}
