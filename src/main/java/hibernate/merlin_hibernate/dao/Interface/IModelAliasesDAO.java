package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelAliases;


public interface IModelAliasesDAO {
	
	public void addModelAliases(ModelAliases modelAliases); 
	
	public void addModelAliasesList(List<ModelAliases> modelAliasesList); 
	
	public List<ModelAliases> getAllModelAliases(); 
	
	public ModelAliases getModelAliases(Integer id); 
	
	public void removeModelAliases(ModelAliases modelAliases); 
	
	public void removeModelAliasesList(List<ModelAliases> modelAliasesList); 
	
	public void updateModelAliasesList(List<ModelAliases> modelAliasesList); 
	
	public void updateModelAliases(ModelAliases modelAliases);
}
