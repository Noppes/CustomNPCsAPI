package noppes.npcs.api;

import net.minecraft.util.DamageSource;

public interface IDamageSource {

	public String getType();
	
	public boolean isUnblockable();
	
	public boolean isProjectile();
	
	public DamageSource getMCDamageSource();
}
