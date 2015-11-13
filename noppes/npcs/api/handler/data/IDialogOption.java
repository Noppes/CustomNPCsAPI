package noppes.npcs.api.handler.data;

import noppes.npcs.api.constants.EnumOptionType;

public interface IDialogOption {
	public int getSlot();
	public String getName();
	public EnumOptionType getType();
}