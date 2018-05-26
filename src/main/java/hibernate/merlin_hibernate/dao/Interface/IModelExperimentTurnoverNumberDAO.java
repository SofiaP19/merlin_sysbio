package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelExperimentTurnoverNumber;


public interface IModelExperimentTurnoverNumberDAO {
	
	public void addModelExperimentTurnoverNumber(ModelExperimentTurnoverNumber modelExperimentTurnoverNumber); 
	
	public void addModelExperimentTurnoverNumberList(List<ModelExperimentTurnoverNumber> modelExperimentTurnoverNumberList); 
	
	public List<ModelExperimentTurnoverNumber> getAllModelExperimentTurnoverNumber(); 
	
	public ModelExperimentTurnoverNumber getModelExperimentTurnoverNumber(Integer id); 
	
	public void removeModelExperimentTurnoverNumber(ModelExperimentTurnoverNumber modelExperimentTurnoverNumber); 
	
	public void removeModelExperimentTurnoverNumberList(List<ModelExperimentTurnoverNumber> modelExperimentTurnoverNumberList); 
	
	public void updateModelExperimentTurnoverNumberList(List<ModelExperimentTurnoverNumber> modelExperimentTurnoverNumberList); 
	
	public void updateModelExperimentTurnoverNumber(ModelExperimentTurnoverNumber modelExperimentTurnoverNumber);
}
