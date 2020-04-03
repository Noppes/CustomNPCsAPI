package noppes.npcs.api.gui;

import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.api.item.IItemStack;

import java.util.List;

public interface ICustomGui {

    int getID();
    int getWidth();
    int getHeight();
    List<ICustomGuiComponent> getComponents();
    List<ICustomGuiComponent> getSlots();

    void setScriptHandler(Object scriptHolder);
    Object getScriptHandler();

    void setSize(int width, int height);

    void setDoesPauseGame(boolean pauseGame);
    boolean getDoesPauseGame();

    void setBackgroundTexture(String resourceLocation);
    String getBackgroundTexture();

    void addButton(int id, String label, int x, int y);
    void addButton(int id, String label, int x, int y, int width, int height);

    void addTexturedButton(int id, String label, int x, int y, int width, int height, String texture);
    void addTexturedButton(int id, String label, int x, int y, int width, int height, String texture, int textureX, int textureY);

    void addLabel(int id, String label, int x, int y, int width, int height);
    void addLabel(int id, String label, int x, int y, int width, int height, int color);

    void addTextField(int id, int x, int y, int width, int height);

    void addTexturedRect(String texture, int x, int y, int width, int height);
    void addTexturedRect(String texture, int x, int y, int width, int height, float scale);
    void addTexturedRect(String texture, int x, int y, int width, int height, int textureX, int textureY);
    void addTexturedRect(String texture, int x, int y, int width, int height, int textureX, int textureY, float scale);

    void addItemSlot(int x, int y);
    void addItemSlot(int x, int y, IItemStack stack);

    void addScroll(int id, int x, int y, int width, int height, String[] list);
    void addScroll(int id, int x, int y, int width, int height, String[] list, boolean multiSelect);

    void showPlayerInventory(int x, int y);

    ICustomGui fromNBT(NBTTagCompound nbt);
    NBTTagCompound toNBT();

    boolean getShowPlayerInv();

    int getPlayerInvX();
    int getPlayerInvY();
}
