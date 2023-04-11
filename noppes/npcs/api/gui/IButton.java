package noppes.npcs.api.gui;

import noppes.npcs.api.function.gui.GuiComponentClicked;
import noppes.npcs.api.item.IItemStack;

public interface IButton extends ICustomGuiComponent {

    int getWidth();
    int getHeight();
    IButton setSize(int width, int height);

    String getLabel();
    IButton setLabel(String label);

    ITexturedRect getTextureRect();
    void setTextureRect(ITexturedRect rect);

    /** use ITexturedRect */
    @Deprecated
    String getTexture();
    /** use ITexturedRect */
    @Deprecated
    boolean hasTexture();
    /** use ITexturedRect */
    @Deprecated
    IButton setTexture(String texture);

    /** use ITexturedRect */
    @Deprecated
    int getTextureX();
    /** use ITexturedRect */
    @Deprecated
    int getTextureY();
    /** use ITexturedRect */
    @Deprecated
    IButton setTextureOffset(int textureX, int textureY);

    int getTextureHoverOffset();
    IButton setTextureHoverOffset(int height);

    IItemStack getDisplayItem();
    IButton setDisplayItem(IItemStack item);

    void setEnabled(boolean bo);
    boolean getEnabled();

    IButton setOnPress(GuiComponentClicked<IButton> onPress);
}
