package noppes.npcs.api.gui;

import noppes.npcs.api.function.EventWrapper;
import noppes.npcs.api.function.gui.GuiComponentAction;
import noppes.npcs.api.function.gui.GuiComponentHold;
import noppes.npcs.api.item.IItemStack;

public interface IButton extends ICustomGuiComponent {

    String getLabel();
    IButton setLabel(String label);
    IButton setLabelOffset(int width, int height);
    int getLabelOffsetX();
    int getLabelOffsetY();
    IButton appendLabel(String label, Object... args);

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

    int getColor();
    IButton setColor(int color);

    IButton setOnPress(String id, GuiComponentAction<IButton> onPress);
    EventWrapper<GuiComponentAction<IButton>> getOnPressEvents();

    IButton setOnHold(String id, GuiComponentHold<IButton> onPress);
    EventWrapper<GuiComponentHold<IButton>> getOnHoldEvents();
}
