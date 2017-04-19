package noppes.npcs.api.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.entity.data.IPlayerMail;
import noppes.npcs.api.entity.data.role.IRoleTransporter.ITransportLocation;
import noppes.npcs.api.item.IItemStack;

public class RoleEvent extends CustomNPCsEvent {
	public final ICustomNpc npc;
	public final IPlayer player;
	
	public RoleEvent(EntityPlayer player, ICustomNpc npc){
		this.npc = npc;
		this.player = (IPlayer) NpcAPI.Instance().getIEntity(player);
	}

	@Cancelable
	public static class TransporterUseEvent extends RoleEvent{
		public final ITransportLocation location;
		public TransporterUseEvent(EntityPlayer player, ICustomNpc npc, ITransportLocation location) {
			super(player, npc);
			this.location = location;
		}
	}
	
	@Cancelable
	public static class TransporterUnlockedEvent extends RoleEvent{
		
		public TransporterUnlockedEvent(EntityPlayer player, ICustomNpc npc) {
			super(player, npc);
		}
	}

	@Cancelable
	public static class MailmanEvent extends RoleEvent{
		public final IPlayerMail mail;
		
		public MailmanEvent(EntityPlayer player, ICustomNpc npc, IPlayerMail mail) {
			super(player, npc);
			this.mail = mail;
		}
	}

	@Cancelable
	public static class FollowerHireEvent extends RoleEvent{
		public int days;
		
		public FollowerHireEvent(EntityPlayer player, ICustomNpc npc, int days) {
			super(player, npc);
			this.days = days;
		}
	}

	public static class FollowerFinishedEvent extends RoleEvent{
		
		public FollowerFinishedEvent(EntityPlayer player, ICustomNpc npc) {
			super(player, npc);
		}		
	}
	
	@Cancelable
	public static class TraderEvent extends RoleEvent{
		public IItemStack sold;
		public IItemStack currency1;
		public IItemStack currency2;
		
		public TraderEvent(EntityPlayer player, ICustomNpc npc, ItemStack sold, ItemStack currency1, ItemStack currency2) {
			super(player, npc);
			this.currency1 = currency1.isEmpty()? null : NpcAPI.Instance().getIItemStack(currency1.copy());
			this.currency2 = currency2.isEmpty()? null : NpcAPI.Instance().getIItemStack(currency2.copy());
			this.sold = NpcAPI.Instance().getIItemStack(sold.copy());
		}
	}
	
	public static class TradeFailedEvent extends RoleEvent{
		public final IItemStack sold;
		public final IItemStack currency1;
		public final IItemStack currency2;
		public IItemStack receiving;
		
		public TradeFailedEvent(EntityPlayer player, ICustomNpc npc, ItemStack sold, ItemStack currency1, ItemStack currency2) {
			super(player, npc);
			this.currency1 = currency1.isEmpty()? null : NpcAPI.Instance().getIItemStack(currency1.copy());
			this.currency2 = currency2.isEmpty()? null : NpcAPI.Instance().getIItemStack(currency2.copy());
			this.sold = NpcAPI.Instance().getIItemStack(sold.copy());
		}
	}

	public static class BankUnlockedEvent extends RoleEvent{
		public final int slot;
		
		public BankUnlockedEvent(EntityPlayer player, ICustomNpc npc, int slot) {
			super(player, npc);
			this.slot = slot;
		}		
	}

	public static class BankUpgradedEvent extends RoleEvent{
		public final int slot;
		
		public BankUpgradedEvent(EntityPlayer player, ICustomNpc npc, int slot) {
			super(player, npc);
			this.slot = slot;
		}		
	}
}
