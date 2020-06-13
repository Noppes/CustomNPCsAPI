package noppes.npcs.api.event;

import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.item.IItemStack;

public class CustomGuiEvent extends CustomNPCsEvent {

    public IPlayer player;
    public ICustomGui gui;

    public CustomGuiEvent(IPlayer player, ICustomGui gui) {
        this.player = player;
        this.gui = gui;
    }

    public static class CloseEvent extends CustomGuiEvent {

        public CloseEvent(IPlayer player, ICustomGui gui) {
            super(player,gui);
        }

    }

    public static class ButtonEvent extends CustomGuiEvent {
        public int buttonId;

        public ButtonEvent(IPlayer player, ICustomGui gui, int buttonId) {
            super(player,gui);
            this.buttonId = buttonId;
        }

    }

    public static class SlotEvent extends CustomGuiEvent {
        public int slotId;
        public IItemStack stack;

        public SlotEvent(IPlayer player, ICustomGui gui, int slotId, IItemStack stack) {
            super(player,gui);
            this.slotId = slotId;
            this.stack = stack;
        }

    }

    public static class ScrollEvent extends CustomGuiEvent {
        public int scrollId;
        public String[] selection;
        public boolean doubleClick;

        public ScrollEvent(IPlayer player, ICustomGui gui, int scrollId, String[] selection, boolean doubleClick) {
            super(player,gui);
            this.scrollId = scrollId;
            this.selection = selection;
            this.doubleClick = doubleClick;
        }

    }

}
