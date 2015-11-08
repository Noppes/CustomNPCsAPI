package noppes.npcs.api.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IEntity;
import noppes.npcs.api.entity.IEntityLivingBase;

public class NpcEvent extends Event{
	public final ICustomNpc npc;
	public NpcEvent(ICustomNpc npc) {
		this.npc = npc;
	}
	
	public static class InitEvent extends NpcEvent{
		public InitEvent(ICustomNpc npc) {
			super(npc);
		}
	}
	
	public static class UpdateEvent extends NpcEvent{
		public UpdateEvent(ICustomNpc npc) {
			super(npc);
		}
	}

	@Cancelable
	public static class TargetEvent extends NpcEvent{
		public IEntityLivingBase entity;
		public TargetEvent(ICustomNpc npc, EntityLivingBase entity) {
			super(npc);
			this.entity = (IEntityLivingBase) NpcAPI.Instance().getIEntity(entity);
		}
	}

	@Cancelable
	public static class TargetLostEvent extends NpcEvent{
		/**
		 * The previous target
		 */
		public final IEntityLivingBase entity;
		public TargetLostEvent(ICustomNpc npc, EntityLivingBase entity) {
			super(npc);
			this.entity = (IEntityLivingBase) NpcAPI.Instance().getIEntity(entity);
		}
	}

	@Cancelable
	public static class InteractEvent extends NpcEvent{
		public final EntityPlayer player;
		public InteractEvent(ICustomNpc npc, EntityPlayer player) {
			super(npc);
			this.player = player;
		}
	}

	public static class DiedEvent extends NpcEvent{
		public final DamageSource mcDamageSource;
		
		public final String type;
		public final IEntity source;
		public DiedEvent(ICustomNpc npc, DamageSource damagesource, Entity entity) {
			super(npc);
			this.mcDamageSource = damagesource;
			type = damagesource.damageType;
			this.source = NpcAPI.Instance().getIEntity(entity);
		}
	}
	
	public static class KilledEntityEvent extends NpcEvent{
		public final IEntityLivingBase entity;
		public KilledEntityEvent(ICustomNpc npc, EntityLivingBase entity) {
			super(npc);
			this.entity = (IEntityLivingBase) NpcAPI.Instance().getIEntity(entity);
		}
	}

	@Cancelable
	public static class MeleeAttackEvent extends NpcEvent{
		public final IEntityLivingBase target;
		public float damage;

		public MeleeAttackEvent(ICustomNpc npc, EntityLivingBase target, float damage) {
			super(npc);
			this.target = (IEntityLivingBase) NpcAPI.Instance().getIEntity(target);
			this.damage = damage;
		}
	}

	@Cancelable
	public static class RangedLaunchedEvent extends NpcEvent{
		public final IEntityLivingBase target;
		public float damage;

		public RangedLaunchedEvent(ICustomNpc npc, EntityLivingBase target, float damage) {
			super(npc);
			this.target = (IEntityLivingBase) NpcAPI.Instance().getIEntity(target);
			this.damage = damage;
		}
	}

	@Cancelable
	public static class DamagedEvent extends NpcEvent{
		public final IEntityLivingBase source;
		public final DamageSource mcDamageSource;
		public float damage;
		public boolean clearTarget = false;

		public DamagedEvent(ICustomNpc npc, EntityLivingBase source, float damage, DamageSource mcDamageSource) {
			super(npc);
			this.source = (IEntityLivingBase) NpcAPI.Instance().getIEntity(source);
			this.damage = damage;
			this.mcDamageSource = mcDamageSource;
		}
	}

	public static class CollideEvent extends NpcEvent{
		public final IEntity entity;

		public CollideEvent(ICustomNpc npc, Entity entity) {
			super(npc);
			this.entity = (IEntity) NpcAPI.Instance().getIEntity(entity);
		}
	}
}
