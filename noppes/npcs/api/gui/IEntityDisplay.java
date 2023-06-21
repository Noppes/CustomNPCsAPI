package noppes.npcs.api.gui;

import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.IEntity;

public interface IEntityDisplay extends ICustomGuiComponent {

    IEntity getEntity(IWorld world);
    IEntityDisplay setEntity(IEntity entity);

    int getRotation();
    IEntityDisplay setRotation(int rot);

    float getScale();
    IEntityDisplay setScale(float scale);

}
