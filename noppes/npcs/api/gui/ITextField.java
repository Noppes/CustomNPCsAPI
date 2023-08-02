package noppes.npcs.api.gui;

import noppes.npcs.api.function.gui.GuiComponentUpdate;

public interface ITextField extends ICustomGuiComponent {

    String getText();
    ITextField setText(String text);

    int getColor();
    ITextField setColor(int color);

    ITextField setOnChange(GuiComponentUpdate<ITextField> onChange);
    ITextField setOnFocusLost(GuiComponentUpdate<ITextField> onChange);

    ITextField setFocused(boolean bo);
    boolean getFocused();

    /**
     * @param type 0:string, 1:int, 2:hex, 3:float
     */
    ITextField setCharacterType(int type);
    /**
     * @return 0:string, 1:int, 2:hex, 3:float
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

    float getFloat();
    ITextField setFloat(float f);

    /**
     * Incase CharacterType is 1 or 2, you can set the min and max value
     */
    ITextField setMinMax(int min, int max);
}
