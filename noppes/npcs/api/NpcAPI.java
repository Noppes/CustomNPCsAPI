package noppes.npcs.api;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Loader;
import noppes.npcs.api.entity.ICustomNpc;
import noppes.npcs.api.entity.IEntity;

/**
 * Note this API should only be used Server side not on the client
 *
 */
public abstract class NpcAPI {
	private static final float ApiVersion = 0.1f;

	private static NpcAPI instance = null;
		
	public abstract ICustomNpc createNPC(World world);

	public abstract IEntity getEntityInterface(Entity entity);
	
	public abstract float getApiVersion();
		
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
			
			if(ApiVersion != instance.getApiVersion()){
				FMLLog.warning("CustomNPCS API version(%f) and mod using the API version(%f) are differnt. "
						+ "This can cause issues", ApiVersion, instance.getApiVersion());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}
	
}
