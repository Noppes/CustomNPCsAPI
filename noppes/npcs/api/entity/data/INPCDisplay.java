package noppes.npcs.api.entity.data;

public interface INPCDisplay {

	public String getName();

	public void setName(String name);

	public String getTitle();

	public void setTitle(String title);

	public String getSkinUrl();

	public void setSkinUrl(String url);

	public String getSkinPlayer();

	public void setSkinPlayer(String name);

	public String getSkinTexture();

	public void setSkinTexture(String texture);

	public boolean getHasLivingAnimation();

	public void setHasLivingAnimation(boolean enabled);

	/**
	 * @return 0:visible, 1:invisible, 2:semi-invisible
	 */
	public int getVisible();

	/**
	 * @param type 0:visible, 1:invisible, 2:semi-invisible
	 */
	public void setVisible(int type);

	/**
	 * @return 0:invisible, 1:visible, 2:when-attacking
	 */
	public int getBossbar();

	/**
	 * @param type 0:invisible, 1:visible, 2:when-attacking
	 */
	public void setBossbar(int type);
	
	/**
	 * @return 1-30
	 */
	public int getSize();

	/**
	 * @param size 1-30
	 */
	public void setSize(int size);

	public int getTint();

	/**
	 * @param color E.g. setTint(0xFF0000) sets the tint to red. (depending on the language you might want to look up how to convert hexadecimals to integers)
	 */
	public void setTint(int color);

	/**
	 * @return 0:visible, 1:invisible, 2:when-attacking
	 */
	public int getShowName();
	
	/**
	 * @param type 0:visible, 1:invisible, 2:when-attacking
	 */
	public void setShowName(int type);

	public void setCapeTexture(String texture);

	public String getCapeTexture();

	public void setOverlayTexture(String texture);

	public String getOverlayTexture();

	/**
	 * @param part 0:Head, 1:Body, 2:ArmLeft, 3:ArmRight, 4:LegLeft, 5:LegRight
	 */
	public void setModelScale(int part, float x, float y, float z);

	/**
	 * @param part 0:Head, 1:Body, 2:ArmLeft, 3:ArmRight, 4:LegLeft, 5:LegRight
	 * @return Returns a float array
	 */
	public float[] getModelScale(int part);

	/**
	 * @return 0:Pink, 1:Blue, 2:Red, 3:Green, 4:Yellow, 5:Purple, 6:White
	 */
	public int getBossColor();

	/**
	 * @param color 0:Pink, 1:Blue, 2:Red, 3:Green, 4:Yellow, 5:Purple, 6:White
	 */
	public void setBossColor(int color);
	
	/**
	 * @param model Entity id from <a href="https://minecraft.gamepedia.com/Java_Edition_data_values/Entity_IDs">here</a>
	 */
	public void setModel(String model);
	
	public String getModel();

	public void setHasHitbox(boolean bo);

	public boolean getHasHitbox();

}
