package noppes.npcs.api;

import net.minecraft.util.DamageSource;
import noppes.npcs.api.entity.IEntity;

public interface IDamageSource {

	public String getType();
	
	public boolean isUnblockable();
	
	public boolean isProjectile();
	
	public IEntity getTrueSource();
	
	public IEntity getImmediateSource();
	
	public DamageSource getMCDamageSource();
}
