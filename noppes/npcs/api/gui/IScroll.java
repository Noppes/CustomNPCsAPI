package noppes.npcs.api.gui;

import noppes.npcs.api.function.gui.GuiComponentAction;

public interface IScroll extends ICustomGuiComponent {

    String[] getList();
    IScroll setList(String[] list);

    IScroll setSorted();

    @Deprecated
    int getDefaultSelection();
    @Deprecated
    IScroll setDefaultSelection(int defaultSelection);

    int[] getSelection();
    IScroll setSelection(int... selection);
    String[] getSelectionList();
    IScroll setSelectionList(String... list);

    boolean isMultiSelect();
    IScroll setMultiSelect(boolean multiSelect);

    IScroll setOnClick(GuiComponentAction<IScroll> onClick);
    IScroll setOnDoubleClick(GuiComponentAction<IScroll> onDoubleClick);

    boolean getHasSearch();
    IScroll setHasSearch(boolean bo);

}
