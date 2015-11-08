package noppes.npcs.api.block;

/**
 * Used for certain technical mods which use FluidContainer blocks *
 */
public interface IBlockFluidContainer extends IBlock{

	public float getFluidPercentage();

	public float getFuildDensity();

	public float getFuildTemperature();

	public float getFluidValue();

	public String getFluidName();

}
