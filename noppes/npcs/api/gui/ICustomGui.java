package noppes.npcs.api.gui;

import noppes.npcs.api.item.IItemStack;

import java.util.List;

public interface ICustomGui {

    int getID();
    int getWidth();
    int getHeight();
    List<ICustomGuiComponent> getComponents();
    List<ICustomGuiComponent> getSlots();

    /** Set what should handle the script events from this GUI.
     *  If not set, defaults to Forge scripts.
     * @param scriptHolder - an NPC/Scripted Block etc. to send this GUI's script events to.
     */
    void setScriptHandler(Object scriptHolder);

    void setSize(int width, int height);

    void setDoesPauseGame(boolean pauseGame);

    void setBackgroundTexture(String resourceLocation);

    ICustomGuiComponent addButton(int id, String label, int x, int y);
    ICustomGuiComponent addButton(int id, String label, int x, int y, int width, int height);

    ICustomGuiComponent addTexturedButton(int id, String label, int x, int y, int width, int height, String texture);
    ICustomGuiComponent addTexturedButton(int id, String label, int x, int y, int width, int height, String texture, int textureX, int textureY);

    ICustomGuiComponent addLabel(int id, String label, int x, int y, int width, int height);
    ICustomGuiComponent addLabel(int id, String label, int x, int y, int width, int height, int color);

    ICustomGuiComponent addTextField(int id, int x, int y, int width, int height);

    ICustomGuiComponent addTexturedRect(String texture, int x, int y, int width, int height);
    ICustomGuiComponent addTexturedRect(String texture, int x, int y, int width, int height, float scale);
    ICustomGuiComponent addTexturedRect(String texture, int x, int y, int width, int height, int textureX, int textureY);
    ICustomGuiComponent addTexturedRect(String texture, int x, int y, int width, int height, int textureX, int textureY, float scale);

    void addItemSlot(int x, int y);
    void addItemSlot(int x, int y, IItemStack stack);

    ICustomGuiComponent addScroll(int id, int x, int y, int width, int height, String[] list);
    ICustomGuiComponent addScroll(int id, int x, int y, int width, int height, String[] list, int defaultSelection);
    ICustomGuiComponent addScroll(int id, int x, int y, int width, int height, String[] list, boolean multiSelect);
    ICustomGuiComponent addScroll(int id, int x, int y, int width, int height, String[] list, int defaultSelection, boolean multiSelect);

    void showPlayerInventory(int x, int y);

}
