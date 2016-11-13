package noppes.npcs.api.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.block.IBlock;
import noppes.npcs.api.entity.IEntity;
import noppes.npcs.api.entity.IEntityLivingBase;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.item.IItemStack;

public class PlayerEvent extends Event{
	public final IPlayer player;
	public PlayerEvent(IPlayer player) {
		this.player = player;
	}
	
	public static class InitEvent extends PlayerEvent{
		public InitEvent(IPlayer player) {
			super(player);
		}
	}
	
	public static class UpdateEvent extends PlayerEvent{
		public UpdateEvent(IPlayer player) {
			super(player);
		}
	}
	
	@Cancelable
	public static class InteractEvent extends PlayerEvent{
		/**
		 * 0:air, 1:entity, 2:block
		 */
		public final int type;
		public final Object target;
		
		
		public InteractEvent(IPlayer player, int type, Object target) {
			super(player);
			this.type = type;
			this.target = target;
		}
	}

	@Cancelable
	public static class BreakEvent extends PlayerEvent{
		public final IBlock block;
		/**
		 * Experience that drops if the block is broken
		 */
		public int exp;
		public BreakEvent(IPlayer player, IBlock block, int exp) {
			super(player);
			this.block = block;
			this.exp = exp;
		}
	}

	@Cancelable
	public static class TossEvent extends PlayerEvent{
		public final IItemStack item;
		public TossEvent(IPlayer player, IItemStack item) {
			super(player);
			this.item = item;
		}
	}

	public static class ContainerOpen extends PlayerEvent{
		public final IContainer container;
		public ContainerOpen(IPlayer player, IContainer container) {
			super(player);
			this.container = container;
		}
	}

	public static class ContainerClosed extends PlayerEvent{
		public final IContainer container;
		public ContainerClosed(IPlayer player, IContainer container) {
			super(player);
			this.container = container;
		}
	}

//	public static class DiedEvent extends PlayerEvent{
//		public final DamageSource mcDamageSource;
//		
//		public final String type;
//		public final IEntity source;
//		public DiedEvent(IPlayer player, DamageSource damagesource, Entity entity) {
//			super(player);
//			this.mcDamageSource = damagesource;
//			type = damagesource.damageType;
//			this.source = NpcAPI.Instance().getIEntity(entity);
//		}
//	}
//	
//	public static class KilledEntityEvent extends PlayerEvent{
//		public final IEntityLivingBase entity;
//		public KilledEntityEvent(IPlayer player, EntityLivingBase entity) {
//			super(player);
//			this.entity = (IEntityLivingBase) NpcAPI.Instance().getIEntity(entity);
//		}
//	}
//
//	@Cancelable
//	public static class DamagedEvent extends PlayerEvent{
//		public final IEntityLivingBase source;
//		public final DamageSource mcDamageSource;
//		public float damage;
//		public boolean clearTarget = false;
//
//		public DamagedEvent(IPlayer player, EntityLivingBase source, float damage, DamageSource mcDamageSource) {
//			super(player);
//			this.source = (IEntityLivingBase) NpcAPI.Instance().getIEntity(source);
//			this.damage = damage;
//			this.mcDamageSource = mcDamageSource;
//		}
//	}
//
//
//	public static class TimerEvent extends PlayerEvent{
//		public final int id;
//		
//		public TimerEvent(IPlayer player, int id) {
//			super(player);
//			this.id = id;
//		}
//	}
}
