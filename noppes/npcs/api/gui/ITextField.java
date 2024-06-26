package noppes.npcs.api.gui;

import noppes.npcs.api.function.EventWrapper;
import noppes.npcs.api.function.gui.GuiComponentAction;

public interface ITextField extends ICustomGuiComponent {

    String getText();
    ITextField setText(String text);

    int getColor();
    ITextField setColor(int color);

    ITextField setOnChange(String id, GuiComponentAction<ITextField> onChange);
    EventWrapper<GuiComponentAction<ITextField>> getOnChangeEvents();
    ITextField setOnFocusLost(String id, GuiComponentAction<ITextField> onChange);
    EventWrapper<GuiComponentAction<ITextField>> getOnFocusLostEvents();

    ITextField setFocused(boolean bo);
    boolean getFocused();

    ITextField setHideBackground(boolean bo);
    boolean getHideBackground();

    /**
     * @param type 0:string, 1:int, 2:hex, 3:float, 4:long
     */
    ITextField setCharacterType(int type);
    /**
     * @return 0:string, 1:int, 2:hex, 3:float, 4:long
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

    long getLong();
    ITextField setLong(long l);

    /**
     * Incase CharacterType is 1 or 2, you can set the min and max value
     */
    ITextField setMinMax(Number min, Number max);
}
