package noppes.npcs.api.entity.data.role;

public interface IRoleDialog {

	public String getDialog();

	public void setDialog(String text);

	public String getOption(int option);

	/**
	 * @param option The dialog option (1-6)
	 */
	public void setOption(int option, String text);

	public String getOptionDialog(int option);

	/**
	 * @param option The dialog option (1-6)
	 */
	public void setOptionDialog(int option, String text);

}
