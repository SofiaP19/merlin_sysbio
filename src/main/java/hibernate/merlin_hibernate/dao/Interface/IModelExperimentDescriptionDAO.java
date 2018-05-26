package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelExperimentDescription;



public interface IModelExperimentDescriptionDAO {

	public void addModelExperimentDescription(ModelExperimentDescription modelExperimentDescription); 
	
	public void addModelExperimentDescriptionList(List<ModelExperimentDescription> modelExperimentDescriptionList); 
	
	public List<ModelExperimentDescription> getAllModelExperimentDescription(); 
	
	public ModelExperimentDescription getModelExperimentDescription(Integer id); 
	
	public void removeModelExperimentDescription(ModelExperimentDescription modelExperimentDescription); 
	
	public void removeModelExperimentDescriptionList(List<ModelExperimentDescription> modelExperimentDescriptionList); 
	
	public void updateModelExperimentDescriptionList(List<ModelExperimentDescription> modelExperimentDescriptionList); 
	
	public void updateModelExperimentDescription(ModelExperimentDescription modelExperimentDescription);
}
