package noppes.npcs.api.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.eventhandler.Cancelable;
import net.minecraftforge.fml.common.eventhandler.Event;
import noppes.npcs.api.IQuest;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.entity.IPlayer;

public class QuestEvent extends Event {
	public final IQuest quest;
	public final IPlayer player;
	public QuestEvent(EntityPlayer player, IQuest quest) {
		this.quest = quest;
		this.player = (IPlayer) NpcAPI.Instance().getIEntity(player);
	}

	@Cancelable
	public static class QuestStartEvent extends QuestEvent{

		public QuestStartEvent(EntityPlayer player, IQuest quest) {
			super(player, quest);
		}
		
	}

	public static class QuestCompletedEvent extends QuestEvent{
		
		public QuestCompletedEvent(EntityPlayer player, IQuest quest) {
			super(player, quest);
		}
		
	}

	public static class QuestTurnedInEvent extends QuestEvent{

		public QuestTurnedInEvent(EntityPlayer player, IQuest quest) {
			super(player, quest);
		}
		
	}
}
