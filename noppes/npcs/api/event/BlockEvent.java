package noppes.npcs.api.event;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.block.IBlock;
import noppes.npcs.api.entity.IEntity;
import noppes.npcs.api.entity.IPlayer;

public class BlockEvent extends Event {
	public IBlock block;
	public BlockEvent(IBlock block){
		this.block = block;
	}
	
	@Cancelable
	public static class EntityFallenUponEvent extends BlockEvent{
		public final IEntity entity;
		public float distanceFallen;
		public EntityFallenUponEvent(IBlock block, Entity entity, float distance){
			super(block);
			this.distanceFallen = distance;
			this.entity = NpcAPI.Instance().getIEntity(entity);
		}
	}

	@Cancelable
	public static class InteractEvent extends BlockEvent{
		public final IPlayer player;

		public final float hitX, hitY, hitZ;
		
		/**
		 * @see SideType
		 */
		public final int side;
		
		public InteractEvent(IBlock block, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
			super(block);
			this.player = (IPlayer) NpcAPI.Instance().getIEntity(player);

			this.hitX = hitX;
			this.hitY = hitY;
			this.hitZ = hitZ;
			this.side = side;
		}
		
	}

	public static class RedstoneEvent extends BlockEvent{
		public final int prevPower, power;
		public RedstoneEvent(IBlock block, int prevPower, int power) {
			super(block);
			this.power = power;
			this.prevPower = prevPower;
		}
	}
	
	@Cancelable
	public static class DoorToggleEvent extends BlockEvent{
		public DoorToggleEvent(IBlock block) {
			super(block);
		}
	}
	
	public static class BreakEvent extends BlockEvent{
		public BreakEvent(IBlock block) {
			super(block);
		}
	}
	
	@Cancelable
	public static class ExplodedEvent extends BlockEvent{
		public ExplodedEvent(IBlock block) {
			super(block);
		}
	}
	
	public static class RainFillEvent extends BlockEvent{
		public RainFillEvent(IBlock block) {
			super(block);
		}
	}
	
	public static class NeighborChangedEvent extends BlockEvent{
		public NeighborChangedEvent(IBlock block) {
			super(block);
		}
	}
	
	public static class InitEvent extends BlockEvent{
		public InitEvent(IBlock block) {
			super(block);
		}
	}
	
	public static class UpdateEvent extends BlockEvent{
		public UpdateEvent(IBlock block) {
			super(block);
		}
	}
	
	public static class ClickedEvent extends BlockEvent{
		public final IPlayer player;
		public ClickedEvent(IBlock block, EntityPlayer player) {
			super(block);
			this.player = (IPlayer) NpcAPI.Instance().getIEntity(player);
		}
	}
	
	public static class HarvestedEvent extends BlockEvent{
		public final IPlayer player;
		public HarvestedEvent(IBlock block, EntityPlayer player) {
			super(block);
			this.player = (IPlayer) NpcAPI.Instance().getIEntity(player);
		}
	}
	
	public static class CollidedEvent extends BlockEvent{
		public final IEntity entity;
		public CollidedEvent(IBlock block, Entity entity) {
			super(block);
			this.entity = NpcAPI.Instance().getIEntity(entity);
		}
	}
}
