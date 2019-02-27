package noppes.npcs.api.entity;

import net.minecraft.entity.passive.EntityTameable;

public interface IPixelmon<T extends EntityTameable> extends IAnimal<T> {

	/**
	 * Returns a <a href="https://reforged.gg/docs/com/pixelmonmod/pixelmon/api/pokemon/Pokemon.html">Pokemon</a> object
	 */
	public Object getPokemonData();
	
}
