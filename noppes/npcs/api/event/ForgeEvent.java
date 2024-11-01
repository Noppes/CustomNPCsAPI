package noppes.npcs.api.event;

import net.minecraftforge.eventbus.api.Cancelable;
import net.minecraftforge.eventbus.api.Event;
import noppes.npcs.api.IWorld;
import noppes.npcs.api.entity.IEntity;

/**
 * Called for most Forge events. For the events I use the forges name and make the first letter lowercase. <br>
 * Eg: <br>
 * - EntityEvent.EntityJoinLevelEvent becomes entityEventEntityJoinLevelEvent <br>
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

	@Override
	public boolean isCancelable() {
		return event.isCancelable();
	}
	@Override
	public boolean isCanceled() {
		return event.isCanceled();
	}
	@Override
	public void setCanceled(boolean cancel) {
		event.setCanceled(cancel);
	}

	/**
	 * init <br>
	 * The init event has no forge event 
	 */
	public static class InitEvent extends ForgeEvent {
		public InitEvent() {
			super(new Event());
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
	 * This event is used for every forge event which extends LevelEvent <br>
	 * <a href="http://maven.thiakil.com/forge-1.12-javadoc/net/minecraftforge/event/world/LevelEvent.html">LevelEvent</a>
	 */
	@Cancelable
	public static class LevelEvent extends ForgeEvent{
		public final IWorld world;
		
		public LevelEvent(net.minecraftforge.event.level.LevelEvent event, IWorld world) {
			super(event);
			this.world = world;
		}
		
	}
}
