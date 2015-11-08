package noppes.npcs.api.entity;

public interface IPixelmon extends IAnimal{

	public boolean getIsShiny();

	public void setIsShiny(boolean bo);

	public int getLevel();

	public void setLevel(int level);

	/**
	 * @param type 0:HP, 1:Attack, 2:Defense, 3:SpAttack, 4:SpDefense, 5:Speed
	 */
	public int getIV(int type);
	
	/**
	 * @param type 0:HP, 1:Attack, 2:Defense, 3:SpAttack, 4:SpDefense, 5:Speed
	 */
	public void setIV(int type, int value);

	/**
	 * @param type 0:HP, 1:Attack, 2:Defense, 3:SpAttack, 4:SpDefense, 5:Speed
	 */
	public int getEV(int type);

	/**
	 * @param type 0:HP, 1:Attack, 2:Defense, 3:SpAttack, 4:SpDefense, 5:Speed
	 */
	public void setEV(int type, int value);

	/**
	 * @param type 0:HP, 1:Attack, 2:Defense, 3:SpAttack, 4:SpDefense, 5:Speed
	 */
	public int getStat(int type);

	/**
	 * @param type 0:HP, 1:Attack, 2:Defense, 3:SpAttack, 4:SpDefense, 5:Speed
	 */
	public void setStat(int type, int value);

	/**
	 * @return type 0:Pygmy, 1:Runt, 2:Small, 3:Normal, 4:Huge, 5:Giant, 6:Enormous, 7:Ginormous, 8:Microscopic
	 */
	public int getSize();

	/**
	 * @param type 0:Pygmy, 1:Runt, 2:Small, 3:Normal, 4:Huge, 5:Giant, 6:Enormous, 7:Ginormous, 8:Microscopic
	 */
	public void setSize(int type);

	/**
	 * @return 0-255
	 */
	public int getHapiness();

	/**
	 * @param value 0-255
	 */
	public void setHapiness(int value);

	/**
	 * @return 0:Hardy, 1:Serious, 2:Docile, 3:Bashful, 4:Quirky, 5:Lonely, 6:Brave, 7:Adamant, 8:Naughty, 9:Bold, 10:Relaxed, 11:Impish, 12:Lax, 13:Timid, 14:Hasty, 15:Jolly, 16:Naive, 17:Modest, 18:Mild, 19:Quiet, 20:Rash, 21:Calm, 22:Gentle, 23:Sassy, 24:Careful
	 */
	public int getNature();

	/**
	 * @param type 0:Hardy, 1:Serious, 2:Docile, 3:Bashful, 4:Quirky, 5:Lonely, 6:Brave, 7:Adamant, 8:Naughty, 9:Bold, 10:Relaxed, 11:Impish, 12:Lax, 13:Timid, 14:Hasty, 15:Jolly, 16:Naive, 17:Modest, 18:Mild, 19:Quiet, 20:Rash, 21:Calm, 22:Gentle, 23:Sassy, 24:Careful
	 */
	public void setNature(int type);

	/**
	 * @return -1:Uncaught, 0:Pokeball, 1:GreatBall, 2:UltraBall, 3:MasterBall, 4:LevelBall, 5:MoonBall, 6:FriendBall, 7:LoveBall, 8:SafariBall, 9:HeavyBall, 10:FastBall, 11:RepeatBall, 12:TimerBall, 13:NestBall, 14:NetBall, 15:DiveBall, 16:LuxuryBall, 17:HealBall, 18:DuskBall, 19:PremierBall, 20:SportBall, 21:QuickBall, 22:ParkBall, 23:LureBall, 24:CherishBall, 25:GSBall
	 */
	public int getPokeball();

	/**
	 * @param type -1:Uncaught, 0:Pokeball, 1:GreatBall, 2:UltraBall, 3:MasterBall, 4:LevelBall, 5:MoonBall, 6:FriendBall, 7:LoveBall, 8:SafariBall, 9:HeavyBall, 10:FastBall, 11:RepeatBall, 12:TimerBall, 13:NestBall, 14:NetBall, 15:DiveBall, 16:LuxuryBall, 17:HealBall, 18:DuskBall, 19:PremierBall, 20:SportBall, 21:QuickBall, 22:ParkBall, 23:LureBall, 24:CherishBall, 25:GSBall
	 */
	public void setPokeball(int type);

	public String getNickname();

	public boolean hasNickname();

	public void setNickname(String name);

	public String getMove(int slot);

	public void setMove(int slot, String move);

}
