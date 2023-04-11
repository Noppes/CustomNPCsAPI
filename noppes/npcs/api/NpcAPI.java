package noppes.npcs.api;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.Container;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import noppes.npcs.api.block.IBlock;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IEntity;
import noppes.npcs.api.entity.IPlayer;
import noppes.npcs.api.entity.data.IPlayerMail;
import noppes.npcs.api.gui.ICustomGui;
import noppes.npcs.api.handler.*;
import noppes.npcs.api.item.IItemStack;

import java.io.File;

/**
 * Note this API should only be used Server side not on the client
 *
 */
public abstract class NpcAPI {	
	private static NpcAPI instance = null;
		
	/**
	 * Doesnt spawn the npc in the world
	 */
	public abstract ICustomNpc createNPC(Level world);
	
	/**
	 * Creates and spawns an npc
	 */
	public abstract ICustomNpc spawnNPC(Level level, int x, int y, int z);


	public abstract IEntity getIEntity(Entity entity);

	public abstract IBlock getIBlock(Level level, BlockPos pos);

	public abstract IContainer getIContainer(Container container);

	public abstract IContainer getIContainer(AbstractContainerMenu container);
	
	public abstract IItemStack getIItemStack(ItemStack itemstack);
	
	public abstract IWorld getIWorld(ServerLevel world);

	/**
	 * @param dimension 'minecraft:overworld', 'minecraft:the_nether', 'minecraft:the_end'
	 */
	public abstract IWorld getIWorld(String dimension);

	public abstract IWorld getIWorld(DimensionType dimension);

	public abstract IWorld[] getIWorlds();

	public abstract INbt getINbt(CompoundTag compound);

	public abstract IPos getIPos(double x, double y, double z);
	
	public abstract IFactionHandler getFactions();
	
	public abstract IRecipeHandler getRecipes();
	
	public abstract IQuestHandler getQuests();
	
	public abstract IDialogHandler getDialogs();
	
	public abstract ICloneHandler getClones();

	public abstract IDamageSource getIDamageSource(DamageSource damagesource);

	public abstract INbt stringToNbt(String str);
	
	public abstract IPlayerMail createMail(String sender, String subject);

	/**
	 * @author Ryan
	 */
	public abstract ICustomGui createCustomGui(int id, int width, int height, boolean pauseGame, IPlayer player);
	
	/**
	 * Get player data even if they are offline
	 * @param uuid
	 * @return
	 */
	public abstract INbt getRawPlayerData(String uuid);
	
	/**
	 * Used by modders
	 * @return The event bus where you register CustomNPCEvents
	 */
	public abstract IEventBus events();
	
	
	/**
	 * Use to register your own /noppes subcommand
	 */
	//public abstract void registerCommand(CommandNoppesBase command);

	/**
	 * @return Returns the .minecraft/customnpcs folder or [yourserverfolder]/customnpcs
	 */
	public abstract File getGlobalDir();

	/**
	 * @return Returns the .minecraft/saves/[yourworld]/customnpcs folder or [yourserverfolder]/[yourworld]/customnpcs
	 */
	public abstract File getLevelDir();
			
	public static boolean IsAvailable(){
		return ModList.get().isLoaded("customnpcs");
	}
	
	public static NpcAPI Instance(){
		if(instance != null)
			return instance;

		if(!IsAvailable())
			return null;
		
		try {
			Class c = Class.forName("noppes.npcs.api.wrapper.WrapperNpcAPI");

			instance = (NpcAPI) c.getMethod("Instance").invoke(null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}

	public abstract boolean hasPermissionNode(String permission);

	/**
	 * @param world The world in which the command is executed
	 * @param command The Command to execute
	 * @return
	 */
	public abstract String executeCommand(IWorld world, String command);
	
	/**
	 * @author Nikedemos
	 * @param dictionary 0:roman, 1:japanese, 2:slavic, 3:welsh, 4:saami, 5:old-norse, 6:ancient-greek, 7:aztec, 8:classic-cnpcs, 9:spanish
	 * @param gender 0:random, 1:male, 2:female
	 * @return Returns a randomly generated name
	 */
	public abstract String getRandomName(int dictionary, int gender);
}
