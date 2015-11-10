package noppes.npcs.api.constants;

import net.minecraft.potion.Potion;

public final class PotionEffectType {
	public static final int NONE = 0;
	public static final int FIRE = 1;
	public static final int POISON = 2;
	public static final int HUNGER = 3;
	public static final int WEAKNESS = 4;
	public static final int SLOWNESS = 5;
	public static final int NAUSEA = 6;
	public static final int BLINDNESS = 7;
	public static final int WITHER = 8;
	

	
	public static Potion getMCType(int effect) {
		switch(effect){
			case POISON : return Potion.poison;
			case HUNGER : return Potion.hunger;
			case WEAKNESS : return Potion.weakness;
			case SLOWNESS : return Potion.moveSlowdown;
			case NAUSEA : return Potion.confusion;
			case BLINDNESS : return Potion.blindness;
			case WITHER : return Potion.wither;
			default : return null;
		}
	}
}
