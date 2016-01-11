package noppes.npcs.api.entity;

import net.minecraft.entity.monster.EntityMob;

public interface IMonster<T extends EntityMob> extends IEntityLiving<T>{

	@Override
	public T getMCEntity();
	
}
