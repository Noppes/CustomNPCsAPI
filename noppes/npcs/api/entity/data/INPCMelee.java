package noppes.npcs.api.entity.data;

public interface INPCMelee {

	public int getStrength();

	public void setStrength(int strength);

	public int getDelay();

	public void setDelay(int speed);

	public int getRange();

	public void setRange(int range);

	public int getKnockback();

	public void setKnockback(int knockback);

	public int getEffectType();

	public int getEffectTime();

	public int getEffectStrength();

	public void setEffect(int type, int strength, int time);

}
