package noppes.npcs.api.event;

import noppes.npcs.api.INbt;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.item.IItemStack;

public class CustomGuiEvent extends CustomNPCsEvent {

    public IPlayer player;
    public INbt[] data;
    public int guiId;

    public CustomGuiEvent(IPlayer player, int guiId) {
        this.player = player;
        this.guiId = guiId;
    }

    public CustomGuiEvent(IPlayer player, INbt[] data, int guiId) {
        this.player = player;
        this.data = data;
        this.guiId = guiId;
    }

    public static class CloseEvent extends CustomGuiEvent {

        public CloseEvent(IPlayer player, INbt[] data, int guiId) {
            super(player, data, guiId);
        }

    }

    public static class ButtonEvent extends CustomGuiEvent {
        public int buttonId;

        public ButtonEvent(IPlayer player, INbt[] data, int guiId, int buttonId) {
            super(player, data, guiId);
            this.buttonId = buttonId;
        }

    }

    public static class SlotEvent extends CustomGuiEvent {
        public int slotId;
        public IItemStack stack;

        public SlotEvent(IPlayer player, int guiId, int slotId, IItemStack stack) {
            super(player,guiId);
            this.slotId = slotId;
            this.stack = stack;
        }

    }

    public static class ScrollEvent extends CustomGuiEvent {
        public int scrollId;
        public String[] selection;
        public boolean doubleClick;

        public ScrollEvent(IPlayer player, int guiId, int scrollId, String[] selection, boolean doubleClick) {
            super(player,guiId);
            this.scrollId = scrollId;
            this.selection = selection;
            this.doubleClick = doubleClick;
        }

    }

}
