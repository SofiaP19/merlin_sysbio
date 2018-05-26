package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelEffector;



public interface IModelEffectorDAO {
	
	public void addModelEffector(ModelEffector modelEffector); 
	
	public void addModelEffectorList(List<ModelEffector> modelEffectorList); 
	
	public List<ModelEffector> getAllModelEffector(); 
	
	public ModelEffector getModelEffector(Integer id); 
	
	public void removeModelEffector(ModelEffector modelEffector); 
	
	public void removeModelEffectorList(List<ModelEffector> modelEffectorList); 
	
	public void updateModelEffectorList(List<ModelEffector> modelEffectorList); 
	
	public void updateModelEffector(ModelEffector modelEffector);
}
