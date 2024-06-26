package noppes.npcs.api.function.gui;

import noppes.npcs.api.gui.ICustomGui;

@FunctionalInterface
public interface GuiClosed {
    /**
     * Called when a gui is closed
     * @param gui The gui being closed
     * @param parent If it was a subgui, this is the parent
     */
    void onAction(ICustomGui gui, ICustomGui parent);
}
