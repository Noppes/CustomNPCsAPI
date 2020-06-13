package noppes.npcs.api.constants;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.init.Particles;
import net.minecraft.network.PacketBuffer;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.IParticleData;
import net.minecraft.particles.RedstoneParticleData;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.IRegistry;

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
			return Particles.SMOKE;
		if(type == PORTAL)
			return Particles.PORTAL;
		if(type == REDSTONE)
			return new RedstoneParticleType(Particles.DUST);//hacky fix
		if(type == LIGHTNING)
			return Particles.ENCHANTED_HIT;
		if(type == LARGE_SMOKE)
			return Particles.LARGE_SMOKE;
		if(type == MAGIC)
			return Particles.WITCH;
		if(type == ENCHANT)
			return Particles.ENCHANT;
		if(type == CRIT)
			return Particles.CRIT;
		
		return null;
	}

	static class RedstoneParticleType extends net.minecraft.particles.ParticleType<RedstoneParticleData> implements IParticleData {

		protected RedstoneParticleType(net.minecraft.particles.ParticleType<RedstoneParticleData> type) {
			super(type.getId(), type.getAlwaysShow(), RedstoneParticleData.DESERIALIZER);
		}

		public net.minecraft.particles.ParticleType<net.minecraft.particles.RedstoneParticleData> getType() {
			return Particles.DUST;
		}

		public void write(PacketBuffer p_197553_1_) {
		}

		public String getParameters() {
			return this.getId().toString();
		}
	}
}
