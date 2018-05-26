package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelProtein;



public interface IModelProteinDAO {

	public void addModelProtein(ModelProtein modelProtein); 
	
	public void addModelProteinList(List<ModelProtein> modelProteinList); 
	
	public List<ModelProtein> getAllModelProtein(); 
	
	public ModelProtein getModelProtein(Integer id); 
	
	public void removeModelProtein(ModelProtein modelProtein); 
	
	public void removeModelProteinList(List<ModelProtein> modelProteinList); 
	
	public void updateModelProteinList(List<ModelProtein> modelProteinList); 
	
	public void updateModelProtein(ModelProtein modelProtein);
}
