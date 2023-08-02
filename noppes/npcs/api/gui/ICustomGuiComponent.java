package noppes.npcs.api.gui;

import java.util.UUID;

public interface ICustomGuiComponent {

    int getID();
    ICustomGuiComponent setID(int id);

    UUID getUniqueID();

    int getPosX();
    int getPosY();
    ICustomGuiComponent setPos(int x, int y);

    int getWidth();
    int getHeight();
    ICustomGuiComponent setSize(int width, int height);

    boolean hasHoverText();
    String[] getHoverText();
    ICustomGuiComponent setHoverText(String text);
    ICustomGuiComponent setHoverText(String[] text);

    boolean getEnabled();
    ICustomGuiComponent setEnabled(boolean bo);

    boolean getVisible();
    ICustomGuiComponent setVisible(boolean bo);

    int getType();
}
