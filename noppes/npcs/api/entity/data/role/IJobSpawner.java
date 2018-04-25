package noppes.npcs.api.entity.data.role;

import noppes.npcs.api.entity.IEntityLivingBase;

public interface IJobSpawner {

	/**
	 * Npc needs to be attacking something or be set to Despawn Spawns On Target Lost: No, otherwise it will despawn right away
	 * @param i The entity going to be spawned (0-5)
	 * @return Returns spawned entity
	 */
	public IEntityLivingBase spawnEntity(int i);

	public void removeAllSpawned();

}
