package noppes.npcs.api.gui;

public interface ICustomGuiComponent {

    int getID();
    ICustomGuiComponent setID(int id);

    int getPosX();
    int getPosY();
    ICustomGuiComponent setPos(int x, int y);

    boolean hasHoverText();
    String[] getHoverText();
    ICustomGuiComponent setHoverText(String text);
    ICustomGuiComponent setHoverText(String[] text);

}
