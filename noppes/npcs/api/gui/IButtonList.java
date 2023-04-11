package noppes.npcs.api.gui;

import noppes.npcs.api.function.gui.GuiComponentClicked;

public interface IButtonList extends IButton {

    IButtonList setValues(String... values);
    String[] getValues();

    IButtonList setSelected(int selected);
    int getSelected();

    ITexturedRect getLeftTexture();
    ITexturedRect getRightTexture();
}
