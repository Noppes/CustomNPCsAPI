package noppes.npcs.api.gui;

import java.util.List;

public interface IComponentsWrapper {

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
     * Add a button which can cycle through values.
     * @param id - Unique ID for identifying this button.
     * @param x - X Position, relative to the Left side of the GUI window.
     * @param y - Y Position, relative to the Top of the GUI window.
     * @param width - Width of this button.
     * @param height - Height of this button.
     */
    IButtonList addButtonList(int id, int x, int y, int width, int height);

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

    List<ICustomGuiComponent> getComponents();

    /**
     * Get a component from this GUI by it's ID.
     * @param id - Component ID to match.
     * @return First ICustomGuiComponent with a matching ID, otherwise null.
     */
    ICustomGuiComponent getComponent(int id);


    void addComponent(ICustomGuiComponent button);

    /**
     * Remove component from this GUI by it's ID.
     * @param id - Component ID to match.
     */
    void removeComponent(int id);

}
