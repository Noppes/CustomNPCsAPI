package noppes.npcs.api.entity;

import net.minecraft.entity.passive.TameableEntity;

public interface IPixelmon<T extends TameableEntity> extends IAnimal<T> {

	/**
	 * Returns a <a href="https://reforged.gg/docs/com/pixelmonmod/pixelmon/api/pokemon/Pokemon.html">Pokemon</a> object
	 */
	public Object getPokemonData();
	
}
