package noppes.npcs.api.entity.data.role;

public interface IJobBard {

	public String getSong();

	public void setSong(String song);

	boolean getLooping();

	void setLooping(boolean bo);

	boolean getIsBackground();

	void setIsBackground(boolean bo);

	int getMinRange();

	void setMinRange(int range);

	int getMaxRange();

	void setMaxRange(int range);

	boolean getHasMaxRange();

	void setHasMaxRange(boolean bo);
}
