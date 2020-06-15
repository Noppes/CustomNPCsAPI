package noppes.npcs.api.gui;

public interface ILabel extends ICustomGuiComponent {

    String getLabel();
    ILabel setLabel(String label);

    int getWidth();
    int getHeight();
    ILabel setSize(int width, int height);

    int getColor();
    ILabel setColor(int color);

    float getScale();
    ILabel setScale(float scale);

}
