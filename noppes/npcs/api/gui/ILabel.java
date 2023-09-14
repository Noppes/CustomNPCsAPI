package noppes.npcs.api.gui;

public interface ILabel extends ICustomGuiComponent {

    String getText();
    ILabel setText(String label);
    ILabel append(String label, Object... args);

    int getColor();
    ILabel setColor(int color);

    float getScale();
    ILabel setScale(float scale);

    @Deprecated
    boolean getCentered();
    @Deprecated
    ILabel setCentered(boolean bo);

    /**
     * Where to align the text
     * @return 0: left, 1: center, 2: right
     */
    int getAlignment();

    /**
     * Where to align the text
     * @param type 0: left, 1: center, 2: right
     */
    ILabel setAlignment(int type);

}
