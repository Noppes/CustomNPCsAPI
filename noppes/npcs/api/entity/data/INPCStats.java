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

	/**
	 * @return Returns the combat health regen per second
	 */
	public int getCombatRegen();

	/**
	 * @param regen The combat health regen per second
	 */
	public void setCombatRegen(int regen);

	/**
	 * @return Returns the health regen per second when not in combat
	 */
	public int getHealthRegen();

	/**
	 * @param regen The health regen per second when not in combat
	 */
	public void setHealthRegen(int regen);

	public INPCMelee getMelee();

	public INPCRanged getRanged();

	/**
	 * @param type 0:Potion, 1:Falldamage, 2:Sunburning, 3:Fire, 4:Drowning, 5:Cobweb
	 */
	public boolean getImmune(int type);

	/**
	 * @param type 0:Potion, 1:Falldamage, 2:Sunburning, 3:Fire, 4:Drowning, 5:Cobweb
	 */
	public void setImmune(int type, boolean bo);

	/**
	 * (0=Normal, 1=Undead, 2=Arthropod) Only used for damage calculations with enchants
	 */
	public void setCreatureType(int type);

	/**
	 * (0=Normal, 1=Undead, 2=Arthropod) Only used for damage calculations with enchants
	 */
	public int getCreatureType();

	/**
	 * @return 0:Yes, 1:Day, 2:Night, 3:No, 4:Naturally
	 */
	public int getRespawnType();

	/**
	 * @param type 0:Yes, 1:Day, 2:Night, 3:No, 4:Naturally
	 */
	public void setRespawnType(int type);

	public int getRespawnTime();

	public void setRespawnTime(int seconds);

	public boolean getHideDeadBody();

	public void setHideDeadBody(boolean hide);

	public int getAggroRange();

	public void setAggroRange(int range);

}
