package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelDblinks;



public interface IModelDblinksDAO {
	
	public void addModelDblinks(ModelDblinks modelDblinks); 
	
	public void addModelDblinksList(List<ModelDblinks> modelDblinksList); 
	
	public List<ModelDblinks> getAllModelDblinks(); 
	
	public ModelDblinks getModelDblinks(Integer id); 
	
	public void removeModelDblinks(ModelDblinks modelDblinks); 
	
	public void removeModelDblinksList(List<ModelDblinks> modelDblinksList); 
	
	public void updateModelDblinksList(List<ModelDblinks> modelDblinksList); 
	
	public void updateModelDblinks(ModelDblinks modelDblinks);
}
