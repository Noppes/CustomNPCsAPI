package noppes.npcs.api.gui;

import noppes.npcs.api.function.EventWrapper;
import noppes.npcs.api.function.gui.GuiScrollAction;

public interface IScroll extends ICustomGuiComponent {

    String[] getList();
    IScroll setList(String[] list);

    ScrollItem[] getItems();
    IScroll setItems(ScrollItem[] items);
    ScrollItem[] getSelected();

    IScroll setSorted();

    @Deprecated
    int getDefaultSelection();
    @Deprecated
    IScroll setDefaultSelection(int defaultSelection);

    int[] getSelection();
    IScroll setSelection(int... selection);
    String[] getSelectionList();
    IScroll setSelectionList(String... list);
    boolean hasSelection();

    boolean isMultiSelect();
    IScroll setMultiSelect(boolean multiSelect);

    IScroll setOnClick(String id, GuiScrollAction<IScroll> onClick);
    EventWrapper<GuiScrollAction<IScroll>> getOnClickEvents();
    IScroll setOnDoubleClick(String id, GuiScrollAction<IScroll> onDoubleClick);
    EventWrapper<GuiScrollAction<IScroll>> getOnDoubleClickEvents();

    boolean getHasSearch();
    IScroll setHasSearch(boolean bo);
}
