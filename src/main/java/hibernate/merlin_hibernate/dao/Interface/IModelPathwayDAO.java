package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelPathway;


public interface IModelPathwayDAO {

	public void addModelPathway(ModelPathway modelPathway); 
	
	public void addModelPathwayList(List<ModelPathway> modelPathwayList); 
	
	public List<ModelPathway> getAllModelPathway(); 
	
	public ModelPathway getModelPathway(Integer id); 
	
	public void removeModelPathway(ModelPathway modelPathway); 
	
	public void removeModelPathwayList(List<ModelPathway> modelPathwayList); 
	
	public void updateModelPathwayList(List<ModelPathway> modelPathwayList); 
	
	public void updateModelPathway(ModelPathway modelPathway);
}
