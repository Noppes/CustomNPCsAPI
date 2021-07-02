package noppes.npcs.api.event;

import noppes.npcs.api.IPos;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.handler.IRecipeHandler;

public class WorldEvent extends CustomNPCsEvent{
	public final IWorld world;
	public WorldEvent(IWorld world) {
		this.world = world;
	}

	public static class ScriptCommandEvent extends WorldEvent{
		public final String[] arguments;
		public final IPos pos;
		
		public ScriptCommandEvent(IWorld level, IPos pos, String[] arguments) {
			super(level);
			this.arguments = arguments;
			this.pos = pos;
		}
	}
}
