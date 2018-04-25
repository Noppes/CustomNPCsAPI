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

	/**
	 * init
	 */
	public static class InitEvent extends ItemEvent {
		public InitEvent(IItemScripted item) {
			super(item);
		}
	}

	/**
	 * tick <br>
	 * When the item is in an inventory this will be called every 10 ticks (0.5 seconds)
	 */
	public static class UpdateEvent extends ItemEvent {
		public IPlayer player;
		public UpdateEvent(IItemScripted item, IPlayer player) {
			super(item);
			this.player = player;
		}
	}

	/**
	 * spawn
	 */
	@Cancelable
	public static class SpawnEvent extends ItemEvent {
		public IEntityItem entity;
		public SpawnEvent(IItemScripted item, IEntityItem entity) {
			super(item);
			this.entity = entity;
		}
	}

	/**
	 * toss <br>
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
	 * pickedUp <br>
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

	/**
	 * interact <br>
	 * Will trigger if you have an item and right click into the air Or right
	 * click a block Or right click an entity
	 */
	@Cancelable
	public static class InteractEvent extends ItemEvent {
		/**
		 * 0:air, 1:entity, 2:block
		 */
		public final int type;
		public final Object target;
		public IPlayer player;

		public InteractEvent(IItemScripted item, IPlayer player, int type, Object target) {
			super(item);
			this.type = type;
			this.target = target;
			this.player = player;
		}
	}

	/**
	 * attack <br>
	 * Will trigger if you have an item and left click into the air or left
	 * click a block or left click an entity
	 */
	@Cancelable
	public static class AttackEvent extends ItemEvent {
		/**
		 * 0:air, 1:entity, 2:block
		 */
		public final int type;
		
		public final Object target;
		public IPlayer player;

		public AttackEvent(IItemScripted item, IPlayer player, int type, Object target) {
			super(item);
			this.type = type;
			this.target = target;
			this.player = player;
		}
	}

}
