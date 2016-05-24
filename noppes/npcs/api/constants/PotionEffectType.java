package noppes.npcs.api.constants;

import net.minecraft.init.MobEffects;
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
			case POISON : return MobEffects.POISON;
			case HUNGER : return MobEffects.HUNGER;
			case WEAKNESS : return MobEffects.WEAKNESS;
			case SLOWNESS : return MobEffects.SLOWNESS;
			case NAUSEA : return MobEffects.NAUSEA;
			case BLINDNESS : return MobEffects.BLINDNESS;
			case WITHER : return MobEffects.WITHER;
			default : return null;
		}
	}
}
