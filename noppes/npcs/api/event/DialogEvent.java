package noppes.npcs.api.event;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.eventbus.api.Cancelable;
import noppes.npcs.api.NpcAPI;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.handler.data.IDialog;
import noppes.npcs.api.handler.data.IDialogOption;

public class DialogEvent extends NpcEvent {
	public final IDialog dialog;
	public final IPlayer player;
	
	public DialogEvent(ICustomNpc npc, PlayerEntity player, IDialog dialog) {
		super(npc);
		this.dialog = dialog;
		this.player = (IPlayer) NpcAPI.Instance().getIEntity(player);
	}

	/**
	 * dialog
	 */
	@Cancelable
    public static class OpenEvent extends DialogEvent {
		public OpenEvent(ICustomNpc npc, PlayerEntity player, IDialog dialog) {
			super(npc, player, dialog);
		}
    	
    }

	/**
	 * dialogClose
	 */
    public static class CloseEvent extends DialogEvent {
		public CloseEvent(ICustomNpc npc, PlayerEntity player, IDialog dialog) {
			super(npc, player, dialog);
		}
    	
    }

	/**
	 * dialogOption
	 */
	@Cancelable
    public static class OptionEvent extends DialogEvent {
    	public final IDialogOption option;
		public OptionEvent(ICustomNpc npc, PlayerEntity player, IDialog dialog, IDialogOption option) {
			super(npc, player, dialog);
			this.option = option;
		}
    	
    }
}
