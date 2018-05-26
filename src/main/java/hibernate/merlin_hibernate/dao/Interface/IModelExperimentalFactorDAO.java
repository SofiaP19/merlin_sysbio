package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelExperimentalFactor;


public interface IModelExperimentalFactorDAO {
	
	public void addModelExperimentalFactor(ModelExperimentalFactor modelExperimentalFactor); 
	
	public void addModelExperimentalFactorList(List<ModelExperimentalFactor> modelExperimentalFactorList); 
	
	public List<ModelExperimentalFactor> getAllModelExperimentalFactor(); 
	
	public ModelExperimentalFactor getModelExperimentalFactor(Integer id); 
	
	public void removeModelExperimentalFactor(ModelExperimentalFactor modelExperimentalFactor); 
	
	public void removeModelExperimentalFactorList(List<ModelExperimentalFactor> modelExperimentalFactorList); 
	
	public void updateModelExperimentalFactorList(List<ModelExperimentalFactor> modelExperimentalFactorList); 
	
	public void updateModelExperimentalFactor(ModelExperimentalFactor modelExperimentalFactor);
}
