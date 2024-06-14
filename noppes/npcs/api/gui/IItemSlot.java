package noppes.npcs.api.gui;

import net.minecraft.world.inventory.Slot;
import noppes.npcs.api.function.gui.GuiItemSlotAccepts;
import noppes.npcs.api.function.gui.GuiItemSlotClicked;
import noppes.npcs.api.function.gui.GuiItemSlotUpdate;
import noppes.npcs.api.item.IItemStack;
import noppes.npcs.api.wrapper.gui.CustomGuiItemSlotWrapper;

public interface IItemSlot extends ICustomGuiComponent {

    boolean hasStack();
    IItemStack getStack();
    IItemSlot setStack(IItemStack itemStack);

    int getShownSize();
    IItemSlot setShowSize(int size);

    /**
     * This is purely for the visual slot, default is 1
     * @return GuiType 0:None, 1:Normal, 2:Sword, 3:Arrow, 4:Shield, 5:Head, 6:Body, 7:Legs, 8:Feet
     */
    int getGuiType();

    /**
     * This is purely for the visual slot, default is 1
     * @param type GuiType 0:None, 1:Normal, 2:Sword, 3:Arrow, 4:Shield, 5:Head, 6:Body, 7:Legs, 8:Feet
     */
    IItemSlot setGuiType(int type);

    boolean getDropOnClose();
    IItemSlot setDropOnClose(boolean drop);

    boolean isPlayerSlot();

    IItemSlot setOnUpdate(GuiItemSlotUpdate onUpdate);
    IItemSlot setOnClick(GuiItemSlotClicked onPress);
    IItemSlot setOnAccepts(GuiItemSlotAccepts onAccepts);

    int getIndex();

    Slot getMCSlot();

}
