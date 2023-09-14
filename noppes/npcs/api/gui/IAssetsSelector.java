package noppes.npcs.api.gui;

import noppes.npcs.api.function.gui.GuiComponentAction;
import noppes.npcs.api.function.gui.GuiComponentAction;

public interface IAssetsSelector extends ICustomGuiComponent {

    String getSelected();
    IAssetsSelector setSelected(String selected);

    /**
     * Default: textures
     * @return returns root
     */
    String getRoot();
    IAssetsSelector setRoot(String root);

    /**
     * Default: png
     * @return png, ogg, json, or whatever you want to filter
     */
    String getFileType();
    /**
     *
     * @param type png, ogg, json, or whatever you want to filter
     */
    IAssetsSelector setFileType(String type);

    IAssetsSelector setOnChange(GuiComponentAction<IAssetsSelector> onChange);

    /**
     * Called when an asset is double-clicked
     */
    IAssetsSelector setOnPress(GuiComponentAction<IAssetsSelector> onChange);

}
