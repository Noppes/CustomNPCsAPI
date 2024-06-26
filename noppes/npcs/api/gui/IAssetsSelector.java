package noppes.npcs.api.gui;

import noppes.npcs.api.function.EventWrapper;
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

    IAssetsSelector setOnChange(String id, GuiComponentAction<IAssetsSelector> onChange);
    EventWrapper<GuiComponentAction<IAssetsSelector>> getOnChangeEvents();

    /**
     * Called when an asset is double-clicked
     */
    IAssetsSelector setOnPress(String id, GuiComponentAction<IAssetsSelector> onChange);
    EventWrapper<GuiComponentAction<IAssetsSelector>> getOnPressEvents();

}
