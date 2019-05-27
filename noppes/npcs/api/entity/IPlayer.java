package noppes.npcs.api.entity;

import net.minecraft.entity.player.EntityPlayerMP;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.ITimers;
import noppes.npcs.api.block.IBlock;
import noppes.npcs.api.entity.data.IPixelmonPlayerData;
import noppes.npcs.api.entity.data.IPlayerMail;
import noppes.npcs.api.handler.data.IQuest;
import noppes.npcs.api.item.IItemStack;

public interface IPlayer<T extends EntityPlayerMP> extends IEntityLivingBase<T>{

	public String getDisplayName();
	
	public boolean hasFinishedQuest(int id);
	
	public boolean hasActiveQuest(int id);
	
	public void startQuest(int id);
		
	/**
	 * @return Returns -1:Unfriendly, 0:Neutral, 1:Friendly
	 */
	public int factionStatus(int factionId);
	
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
	 * @param id Removes the given id from the read dialogs list
	 */
	public void removeDialog(int id);
	
	/**
	 * @param id Adds the given id to the read dialogs
	 */
	public void addDialog(int id);
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
	 * Use getInventory().count instead
	 * @deprecated
	 */
	public int inventoryItemCount(IItemStack item);
	
	/**
	 * Use getInventory().count instead
	 * @deprecated
	 */
	public int inventoryItemCount(String id, int damage);

	/**
	 * @return Returns a IItemStack array size 36
	 */
	public IContainer getInventory();
	
	/**
	 * @param item The Item type to be removed
	 * @param amount How many will be removed
	 * @return Returns true if the items were removed succesfully. Returns false incase a bigger amount than what the player has was given
	 */
	public boolean removeItem(IItemStack item, int amount);

	/**
	 * @param id The items name
	 * @param damage The damage value (give -1 for any damage value)
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

	public Object getPixelmonData();

	public ITimers getTimers();
	
	public void closeGui();

	@Override
	public T getMCEntity();

	public IBlock getSpawnPoint();

	public void setSpawnPoint(IBlock block);

	public int getHunger();

	public void setHunger(int level);

	/**
	 * @param message The message the player gets when kicked
	 */
	public void kick(String message);

	/**
	 * @param title Title of the notification
	 * @param msg Message of the notification
	 * @param type (0-3) notification background type
	 */
	public void sendNotification(String title, String msg, int type);
	
	public void sendMail(IPlayerMail mail);
	
	/**
	 * WANRING, REMOVES ALL PLAYER DATA (data only from CustomNPCs, does not clear inventory etc)
	 */
	public void clearData();

	public IQuest[] getActiveQuests();

	public IQuest[] getFinishedQuests();

	/**
	 * Syncs inventory changes to the client side. Also checks Item Quests for completion
	 */
	public void updatePlayerInventory();
	
	/**
	 * @param sound Sounds resource name
	 * @param volume default 1
	 * @param pitch default 1
	 */
	public void playSound(String sound, float volume, float pitch);
	
	/**
	 * @param rows (1-6)
	 * @return Returns the IContainer of the chest gui
	 */
	public IContainer showChestGui(int rows);
	
	/**
	 * @return Returns the container of the player if he has a container gui open. Returns the inventory container if none is open
	 */
	public IContainer getOpenContainer();

	public boolean canQuestBeAccepted(int id);

}
