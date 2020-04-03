package noppes.npcs.api.gui;

import net.minecraft.nbt.NBTTagCompound;

public interface ICustomGuiComponent {

    int getType();
    NBTTagCompound getNBT();
    ICustomGuiComponent loadNBT(NBTTagCompound tag);
    ICustomGuiComponent setType(int id);

}
