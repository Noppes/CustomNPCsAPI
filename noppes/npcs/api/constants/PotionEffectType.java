package noppes.npcs.api.constants;

import net.minecraft.core.Registry;
import net.minecraft.world.effect.MobEffect;

import java.util.ArrayList;
import java.util.List;

public final class PotionEffectType {
	public static final int NONE = 0;
	public static final int FIRE = 666;


	public static final int SPEED = 1;
	public static final int SLOWNESS = 2;
	public static final int HASTE = 3;
	public static final int MINING_FATIGUE = 4;
	public static final int STRENGTH = 5;
	public static final int INSTANT_HEALTH = 6;
	public static final int INSTANT_DAMAGE = 7;
	public static final int JUMP_BOOST = 8;
	public static final int NAUSEA = 9;
	public static final int REGENERATION = 10;
	public static final int RESISTANCE = 11;
	public static final int FIRE_RESISTANCE = 12;
	public static final int WATER_BREATHING = 13;
	public static final int INVISIBILITY = 14;
	public static final int BLINDNESS = 15;
	public static final int NIGHT_VISION = 16;
	public static final int HUNGER = 17;
	public static final int WEAKNESS = 18;
	public static final int POISON = 19;
	public static final int WITHER = 20;
	public static final int HEALTH_BOOST = 21;
	public static final int ABSORPTION = 22;
	public static final int SATURATION = 23;
	public static final int GLOWING = 24;
	public static final int LEVITATION = 25;
	public static final int LUCK = 26;
	public static final int UNLUCK = 27;
	public static final int SLOW_FALLING = 28;
	public static final int CONDUIT_POWER = 29;
	public static final int DOLPHINS_GRACE = 30;
	public static final int BAD_OMEN = 31;
	public static final int HERO_OF_THE_VILLAGE = 32;



	public static MobEffect getMCType(int effect) {
		if(effect == NONE || effect == FIRE)
			return null;

		return Registry.MOB_EFFECT.byId(effect);
	}

	public static List<MobEffect> getMCAllTypes() {
		List<MobEffect> list = new ArrayList<>();
		for(int i = 1; i <= 32; i++){
			list.add(getMCType(i));
		}
		return list;
	}
}
