package noppes.npcs.api.gui;

public interface ILabel extends ICustomGuiComponent {

    String getText();
    ILabel setText(String label);

    int getWidth();
    int getHeight();
    ILabel setSize(int width, int height);

    int getColor();
    ILabel setColor(int color);

    float getScale();
    ILabel setScale(float scale);

}
