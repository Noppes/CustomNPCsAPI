package noppes.npcs.api;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

/**
 * @author Karel
 *
 */
public interface INbt {
	
	public void remove(String key);

	public boolean has(String key);

	public boolean getBoolean(String key);

	public void setBoolean(String key, boolean value);

	public short getShort(String key);

	public void setShort(String key, short value);

	public int getInteger(String key);

	public void setInteger(String key, int value);

	public byte getByte(String key);

	public void setByte(String key, byte value);

	public long getLong(String key);

	public void setLong(String key, long value);

	public double getDouble(String key);

	public void setDouble(String key, double value);

	public float getFloat(String key);

	public void setFloat(String key, float value);

	public String getString(String key);

	public void setString(String key, String value);

	public byte[] getByteArray(String key);

	public void setByteArray(String key, byte[] value);

	public int[] getIntegerArray(String key);

	public void setIntegerArray(String key, int[] value);

	/**
	 * @param key
	 * @param type The Type of the list 3:Integer, 5:Float, 6:Double, 8:String,
	 *             10:INbt, 11:Integer[]
	 * @return
	 */
	public Object[] getList(String key, int type);

	/**
	 * @param key
	 * @return 3:Integer, 5:Float, 6:Double, 8:String, 10:INbt, 11:Integer[]
	 */
	public int getListType(String key);

	public void setList(String key, Object[] value);

	public INbt getCompound(String key);

	public void setCompound(String key, INbt value);

	public String[] getKeys();

	/**
	 * @param key
	 * @return 1:Byte, 2:Short 3:Integer, 4:Long, 5:Float, 6:Double, 7:Byte[],
	 *         8:String, 9:List, 10:INbt, 11:Integer[]
	 */
	public int getType(String key);

	public NBTTagCompound getMCNBT();

	public String toJsonString();

	/**
	 * Compares if two nbt tags are the same/contain the same data
	 */
	public boolean isEqual(INbt nbt);

	/**
	 * Clears all tags
	 */
	public void clear();

	/**
	 * Merges two nbt tabs, note that nbt tags will be overwritten if they have the
	 * same keys
	 */
	public void merge(INbt nbt);

	public void mcSetTag(String key, NBTBase base);
	
	public NBTBase mcGetTag(String key);
}
