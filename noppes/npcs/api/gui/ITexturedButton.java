package noppes.npcs.api.gui;

public interface ITexturedButton extends IButton {

    String getTexture();
    ITexturedButton setTexture(String texture);

    int getTextureX();
    int getTextureY();
    ITexturedButton setTextureOffset(int textureX, int textureY);

}
