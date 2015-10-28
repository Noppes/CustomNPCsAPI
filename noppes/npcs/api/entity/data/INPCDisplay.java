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

	public void setHashLivingAnimation(boolean enabled);

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

}
