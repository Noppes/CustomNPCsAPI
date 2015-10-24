package noppes.npcs.api;

import noppes.npcs.api.constants.EnumOptionType;

public interface IDialogOption {
	public int getSlot();
	public String getName();
	public EnumOptionType getType();
}