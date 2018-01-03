package noppes.npcs.api.event;

import net.minecraftforge.fml.common.eventhandler.Cancelable;
import noppes.npcs.api.entity.IEntityItem;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.item.IItemScripted;

public class ItemEvent extends CustomNPCsEvent {
	public IItemScripted item;

	public ItemEvent(IItemScripted item) {
		this.item = item;
	}

	public static class InitEvent extends ItemEvent {
		public InitEvent(IItemScripted item) {
			super(item);
		}
	}

	/**
	 * When the item is in an inventory this will be called every 10 ticks (0.5 seconds)
	 */
	public static class UpdateEvent extends ItemEvent {
		public IPlayer player;
		public UpdateEvent(IItemScripted item, IPlayer player) {
			super(item);
			this.player = player;
		}
	}

	@Cancelable
	public static class SpawnEvent extends ItemEvent {
		public IEntityItem entity;
		public SpawnEvent(IItemScripted item, IEntityItem entity) {
			super(item);
			this.entity = entity;
		}
	}

	/**
	 * When Cancelled it prevents the item from spawning in the world, the item still disappears from the inventory
	 */
	@Cancelable
	public static class TossedEvent extends ItemEvent {
		public IEntityItem entity;
		public IPlayer player;
		public TossedEvent(IItemScripted item, IPlayer player, IEntityItem entity) {
			super(item);
			this.entity = entity;
			this.player = player;
		}
	}

	/**
	 * When Cancelled it prevents the item from spawning in the world, the item still disappears from the inventory
	 */
	public static class PickedUpEvent extends ItemEvent {
		public IEntityItem entity;
		public IPlayer player;
		public PickedUpEvent(IItemScripted item, IPlayer player, IEntityItem entity) {
			super(item);
			this.entity = entity;
			this.player = player;
		}
	}

}
