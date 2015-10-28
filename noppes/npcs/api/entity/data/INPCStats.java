package noppes.npcs.api.entity.data;

public interface INPCStats {

	public int getMaxHealth();

	public void setMaxHealth(int maxHealth);
	
	/**
	 * @param type 0:Melee, 1:Ranged, 2:Explosion, 3:Knockback
	 * @return Returns value between 0 and 2. 0 being no resistance so increased damage and 2 being fully resistant. Normal is 1
	 */
	public float getResistance(int type);
	
	public void setResistance(int type, float value);

}
