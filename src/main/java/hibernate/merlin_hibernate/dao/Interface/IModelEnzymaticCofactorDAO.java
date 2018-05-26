package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelEnzymaticCofactor;


public interface IModelEnzymaticCofactorDAO {

	public void addModelEnzymaticCofactor(ModelEnzymaticCofactor modelEnzymaticCofactor); 
	
	public void addModelEnzymaticCofactorList(List<ModelEnzymaticCofactor> modelEnzymaticCofactorList); 
	
	public List<ModelEnzymaticCofactor> getAllModelEnzymaticCofactor(); 
	
	public ModelEnzymaticCofactor getModelEnzymaticCofactor(Integer id); 
	
	public void removeModelEnzymaticCofactor(ModelEnzymaticCofactor modelEnzymaticCofactor); 
	
	public void removeModelEnzymaticCofactorList(List<ModelEnzymaticCofactor> modelEnzymaticCofactorList); 
	
	public void updateModelEnzymaticCofactorList(List<ModelEnzymaticCofactor> modelEnzymaticCofactorList); 
	
	public void updateModelEnzymaticCofactor(ModelEnzymaticCofactor modelEnzymaticCofactor);
}
