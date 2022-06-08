package noppes.npcs.api.event;

import noppes.npcs.api.IPos;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.IEntity;

public class WorldEvent extends CustomNPCsEvent{
	public final IWorld world;
	public WorldEvent(IWorld world) {
		this.world = world;
	}

	public static class ScriptTriggerEvent extends WorldEvent{
		public final Object[] arguments;
		/**
		 * If pos is a Script Block or Door it will call their scripts
		 */
		public final IPos pos;
		/**
		 * Can be null, if player it will call the player scripts too, if npc it will call the npc scripts
		 */
		public final IEntity entity;

		public final int id;
		
		public ScriptTriggerEvent(int id, IWorld level, IPos pos, IEntity entity, Object[] arguments) {
			super(level);
			this.id = id;
			this.arguments = arguments;
			this.pos = pos;
			this.entity = entity;
		}
	}
}
