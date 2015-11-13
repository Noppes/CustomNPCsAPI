package noppes.npcs.api.handler;

import java.util.List;

import noppes.npcs.api.handler.data.IRecipe;

public interface IRecipeHandler {
	
	public List<IRecipe> getGlobalList();
	
	public List<IRecipe> getCarpentryList();
	
	public IRecipe delete(int id);
}
