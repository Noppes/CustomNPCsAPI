package noppes.npcs.api.gui;

import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.item.IItemStack;

import java.util.List;

public interface ICustomGui extends IComponentsWrapper {

    int getID();
    int getWidth();
    int getHeight();
    List<IItemSlot> getSlots();
    List<IItemSlot> getPlayerSlots();

    void setSize(int width, int height);
    void setDoesPauseGame(boolean pauseGame);
    void setBackgroundTexture(String resourceLocation);

    /**
     * Add an Item Slot to the GUI.
     * CAUTION: Handling Item Storage can be complicated. Once the GUI closes, any items in it will be lost unless you handle storing/saving this information yourself.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     */
    IItemSlot addItemSlot(int x, int y);

    /**
     * Add an Item Slot to the GUI with an IItemStack already in it.
     * CAUTION: Handling Item Storage can be complicated. Once the GUI closes, any items in it will be lost unless you handle storing/saving this information yourself.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param stack - IItemStack to be in this slot upon opening the GUI.
     */
    IItemSlot addItemSlot(int x, int y, IItemStack stack);

    @Deprecated
    void showPlayerInventory(int x, int y);

    /**
     * Add a display of the Player's Inventory to the GUI.
     * A Player's inventory is around 162 Wide, and 58 Tall. Take this into consideration when placing this.
     * @param x - X Position of the Top-Left corner, relative to the Left side of the GUI window.
     * @param y - Y Position of the Top-Left corner, relative to the Top of the GUI window.
     * @param full - Show the full inventory or just the hotbar
     */
    void showPlayerInventory(int x, int y, boolean full);

    /**
     * Update the player's CustomGUI with this one.
     */
    void update();

    IComponentsScrollableWrapper getScrollingPanel();

    void openSubGui(ICustomGui gui);

    ICustomGui getSubGui();

    boolean hasSubGui();

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
