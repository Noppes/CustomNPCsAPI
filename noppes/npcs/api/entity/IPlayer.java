package noppes.npcs.api.entity;

import net.minecraft.entity.player.EntityPlayerMP;
import noppes.npcs.api.ITimers;
import noppes.npcs.api.entity.data.IPixelmonPlayerData;
import noppes.npcs.api.item.IItemStack;

public interface IPlayer<T extends EntityPlayerMP> extends IEntityLivingBase<T>{

	public String getName();
	
	public String getDisplayName();
	
	public boolean hasFinishedQuest(int id);
	
	public boolean hasActiveQuest(int id);
	
	public void startQuest(int id);
	
	/**
	 * Add the quest from finished quest list
	 * @param id The Quest ID
	 */
	public void finishQuest(int id);
	
	/**
	 * Removes the quest from active quest list
	 * @param id The Quest ID
	 */
	public void stopQuest(int id);

	/**
	 * Removes the quest from active and finished quest list
	 * @param id The Quest ID
	 */
	public void removeQuest(int id);

	public boolean hasReadDialog(int id);
	
	/**
	 * @param name Name of the person talking in the dialog
	 */
	public void showDialog(int id, String name);
	/**
	 * @param faction The faction id
	 * @param points The points to increase. Use negative values to decrease
	 */
	public void addFactionPoints(int faction, int points);

    /**         
     * @param faction The faction id
     * @return  points
     */
	public int getFactionPoints(int faction);

	public void message(String message);
	
	public int getGamemode();
	
	public void setGamemode(int mode);
	
	/**
	 * @param item The item to be checked
	 * @return How many of this item the player has
	 */
	public int inventoryItemCount(IItemStack item);

	/**
	 * @return Returns a IItemStack array size 36
	 */
	public IItemStack[] getInventory();
	
	/**
	 * @param item The Item type to be removed
	 * @param amount How many will be removed
	 * @return Returns true if the items were removed succesfully. Returns false incase a bigger amount than what the player has was given
	 */
	public boolean removeItem(IItemStack item, int amount);

	/**
	 * @param id The items name
	 * @param damage The damage value 
	 * @param amount How many will be removed
	 * @return Returns true if the items were removed succesfully. Returns false incase a bigger amount than what the player has was given or item doesnt exist
	 */
	public boolean removeItem(String id, int damage, int amount);

	public void removeAllItems(IItemStack item);
	
	/**
	 * @param item Item to be added
	 * @return Returns whether or not it gave the item succesfully
	 */
	public boolean giveItem(IItemStack item);
	
	
	/**
	 * @param id The items name
	 * @param damage The damage value
	 * @param amount The amount of the item to be added
	 * @return Returns whether or not it gave the item succesfully
	 */
	public boolean giveItem(String id, int damage, int amount);

	
	/**
	 * Same as the /spawnpoint command
	 * @param x The x position
	 * @param y The y position
	 * @param z The z position
	 */
	public void setSpawnpoint(int x, int y, int z);
	
	public void resetSpawnpoint();

	/**
	 * @param achievement The achievement id. For a complete list see <a href="http://minecraft.gamepedia.com/Achievements>Achievements</a>
	 * @return Returns whether or not the player has this achievement
	 */
	public boolean hasAchievement(String achievement);
	
	public int getExpLevel();
	
	public void setExpLevel(int level);
	
	public boolean hasPermission(String permission);

	public IPixelmonPlayerData getPixelmonData();

	public ITimers getTimers();

	@Override
	public T getMCEntity();

}
