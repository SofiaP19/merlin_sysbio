package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelStoichiometry;



public interface IModelStoichiometryDAO {
	
	public void addModelStoichiometry(ModelStoichiometry modelStoichiometry); 
	
	public void addModelStoichiometryList(List<ModelStoichiometry> modelStoichiometryList); 
	
	public List<ModelStoichiometry> getAllModelStoichiometry(); 
	
	public ModelStoichiometry getModelStoichiometry(Integer id); 
	
	public void removeModelStoichiometry(ModelStoichiometry modelStoichiometry); 
	
	public void removeModelStoichiometryList(List<ModelStoichiometry> modelStoichiometryList); 
	
	public void updateModelStoichiometryList(List<ModelStoichiometry> modelStoichiometryList); 
	
	public void updateModelStoichiometry(ModelStoichiometry modelStoichiometry);

}
