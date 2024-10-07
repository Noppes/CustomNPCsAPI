package noppes.npcs.api.entity;

import net.minecraft.server.level.ServerPlayer;
import noppes.npcs.api.IContainer;
import noppes.npcs.api.ITimers;
import noppes.npcs.api.block.IBlock;
import noppes.npcs.api.entity.data.IPlayerMail;
import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.handler.data.IQuest;
import noppes.npcs.api.item.IItemStack;

public interface IPlayer<T extends ServerPlayer> extends IEntityLiving<T> {

	String getDisplayName();
	
	boolean hasFinishedQuest(int id);
	
	boolean hasActiveQuest(int id);
	
	void startQuest(int id);
		
	/**
	 * @return Returns -1:Unfriendly, 0:Neutral, 1:Friendly
	 */
	int factionStatus(int factionId);
	
	/**
	 * Add the quest from finished quest list
	 * @param id The Quest ID
	 */
	void finishQuest(int id);
	
	/**
	 * Removes the quest from active quest list
	 * @param id The Quest ID
	 */
	void stopQuest(int id);

	/**
	 * Removes the quest from active and finished quest list
	 * @param id The Quest ID
	 */
	void removeQuest(int id);

	boolean hasReadDialog(int id);
	
	/**
	 * @param name Name of the person talking in the dialog
	 */
	void showDialog(int id, String name);
	
	/**
	 * @param id Removes the given id from the read dialogs list
	 */
	void removeDialog(int id);
	
	/**
	 * @param id Adds the given id to the read dialogs
	 */
	void addDialog(int id);
	/**
	 * @param faction The faction id
	 * @param points The points to increase. Use negative values to decrease
	 */
	void addFactionPoints(int faction, int points);

    /**         
     * @param faction The faction id
     * @return  points
     */
	int getFactionPoints(int faction);

	void message(String message);
	
	int getGamemode();
	
	void setGamemode(int mode);
	
	/**
	 * Use getInventory().count instead
	 * @deprecated
	 */
	int inventoryItemCount(IItemStack item);
	
	/**
	 * Use getInventory().count instead
	 * @deprecated
	 */
	int inventoryItemCount(String id);

	/**
	 * @return Returns a IItemStack array size 36
	 */
	IContainer getInventory();

	/**
	 * @return Returns the itemstack the player is currently holding in a container gui
	 */
	IItemStack getInventoryHeldItem();
	
	/**
	 * @param item The Item type to be removed
	 * @param amount How many will be removed
	 * @return Returns true if the items were removed succesfully. Returns false incase a bigger amount than what the player has was given
	 */
	boolean removeItem(IItemStack item, int amount);

	/**
	 * @param id The items name
	 * @param amount How many will be removed
	 * @return Returns true if the items were removed succesfully. Returns false incase a bigger amount than what the player has was given or item doesnt exist
	 */
	boolean removeItem(String id, int amount);

	void removeAllItems(IItemStack item);

	/**
	 * @param items Item to be added or dropped if inventory is full
	 */
	void giveOrDropItems(IItemStack[] items);
	
	/**
	 * @param item Item to be added
	 * @return Returns whether or not it gave the item succesfully
	 */
	boolean giveItem(IItemStack item);
	
	
	/**
	 * @param id The items name
	 * @param amount The amount of the item to be added
	 * @return Returns whether or not it gave the item succesfully
	 */
	boolean giveItem(String id, int amount);

	
	/**
	 * Same as the /spawnpoint command
	 * @param x The x position
	 * @param y The y position
	 * @param z The z position
	 */
	void setSpawnpoint(int x, int y, int z);
	
	void resetSpawnpoint();

	/**
	 * @param achievement The achievement id. For a complete list see <a href="http://minecraft.gamepedia.com/Achievements>Achievements</a>
	 * @return Returns whether or not the player has this achievement
	 */
	boolean hasAdvancement(String achievement);
	
	int getExpLevel();
	
	void setExpLevel(int level);
	
	boolean hasPermission(String permission);

	Object getPixelmonData();

	ITimers getTimers();
	
	void closeGui();

	@Override
	T getMCEntity();

	IBlock getSpawnPoint();

	void setSpawnPoint(IBlock block);

	int getHunger();

	void setHunger(int level);

	/**
	 * @param message The message the player gets when kicked
	 */
	void kick(String message);

	/**
	 * @param title Title of the notification
	 * @param msg Message of the notification
	 * @param type (0-3) notification background type
	 */
	void sendNotification(String title, String msg, int type);
	
	void sendMail(IPlayerMail mail);
	
	/**
	 * WANRING, REMOVES ALL PLAYER DATA (data only from CustomNPCs, does not clear inventory etc)
	 */
	void clearData();

	IQuest[] getActiveQuests();

	IQuest[] getFinishedQuests();

	/**
	 * Syncs inventory changes to the client side. Also checks Item Quests for completion
	 */
	void updatePlayerInventory();
	
	/**
	 * @param sound Sounds resource name
	 * @param volume default 1
	 * @param pitch default 1
	 */
	void playSound(String sound, float volume, float pitch);

	/**
	 * @param sound Sounds resource name
	 * @param background Whether to play the music in the background or like a jukebox in a specific location
	 * @param loops Whether the music loops
	 */
	void playMusic(String sound, boolean background, boolean loops);

	void stopMusic();

	/**
	 * @return Returns the container of the player if he has a container gui open. Returns the inventory container if none is open
	 */
	IContainer getOpenContainer();

	boolean canQuestBeAccepted(int id);

	@Deprecated //Use ICustomGui.open()
	void showCustomGui(ICustomGui gui);
	
	/**
	 * @return Returns the currently opened custom gui
	 */
	ICustomGui getCustomGui();

	/**
	 * Fires trigger event for player scripts
	 * @param id, Id for the event
	 * @param arguments, arguments you can give with it
	 */
	void trigger(int id, Object... arguments);

	boolean isOp();

	int getScreenWidth();
	int getScreenHeight();

	void openWebsite(String url);
}
