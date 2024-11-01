package noppes.npcs.api.block;

/**
 * Used for certain technical mods which use FluidContainer blocks *
 */
public interface IBlockFluidContainer extends IBlock{

	float getFluidPercentage();

	int getFuildDensity();

	float getFuildTemperature();

	String getFluidName();

}
