package noppes.npcs.api.gui;

public interface IScroll extends ICustomGuiComponent {

    int getWidth();
    int getHeight();
    IScroll setSize(int width, int height);

    String[] getList();
    IScroll setList(String[] list);

    int getDefaultSelection();
    IScroll setDefaultSelection(int defaultSelection);

    boolean isMultiSelect();
    IScroll setMultiSelect(boolean multiSelect);

}
