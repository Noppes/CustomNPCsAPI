package noppes.npcs.api.event;

import net.minecraftforge.eventbus.api.Cancelable;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.gui.IButton;
import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.gui.IItemSlot;
import noppes.npcs.api.gui.IScroll;
import noppes.npcs.api.item.IItemStack;

public class CustomGuiEvent extends CustomNPCsEvent {


	public final IPlayer player;
    public final ICustomGui gui;

    public CustomGuiEvent(IPlayer player, ICustomGui gui) {
        this.player = player;
        this.gui = gui;
    }

    /**
     * customGuiClosed
     */
    public static class CloseEvent extends CustomGuiEvent {

        public CloseEvent(IPlayer player, ICustomGui gui) {
            super(player,gui);
        }

    }

    /**
     * customGuiButton
     */
    public static class ButtonEvent extends CustomGuiEvent {
        public final int buttonId;
        public final IButton button;

        public ButtonEvent(IPlayer player, ICustomGui gui, IButton button) {
            super(player,gui);
            this.button = button;
            this.buttonId = button.getID();
        }

    }

    /**
     * customGuiSlot
     */
    public static class SlotEvent extends CustomGuiEvent {
        public final int slotId;
        public final IItemStack stack;
        public final IItemSlot slot;

        public SlotEvent(IPlayer player, ICustomGui gui, IItemSlot slot) {
            super(player,gui);
            this.slotId = slot.getID();
            this.stack = slot.getStack();
            this.slot = slot;
        }

    }

    /**
     * customGuiSlotClicked
     */
	@Cancelable
    public static class SlotClickEvent extends SlotEvent {
        public final int dragType;
        public final String clickType;

        public SlotClickEvent(IPlayer player, ICustomGui gui, IItemSlot slot, int dragType, String clickType) {
            super(player, gui, slot);
            this.dragType = dragType;
            this.clickType = clickType;
        }
	}

    /**
     * customGuiScroll
     */
    public static class ScrollEvent extends CustomGuiEvent {
        public final int scrollId;
        public final String[] selection;
        public final boolean doubleClick;
        public final int scrollIndex;
        public final IScroll scroll;

        public ScrollEvent(IPlayer player, ICustomGui gui, IScroll scroll, int scrollIndex, String[] selection, boolean doubleClick) {
            super(player,gui);
            this.scroll = scroll;
            this.scrollId = scroll.getID();
            this.selection = selection;
            this.doubleClick = doubleClick;
            this.scrollIndex = scrollIndex;
        }

    }

    public static class ResizedEvent extends CustomGuiEvent {
        public final int oldWidth;
        public final int oldHeight;

        public ResizedEvent(IPlayer player, ICustomGui gui, int oldWidth, int oldHeight) {
            super(player, gui);
            this.oldWidth = oldWidth;
            this.oldHeight = oldHeight;
        }
    }

    public static class OpenedEvent extends CustomGuiEvent {

        public OpenedEvent(IPlayer player, ICustomGui gui) {
            super(player, gui);
        }
    }

}
