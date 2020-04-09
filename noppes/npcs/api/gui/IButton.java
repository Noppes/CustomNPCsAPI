package noppes.npcs.api.gui;

public interface IButton extends ICustomGuiComponent {

    int getWidth();
    int getHeight();
    IButton setSize(int width, int height);

    String getLabel();
    IButton setLabel(String label);

}
