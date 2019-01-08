package noppes.npcs.api.entity.data;

import noppes.npcs.api.entity.IPixelmon;

public interface IPixelmonPlayerData {

	public int countPCPixelmon();

	public IPixelmon getPartySlot(int slot);

	public boolean isBattling();

}
