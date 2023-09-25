package noppes.npcs.api.gui;

import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.item.IItemStack;

import java.util.List;

public interface ICustomGui extends IComponentsWrapper {

    int getID();
    int getWidth();
    int getHeight();

    void setSize(int width, int height);
    void setDoesPauseGame(boolean pauseGame);
    void setBackgroundTexture(String resourceLocation);
    /**
     * Update the player's CustomGUI with this one.
     */
    void update();

    /**
     *
     * @return Returns the item the player is currently holding in their cursor
     */
    IItemStack getCarriedItem();
    void setCarriedItem(IItemStack stack);

    /**
     * Updates a single component of a gui, instead of the whole gui
     */
    void update(ICustomGuiComponent component);

    IComponentsScrollableWrapper getScrollingPanel();

    void openSubGui(ICustomGui gui);

    ICustomGui getSubGui();

    boolean hasSubGui();

    boolean isSubGui();

    ICustomGui closeSubGui();

    /**
     * If this is a subgui it closes the subgui
     */
    void close();

    ICustomGui getParentGui();
    ICustomGui getRootGui();
    ICustomGui getActiveGui();

    IPlayer getPlayer();
}
