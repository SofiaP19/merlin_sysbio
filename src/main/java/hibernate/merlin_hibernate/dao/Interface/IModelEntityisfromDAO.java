package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelEntityisfrom;

public interface IModelEntityisfromDAO {
	
	public void addModelEntityisfrom(ModelEntityisfrom modelEntityisfrom); 
	
	public void addModelEntityisfromList(List<ModelEntityisfrom> modelEntityisfromList); 
	
	public List<ModelEntityisfrom> getAllModelEntityisfrom(); 
	
	public ModelEntityisfrom getModelEntityisfrom(Integer id); 
	
	public void removeModelEntityisfrom(ModelEntityisfrom modelEntityisfrom); 
	
	public void removeModelEntityisfromList(List<ModelEntityisfrom> modelEntityisfromList); 
	
	public void updateModelEntityisfromist(List<ModelEntityisfrom> modelEntityisfromList); 
	
	public void updateModelEntityisfrom(ModelEntityisfrom modelEntityisfrom);
}
