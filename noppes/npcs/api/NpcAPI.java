package noppes.npcs.api;

import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventBus;
import noppes.npcs.api.block.IBlock;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IEntity;

/**
 * Note this API should only be used Server side not on the client
 *
 */
public abstract class NpcAPI {	
	private static NpcAPI instance = null;
		
	public abstract ICustomNpc createNPC(World world);

	public abstract IEntity getIEntity(Entity entity);

	public abstract IBlock getIBlock(World world, BlockPos pos);
	
	public abstract EventBus events();
			
	public static boolean IsAvailable(){
		return Loader.isModLoaded("customnpcs");
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
	
}
