package noppes.npcs.api.gui;

import noppes.npcs.api.function.EventWrapper;
import noppes.npcs.api.function.gui.GuiComponentAction;
import noppes.npcs.api.function.gui.GuiComponentState;

import java.util.UUID;

public interface ICustomGuiComponent {

    int getID();
    ICustomGuiComponent setID(int id);

    UUID getUniqueID();

    int getPosX();
    int getPosY();
    ICustomGuiComponent setPos(int x, int y);

    int getWidth();
    int getHeight();
    ICustomGuiComponent setSize(int width, int height);

    default boolean isInside(double x, double y){
        return x >= getPosX() && x < (getPosX() + getWidth()) && y >= getPosY() && y < (getPosY() + getHeight());
    }

    boolean hasHoverText();
    String[] getHoverText();
    ICustomGuiComponent setHoverText(String text);
    ICustomGuiComponent setHoverText(String[] text);

    boolean getEnabled();
    ICustomGuiComponent setEnabled(boolean bo);
    ICustomGuiComponent setEnabledCondition(GuiComponentState condition);

    boolean getVisible();
    ICustomGuiComponent setVisible(boolean bo);
    ICustomGuiComponent setVisibleCondition(GuiComponentState condition);

    boolean getHovered();
    ICustomGuiComponent setHovered(boolean bo);

    ICustomGuiComponent setOnHover(String id, GuiComponentAction<ICustomGuiComponent> onHover);
    EventWrapper<GuiComponentAction<ICustomGuiComponent>> getOnHoverEvents();

    ICustomGuiComponent setOnHoverExit(String id, GuiComponentAction<ICustomGuiComponent> onHoverExit);
    EventWrapper<GuiComponentAction<ICustomGuiComponent>> getOnHoverExitEvents();

    int getType();
}
