package noppes.npcs.api.gui;

public interface IButton extends ICustomGuiComponent {

    int getWidth();
    int getHeight();
    IButton setSize(int width, int height);

    String getLabel();
    IButton setLabel(String label);

    String getTexture();
    boolean hasTexture();
    IButton setTexture(String texture);

    int getTextureX();
    int getTextureY();
    IButton setTextureOffset(int textureX, int textureY);

    void setEnabled(boolean bo);
    boolean getEnabled();
}
