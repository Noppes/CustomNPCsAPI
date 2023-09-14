package noppes.npcs.api.entity.data;

public interface INPCRanged {

	int getStrength();

	void setStrength(int strength);

	/**
	 * @return Speed of the projectile shot
	 */
	int getSpeed();

	/**
	 * @param speed Speed of the projectile shot (default:10)
	 */
	void setSpeed(int speed);

	/**
	 * Burst is the ammount shot at a time. E.g. a burst of 5 burst delay of 2 and a normal delay of 20, 
	 * will shoot 5 projectiles with a delay of 2 ticks every 20 ticks.
	 */
	int getBurst();

	void setBurst(int count);

	int getBurstDelay();

	void setBurstDelay(int delay);

	int getKnockback();

	void setKnockback(int punch);

	int getSize();

	void setSize(int size);

	boolean getRender3D();

	void setRender3D(boolean render3d);

	boolean getSpins();

	void setSpins(boolean spins);

	boolean getSticks();

	void setSticks(boolean sticks);

	boolean getHasGravity();

	void setHasGravity(boolean hasGravity);

	boolean getAccelerate();

	void setAccelerate(boolean accelerate);

	int getExplodeSize();

	void setExplodeSize(int size);

	/**
	 * @see noppes.npcs.api.constants.PotionEffectType
	 */
	int getEffectType();
	
	int getEffectTime();

	int getEffectStrength();

	void setEffect(int type, int strength, int time);

	boolean getGlows();

	void setGlows(boolean glows);

	/**
	 * see <a href="http://minecraft.gamepedia.com/Particles">http://minecraft.gamepedia.com/Particles</a>
	 */
	String getParticle();

	/**
	 * see <a href="http://minecraft.gamepedia.com/Particles">http://minecraft.gamepedia.com/Particles</a>
	 */
	void setParticle(String type);
	
	/**
	 * @param type 0:Fire
	 */
	String getSound(int type);

	/**
	 * @param type 0:Fire, 1:Hit, 2:Ground
	 */
	void setSound(int type, String sound);

	int getShotCount();

	void setShotCount(int count);

	boolean getHasAimAnimation();

	void setHasAimAnimation(boolean aim);

	int getAccuracy();

	void setAccuracy(int accuracy);

	int getRange();

	void setRange(int range);

	int getDelayMin();

	int getDelayMax();
	
	/**
	 * @return Returns a value between delayMin and delayMax
	 */
	int getDelayRNG();

	void setDelay(int min, int max);

	int getFireType();

	void setFireType(int type);

}
