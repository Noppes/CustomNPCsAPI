package noppes.npcs.api.gui;

import noppes.npcs.api.block.IBlockScripted;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.item.IItemScripted;
import noppes.npcs.api.item.IItemStack;

import java.util.List;

public interface ICustomGui {

    int getID();
    int getWidth();
    int getHeight();
    List<ICustomGuiComponent> getComponents();
    List<IItemSlot> getSlots();

    void setSize(int width, int height);
    void setDoesPauseGame(boolean pauseGame);
    void setBackgroundTexture(String resourceLocation);

    /**
     * Add a regular, Minecraft style button to this GUI. Uses default width and height.
     * @param id - Unique ID for identifying this button.
     * @param label - String to display on this button.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     */
    IButton addButton(int id, String label, int x, int y);

    /**
     * Add a regular, Minecraft style button to this GUI, with a defined width and height.
     * @param id - Unique ID for identifying this button.
     * @param label - String to display on this button.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of this button.
     * @param height - Height of this button.
     */
    IButton addButton(int id, String label, int x, int y, int width, int height);

    /**
     * Add a button with a custom texture to this GUI.
     * Hover Texture is taken from directly beneath the base texture.
     * For examples, look at Vanilla Minecraft button textures.
     * @param id - Unique ID for identifying this button.
     * @param label - String to display on this button.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of this button and texture.
     * @param height - Height of this button and texture.
     * @param texture - Resource Location of the texture to use. (For Example: "minecraft:textures/gui/widgets.png")
     */
    IButton addTexturedButton(int id, String label, int x, int y, int width, int height, String texture);

    /**
     * Add a button with a custom texture to this GUI, with a texture offset.
     * Hover Texture is taken from directly beneath the base texture.
     * For examples, look at Vanilla Minecraft button textures.
     * @param id - Unique ID for identifying this button.
     * @param label - String to display on this button.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of this button and texture.
     * @param height - Height of this button and texture.
     * @param texture - Resource Location of the texture to use. (For Example: "minecraft:textures/gui/widgets.png")
     * @param textureX - X offset of the desired texture within the defined texture file. Should refer to the Top-Left of the desired texture.
     * @param textureY - Y offset of the desired texture within the defined texture file. Should refer to the Top-Left of the desired texture.
     */
    IButton addTexturedButton(int id, String label, int x, int y, int width, int height, String texture, int textureX, int textureY);

    /**
     * Add a Label to the GUI.
     * @param id - Unique ID for identifying this label.
     * @param label - String to display.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of this label. (Does Not Change the font size.)
     * @param height - Height of this label. (Does Not Change the font size.)
     */
    ILabel addLabel(int id, String label, int x, int y, int width, int height);

    /**
     * Add a Label to the GUI.
     * @param id - Unique ID for identifying this label.
     * @param label - String to display.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of this label. (Does Not Change the font size.)
     * @param height - Height of this label. (Does Not Change the font size.)
     * @param color - Color to be applied;
     */
    ILabel addLabel(int id, String label, int x, int y, int width, int height, int color);

    /**
     * Add a Text Field input to the GUI, that the player can type into.
     * @param id - Unique ID for identifying this label.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of this Text Field.
     * @param height - Height of this Text Field.
     */
    ITextField addTextField(int id, int x, int y, int width, int height);

    /**
     * Add a Text Field input to the GUI, that the player can type into.
     * @param id - Unique ID for identifying this label.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of this Text Field.
     * @param height - Height of this Text Field.
     */
    ITextArea addTextArea(int id, int x, int y, int width, int height);

    /**
     * Add a texture to be drawn within the GUI.
     * @param id - Unique ID for identifying this texture.
     * @param texture - Resource Location of the texture to use. (For Example: "minecraft:textures/gui/widgets.png")
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of the texture.
     * @param height - Height of the texture.
     */
    ITexturedRect addTexturedRect(int id, String texture, int x, int y, int width, int height);

    /**
     * Add a texture to be drawn within the GUI.
     * @param id - Unique ID for identifying this texture.
     * @param texture - Resource Location of the texture to use. (For Example: "minecraft:textures/gui/widgets.png")
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of the texture.
     * @param height - Height of the texture.
     * @param textureX - X offset of the desired texture within the defined texture file. Should refer to the Top-Left of the desired texture.
     * @param textureY - Y offset of the desired texture within the defined texture file. Should refer to the Top-Left of the desired texture.
     */
    ITexturedRect addTexturedRect(int id, String texture, int x, int y, int width, int height, int textureX, int textureY);

    /**
     * Add a Scroll List to the GUI, for the player to select from.
     * @param id - Unique ID for identifying this scroll.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of the Scroll List.
     * @param height - Height of the Scroll List.
     * @param list - List of String options for the player to choose from.
     */
    IScroll addScroll(int id, int x, int y, int width, int height, String[] list);

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

    /**
     * Add a display of the Player's Inventory to the GUI.
     * A Player's inventory is around 162 Wide, and 58 Tall. Take this into consideration when placing this.
     * @param x - X Position of the Top-Left corner, relative to the Left side of the GUI window.
     * @param y - Y Position of the Top-Left corner, relative to the Top of the GUI window.
     */
    void showPlayerInventory(int x, int y);

    /**
     * Get a component from this GUI by it's ID.
     * @param id - Component ID to match.
     * @return First ICustomGuiComponent with a matching ID, otherwise null.
     */
    ICustomGuiComponent getComponent(int id);

    /**
     * Remove component from this GUI by it's ID.
     * @param id - Component ID to match.
     */
    void removeComponent(int id);

    /**
     * Update a given component in this GUI, if a component with a matching ID exists.
     * @param component
     */
    void updateComponent(ICustomGuiComponent component);

    /**
     * Update the given player's CustomGUI with this one.
     * @param player - Player to send this CustomGUI to.
     */
    void update(IPlayer player);

}
