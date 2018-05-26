package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelEnzymaticAlternativeCofactor;


public interface IModelEnzymaticAlternativeCofactorDAO {
	
	public void addModelEnzymaticAlternativeCofactor(ModelEnzymaticAlternativeCofactor modelEnzymaticAlternativeCofactor); 
	
	public void addModelEnzymaticAlternativeCofactorList(List<ModelEnzymaticAlternativeCofactor> modelEnzymaticAlternativeCofactorList); 
	
	public List<ModelEnzymaticAlternativeCofactor> getAllModelEnzymaticAlternativeCofactor(); 
	
	public ModelEnzymaticAlternativeCofactor getModelEnzymaticAlternativeCofactor(Integer id); 
	
	public void removeModelEnzymaticAlternativeCofactor(ModelEnzymaticAlternativeCofactor modelEnzymaticAlternativeCofactor); 
	
	public void removeModelEnzymaticAlternativeCofactorList(List<ModelEnzymaticAlternativeCofactor> modelEnzymaticAlternativeCofactorList); 
	
	public void updateModelEnzymaticAlternativeCofactorList(List<ModelEnzymaticAlternativeCofactor> modelEnzymaticAlternativeCofactorList); 
	
	public void updateModelEnzymaticAlternativeCofactor(ModelEnzymaticAlternativeCofactor modelEnzymaticAlternativeCofactor);

}
