package noppes.npcs.api.gui;

public interface ILabel extends ICustomGuiComponent {

    String getText();
    ILabel setText(String label);

    int getColor();
    ILabel setColor(int color);

    float getScale();
    ILabel setScale(float scale);

    boolean getCentered();
    ILabel setCentered(boolean bo);

}
