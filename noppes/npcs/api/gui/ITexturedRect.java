package noppes.npcs.api.gui;

public interface ITexturedRect extends ICustomGuiComponent {

    String getTexture();
    ITexturedRect setTexture(String texture);

    float getScale();
    ITexturedRect setScale(float scale);

    int getTextureX();
    int getTextureY();
    ITexturedRect setTextureOffset(int offsetX, int offsetY);

    ITexturedRect setRepeatingTexture(int width, int height, int borderSize);
}
