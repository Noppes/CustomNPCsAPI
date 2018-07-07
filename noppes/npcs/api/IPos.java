package noppes.npcs.api;

import net.minecraft.util.math.BlockPos;

public interface IPos {

	public int getX();

	public int getY();

	public int getZ();

	public IPos up();

	public IPos up(int n);

	public IPos down();

	public IPos down(int n);

	public IPos north();

	public IPos north(int n);

	public IPos east();

	public IPos east(int n);

	public IPos south();

	public IPos south(int n);

	public IPos west();

	public IPos west(int n);

	public IPos add(int x, int y, int z);

	public IPos add(IPos pos);

	public BlockPos getMCBlockPos();

	/**
	 * @param direction {@link noppes.npcs.api.constants.SideType} 
	 */
	public IPos offset(int direction);

	/**
	 * @param direction {@link noppes.npcs.api.constants.SideType} 
	 * @param n how many positions
	 */
	public IPos offset(int direction, int n);

}
