package noppes.npcs.api;

import noppes.npcs.api.block.IBlock;

public interface IRayTrace {
	public IPos getPos();
	
	public IBlock getBlock();
	
	public int getSideHit();
}
