package noppes.npcs.api.gui;

import noppes.npcs.api.function.gui.GuiTextFieldUpdate;

public interface ITextField extends ICustomGuiComponent {

    String getText();
    ITextField setText(String text);

    int getColor();
    ITextField setColor(int color);

    ITextField setEnabled(boolean bo);
    boolean getEnabled();

    ITextField setOnChange(GuiTextFieldUpdate onChange);
    ITextField setOnFocusLost(GuiTextFieldUpdate onChange);

    ITextField setFocused(boolean bo);
    boolean getFocused();

    /**
     * @param type 0:string, 1:int, 2:hex
     */
    ITextField setCharacterType(int type);
    /**
     * @return 0:string, 1:int, 2:hex
     */
    int getCharacterType();

    /**
     * @return Incase CharacterType is 1 or 2 it will convert text to an integer
     */
    int getInteger();
    /**
     * @param i Incase CharacterType is 1 or 2 set the text as the integer, if its CharacterType 2 it will convert to Hex
     */
    ITextField setInteger(int i);

    /**
     * Incase CharacterType is 1 or 2, you can set the min and max value
     */
    ITextField setMinMax(int min, int max);
}
