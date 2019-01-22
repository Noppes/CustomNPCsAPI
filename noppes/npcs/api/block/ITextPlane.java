package noppes.npcs.api.block;

public interface ITextPlane {

	public String getText();

	public void setText(String text);

	public int getRotationX();

	public int getRotationY();

	public int getRotationZ();

	public void setRotationX(int x);

	public void setRotationY(int y);

	/**
	 * @param z Default: 0.5
	 */
	public void setRotationZ(int z);

	public float getOffsetX();

	public float getOffsetY();

	public float getOffsetZ();

	public void setOffsetX(float x);

	public void setOffsetY(float y);

	public void setOffsetZ(float z);

	public float getScale();

	/**
	 * @param scale Default: 1
	 */
	public void setScale(float scale);
}
