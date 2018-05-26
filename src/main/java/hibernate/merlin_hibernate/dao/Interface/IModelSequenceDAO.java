package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelSequence;


public interface IModelSequenceDAO {
	
	public void addModelSequence(ModelSequence modelSequence); 
	
	public void addModelSequenceList(List<ModelSequence> modelSequenceList); 
	
	public List<ModelSequence> getAllModelSequence(); 
	
	public ModelSequence getModelSequence(Integer id); 
	
	public void removeModelSequence(ModelSequence modelSequence); 
	
	public void removeModelSequenceList(List<ModelSequence> modelSequenceList); 
	
	public void updateModelSequenceList(List<ModelSequence> modelSequenceList); 
	
	public void updateModelSequence(ModelSequence modelSequence);

}
