package noppes.npcs.api.entity.data;

/**
 * Returns objects from the Pixelmon API see <a href="https://reforged.gg/docs/">https://reforged.gg/docs/</a>
 * 
 * For API information with Pixelmon Generations join https://discord.gg/mesAfQNf
 */
public interface IPixelmonPlayerData {

	/**
	 * Returns <a href="https://reforged.gg/docs/com/pixelmonmod/pixelmon/api/storage/PartyStorage.html">PartyStorage</a>
	 */
	public Object getParty();

	/**
	 * Returns <a href="https://reforged.gg/docs/com/pixelmonmod/pixelmon/api/storage/PCStorage.html">PCStorage</a>
	 */
	public Object getPC();
	
}
