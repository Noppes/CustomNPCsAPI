package noppes.npcs.api.constants;

import net.minecraft.util.EnumParticleTypes;

public class ParticleType {
	public static final int NONE = 0;
	public static final int SMOKE = 1;
	public static final int PORTAL = 2;
	public static final int REDSTONE = 3;
	public static final int LIGHTNING = 4;
	public static final int LARGE_SMOKE = 5;
	public static final int MAGIC = 6;
	public static final int ENCHANT = 7;
	public static final int CRIT = 8;
	
	public static EnumParticleTypes getMCType(int type){
		if(type == SMOKE)
			return EnumParticleTypes.SMOKE_NORMAL;
		if(type == PORTAL)
			return EnumParticleTypes.PORTAL;
		if(type == REDSTONE)
			return EnumParticleTypes.REDSTONE;
		if(type == LIGHTNING)
			return EnumParticleTypes.CRIT_MAGIC;
		if(type == LARGE_SMOKE)
			return EnumParticleTypes.SMOKE_LARGE;
		if(type == MAGIC)
			return EnumParticleTypes.SPELL_WITCH;
		if(type == ENCHANT)
			return EnumParticleTypes.ENCHANTMENT_TABLE;
		if(type == CRIT)
			return EnumParticleTypes.CRIT;
		
		return null;
	}
}
