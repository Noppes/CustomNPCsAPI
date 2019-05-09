package noppes.npcs.api.event;

import net.minecraftforge.fml.common.eventhandler.Cancelable;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.item.IItemStack;

public class CustomContainerEvent extends CustomNPCsEvent {
	public final IContainer container;
	public final IPlayer player;
	public CustomContainerEvent(IPlayer player, IContainer container) {
		this.container = container;
		this.player = player;
	}

	public static class CloseEvent extends CustomContainerEvent{
		
		public CloseEvent(IPlayer player, IContainer container) {
			super(player, container);
		}
		
	}

	public static class SlotClickedEvent extends CustomContainerEvent{
		public IItemStack slotItem;
		public IItemStack heldItem;
		public final int slot;
		
		public SlotClickedEvent(IPlayer player, IContainer container, int slotId, IItemStack slotItem, IItemStack heldItem) {
			super(player, container);
			this.slotItem = slotItem;
			this.heldItem = heldItem;
			this.slot = slotId;
		}
		
	}
}
