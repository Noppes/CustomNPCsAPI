package noppes.npcs.api.entity.data;

public interface INPCRanged {

	public int getStrength();

	public void setStrength(int strength);

	/**
	 * @return Speed of the projectile shot
	 */
	public int getSpeed();

	/**
	 * @param speed Speed of the projectile shot (default:10)
	 */
	public void setSpeed(int speed);

	/**
	 * Burst is the ammount shot at a time. E.g. a burst of 5 burst delay of 2 and a normal delay of 20, 
	 * will shoot 5 projectiles with a delay of 2 ticks every 20 ticks.
	 */
	public int getBurst();

	public void setBurst(int count);

	public int getBurstDelay();

	public void setBurstDelay(int delay);

	public int getKnockback();

	public void setKnockback(int punch);

	public int getSize();

	public void setSize(int size);

	public boolean getRender3D();

	public void setRender3D(boolean render3d);

	public boolean getSpins();

	public void setSpins(boolean spins);

	public boolean getSticks();

	public void setSticks(boolean sticks);

	public boolean getHasGravity();

	public void setHasGravity(boolean hasGravity);

	public boolean getAccelerate();

	public void setAccelerate(boolean accelerate);

	public int getExplodeSize();

	public void setExplodeSize(int size);

	/**
	 * @see noppes.npcs.api.constants.PotionEffectType
	 */
	public int getEffectType();
	
	public int getEffectTime();

	public int getEffectStrength();

	public void setEffect(int type, int strength, int time);

	public boolean getGlows();

	public void setGlows(boolean glows);

	/**
	 * @see noppes.npcs.api.constants.ParticleType
	 */
	public int getParticle();

	public void setParticle(int type);
	
	/**
	 * @param type 0:Fire
	 */
	public String getSound(int type);

	/**
	 * @param type 0:Fire, 1:Hit, 2:Ground
	 */
	public void setSound(int type, String sound);

	public int getShotCount();

	public void setShotCount(int count);

	public boolean getHasAimAnimation();

	public void setHasAimAnimation(boolean aim);

	public int getAccuracy();

	public void setAccuracy(int accuracy);

	public int getRange();

	public void setRange(int range);

	public int getDelayMin();

	public int getDelayMax();
	
	/**
	 * @return Returns a value between delayMin and delayMax
	 */
	public int getDelayRNG();

	public void setDelay(int min, int max);

	public int getFireType();

	public void setFireType(int type);

	public int getMeleeRange();

	public void setMeleeRange(int range);

}
