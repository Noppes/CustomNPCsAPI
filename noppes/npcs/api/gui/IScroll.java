package noppes.npcs.api.gui;

import noppes.npcs.api.function.gui.GuiComponentClicked;

public interface IScroll extends ICustomGuiComponent {

    String[] getList();
    IScroll setList(String[] list);

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

    IScroll setOnClick(GuiComponentClicked<IScroll> onClick);
    IScroll setOnDoubleClick(GuiComponentClicked<IScroll> onDoubleClick);

    boolean getHasSearch();
    IScroll setHasSearch(boolean bo);

}
