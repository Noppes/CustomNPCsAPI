package noppes.npcs.api.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.entity.IEntity;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.handler.data.IQuest;
import noppes.npcs.api.item.IItemStack;

/**
 * Called for most Forge events. For the events I use the forges name and make the first letter lowercase. <br>
 * Eg: <br>
 * - EntityEvent.EntityJoinWorldEvent becomes entityEventEntityJoinWorldEvent <br>
 * - PlayerEvent.StartTracking becomes playerEventStartTracking <br>
 * - etc <br>
 * 
 * Note that these events can change anytime and that I have no control over these. Use at own risk
 * 
 */
@Cancelable
public class ForgeEvent extends CustomNPCsEvent {
	public final Event event;
	public ForgeEvent(Event event) {
		this.event = event;
	}

	/**
	 * init <br>
	 * The init event has no forge event 
	 */
	public static class InitEvent extends ForgeEvent {
		public InitEvent() {
			super(null);
		}
	}

	/**
	 * This event is used for every forge event which extends EntityEvent <br>
	 * <a href="http://maven.thiakil.com/forge-1.12-javadoc/net/minecraftforge/event/entity/EntityEvent.html">EventyEvent</a> <br>
	 * <a href="http://maven.thiakil.com/forge-1.12-javadoc/net/minecraftforge/event/entity/living/LivingEvent.html">LivingEvent</a> <br>
	 * <a href="http://maven.thiakil.com/forge-1.12-javadoc/net/minecraftforge/event/entity/player/PlayerEvent.html">PlayerEvent</a>
	 */
	@Cancelable
	public static class EntityEvent extends ForgeEvent{
		public final IEntity entity;
		
		public EntityEvent(net.minecraftforge.event.entity.EntityEvent event, IEntity entity) {
			super(event);
			this.entity = entity;
		}
		
	}

	/**
	 * This event is used for every forge event which extends WorldEvent <br>
	 * <a href="http://maven.thiakil.com/forge-1.12-javadoc/net/minecraftforge/event/world/WorldEvent.html">WorldEvent</a>
	 */
	@Cancelable
	public static class WorldEvent extends ForgeEvent{
		public final IWorld world;
		
		public WorldEvent(net.minecraftforge.event.world.WorldEvent event, IWorld world) {
			super(event);
			this.world = world;
		}
		
	}
}
