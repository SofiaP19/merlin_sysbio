package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelCompound;



public interface IModelCompoundDAO {
	
	public void addModelCompound(ModelCompound modelCompound); 
	
	public void addModelCompoundList(List<ModelCompound> modelCompoundList); 
	
	public List<ModelCompound> getAllModelCompound(); 
	
	public ModelCompound getModelCompound(Integer id); 
	
	public void removeModelCompound(ModelCompound modelCompound); 
	
	public void removeModelCompoundList(List<ModelCompound> modelCompoundList); 
	
	public void updateModelCompoundList(List<ModelCompound> modelCompoundList); 
	
	public void updateModelCompound(ModelCompound modelCompound);
}
