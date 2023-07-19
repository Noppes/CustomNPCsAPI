package noppes.npcs.api.gui;

import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.IEntity;

public interface IEntityDisplay extends ICustomGuiComponent {

    IEntity getEntity();
    IEntityDisplay setEntity(IEntity entity);

    int getRotation();
    IEntityDisplay setRotation(int rot);

    float getScale();
    IEntityDisplay setScale(float scale);

    boolean getBackground();
    IEntityDisplay setBackground(boolean bo);

}
