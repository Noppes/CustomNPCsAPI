package noppes.npcs.api.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.IDamageSource;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.block.IBlock;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IEntity;
import noppes.npcs.api.entity.IEntityLivingBase;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.handler.data.IFaction;
import noppes.npcs.api.item.IItemStack;

public class PlayerEvent extends CustomNPCsEvent {
	public final IPlayer player;

	public PlayerEvent(IPlayer player) {
		this.player = player;
	}

	/**
	 * init
	 */
	public static class InitEvent extends PlayerEvent {
		public InitEvent(IPlayer player) {
			super(player);
		}
	}

	/**
	 * tick
	 */
	public static class UpdateEvent extends PlayerEvent {
		public UpdateEvent(IPlayer player) {
			super(player);
		}
	}

	/**
	 * interact <br>
	 * Will trigger if you have an item and right click into the air Or right
	 * click a block Or right click an entity
	 */
	@Cancelable
	public static class InteractEvent extends PlayerEvent {
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

	/**
	 * attack <br>
	 * Will trigger if you have an item and left click into the air or left
	 * click a block or left click an entity
	 */
	@Cancelable
	public static class AttackEvent extends PlayerEvent {
		/**
		 * 0:air, 1:entity, 2:block
		 */
		public final int type;
		
		public final Object target;

		public AttackEvent(IPlayer player, int type, Object target) {
			super(player);
			this.type = type;
			this.target = target;
		}
	}

	/**
	 * broken
	 */
	@Cancelable
	public static class BreakEvent extends PlayerEvent {
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

	/**
	 * toss
	 */
	@Cancelable
	public static class TossEvent extends PlayerEvent {
		public final IItemStack item;

		public TossEvent(IPlayer player, IItemStack item) {
			super(player);
			this.item = item;
		}
	}

	/**
	 * pickedUp
	 */
	@Cancelable
	public static class PickUpEvent extends PlayerEvent {
		public final IItemStack item;

		public PickUpEvent(IPlayer player, IItemStack item) {
			super(player);
			this.item = item;
		}
	}

	/**
	 * containerOpen
	 */
	public static class ContainerOpen extends PlayerEvent {
		public final IContainer container;

		public ContainerOpen(IPlayer player, IContainer container) {
			super(player);
			this.container = container;
		}
	}

	/**
	 * containerClosed
	 */
	public static class ContainerClosed extends PlayerEvent {
		public final IContainer container;

		public ContainerClosed(IPlayer player, IContainer container) {
			super(player);
			this.container = container;
		}
	}

	/**
	 * damagedEntity
	 */
	@Cancelable
	public static class DamagedEntityEvent extends PlayerEvent {
		public final IDamageSource damageSource;
		
		public final IEntity target;
		public float damage;

		public DamagedEntityEvent(IPlayer player, Entity target, float damage, DamageSource damagesource) {
			super(player);
			this.target = NpcAPI.Instance().getIEntity(target);
			this.damage = damage;
			this.damageSource = NpcAPI.Instance().getIDamageSource(damagesource);
		}
	}

	/**
	 * rangedLaunched
	 */
	@Cancelable
	public static class RangedLaunchedEvent extends PlayerEvent {

		public RangedLaunchedEvent(IPlayer player) {
			super(player);
		}
	}

	/**
	 * died
	 */
	@Cancelable
	public static class DiedEvent extends PlayerEvent {
		public final IDamageSource damageSource;

		public final String type;
		public final IEntity source;

		public DiedEvent(IPlayer player, DamageSource damagesource, Entity entity) {
			super(player);
			this.damageSource = NpcAPI.Instance().getIDamageSource(damagesource);
			type = damagesource.damageType;
			this.source = NpcAPI.Instance().getIEntity(entity);
		}
	}

	/**
	 * kill
	 */
	public static class KilledEntityEvent extends PlayerEvent {
		public final IEntityLivingBase entity;

		public KilledEntityEvent(IPlayer player, EntityLivingBase entity) {
			super(player);
			this.entity = (IEntityLivingBase) NpcAPI.Instance().getIEntity(entity);
		}
	}

	/**
	 * damaged
	 */
	@Cancelable
	public static class DamagedEvent extends PlayerEvent {
		public final IDamageSource damageSource;
		public final IEntity source;
		public float damage;
		public boolean clearTarget = false;

		public DamagedEvent(IPlayer player, Entity source, float damage, DamageSource damagesource) {
			super(player);
			this.source = (IEntity) NpcAPI.Instance().getIEntity(source);
			this.damage = damage;
			this.damageSource = NpcAPI.Instance().getIDamageSource(damagesource);
		}
	}

	/**
	 * timer
	 */
	public static class TimerEvent extends PlayerEvent {
		public final int id;

		public TimerEvent(IPlayer player, int id) {
			super(player);
			this.id = id;
		}
	}

	/**
	 * login
	 */
	public static class LoginEvent extends PlayerEvent {
		public LoginEvent(IPlayer player) {
			super(player);
		}
	}

	/**
	 * logout
	 */
	public static class LogoutEvent extends PlayerEvent {
		public LogoutEvent(IPlayer player) {
			super(player);
		}
	}

	/**
	 * levelUp <br>
	 * Called when a players level changes
	 */
	public static class LevelUpEvent extends PlayerEvent {
		/**
		 * The amount the level of the player changed
		 */
		public final int change;
		
		public LevelUpEvent(IPlayer player, int change) {
			super(player);
			this.change = change;
		}
	}

	/**
	 * keyPressed <br>
	 * Called when a players press and releases a button, Wont be called when a gui or chat is opened or if a button is held for a longer time. <br>
	 * Button has to be held less then 0.5 seconds. <br>
	 * Currently does not support multiple button presses, <br>
	 *   eg: pressing 'a' and then 'd' and then releasing 'a' and then 'd' will no cause the event to trigger
	 */
	public static class KeyPressedEvent extends PlayerEvent {
		/**
		 * Keyboard button pressed, (<a href="https://minecraft.gamepedia.com/Key_codes">key codes</a>
		 */
		public final int key;
		public final boolean isCtrlPressed;
		public final boolean isAltPressed;
		public final boolean isShiftPressed;
		/**
		 * This is the windows or apple key
		 */
		public final boolean isMetaPressed;
		
		public KeyPressedEvent(IPlayer player, int key, boolean isCtrlPressed, boolean isAltPressed, boolean isShiftPressed, boolean isMetaPressed) {
			super(player);
			this.key = key;
			this.isCtrlPressed = isCtrlPressed;
			this.isAltPressed = isAltPressed;
			this.isShiftPressed = isShiftPressed;
			this.isMetaPressed = isMetaPressed;
		}
	}

	/**
	 * chat
	 */
	@Cancelable
	public static class ChatEvent extends PlayerEvent {
		public String message;

		public ChatEvent(IPlayer player, String message) {
			super(player);
			this.message = message;
		}
	}

	/**
	 * factionUpdate <br>
	 * Called when a players faction points change 
	 */
	public static class FactionUpdateEvent extends PlayerEvent {
		public final IFaction faction;
		public int points;
		
		/**
		 * true if it's setting the default points to the player
		 */
		public boolean init;

		public FactionUpdateEvent(IPlayer player, IFaction faction, int points, boolean init) {
			super(player);
			this.faction = faction;
			this.points = points;
			this.init = init;
		}
		
	}
}
