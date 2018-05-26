package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelExperimentInhibitor;



public interface IModelExperimentInhibitorDAO {

	public void addModelExperimentInhibitor(ModelExperimentInhibitor modelExperimentInhibitor); 
	
	public void addModelExperimentInhibitorList(List<ModelExperimentInhibitor> modelExperimentInhibitorList); 
	
	public List<ModelExperimentInhibitor> getAllModelExperimentInhibitor(); 
	
	public ModelExperimentInhibitor getModelExperimentInhibitor(Integer id); 
	
	public void removeModelExperimentInhibitor(ModelExperimentInhibitor modelExperimentInhibitor); 
	
	public void removeModelExperimentInhibitorList(List<ModelExperimentInhibitor> modelExperimentInhibitorList); 
	
	public void updateModelExperimentInhibitorList(List<ModelExperimentInhibitor> modelExperimentInhibitorList); 
	
	public void updateModelExperimentInhibitor(ModelExperimentInhibitor modelExperimentInhibitor);
}
