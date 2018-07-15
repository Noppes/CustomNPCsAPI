package noppes.npcs.api.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.entity.IEntity;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.handler.data.IQuest;
import noppes.npcs.api.item.IItemStack;

public class WorldEvent extends CustomNPCsEvent {
	public final IWorld world;
	public WorldEvent(IWorld world) {
		this.world = world;
	}

	/**
	 * spawn
	 */
	@Cancelable
	public static class EntitySpawnEvent extends WorldEvent{
		public final IEntity entity;
		
		public EntitySpawnEvent(IWorld world, IEntity entity) {
			super(world);
			this.entity = entity;
		}
		
	}
}
