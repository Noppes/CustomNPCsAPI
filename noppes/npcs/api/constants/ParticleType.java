package noppes.npcs.api.constants;

import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.particles.RedstoneParticleData;

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
	
	public static IParticleData getMCType(int type){
		if(type == SMOKE)
			return ParticleTypes.SMOKE;
		if(type == PORTAL)
			return ParticleTypes.PORTAL;
		if(type == REDSTONE)
			return new RedstoneParticleType();//hacky fix
		if(type == LIGHTNING)
			return ParticleTypes.ENCHANTED_HIT;
		if(type == LARGE_SMOKE)
			return ParticleTypes.LARGE_SMOKE;
		if(type == MAGIC)
			return ParticleTypes.WITCH;
		if(type == ENCHANT)
			return ParticleTypes.ENCHANT;
		if(type == CRIT)
			return ParticleTypes.CRIT;
		
		return null;
	}

	static class RedstoneParticleType extends RedstoneParticleData {

		protected RedstoneParticleType() {
			super(1,0,0, 1);
		}

		@Override
		public net.minecraft.particles.ParticleType<net.minecraft.particles.RedstoneParticleData> getType() {
			return ParticleTypes.DUST;
		}

		@Override
		public void writeToNetwork(PacketBuffer p_197553_1_) {
		}

		@Override
		public String writeToString() {
			return ParticleTypes.DUST.getRegistryName().toString();
		}
	}
}
