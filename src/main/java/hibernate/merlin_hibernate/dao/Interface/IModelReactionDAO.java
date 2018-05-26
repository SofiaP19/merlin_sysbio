package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelReaction;

public interface IModelReactionDAO {

	public void addModelReaction(ModelReaction modelReaction); 
	
	public void addModelReactionList(List<ModelReaction> modelReaction); 
	
	public List<ModelReaction> getAllModelReaction(); 
	
	public ModelReaction getModelReaction(Integer id); 
	
	public void removeModelReaction(ModelReaction modelReaction); 
	
	public void removeModelReactionList(List<ModelReaction> modelReactionList); 
	
	public void updateModelReactionList(List<ModelReaction> modelReactionList); 
	
	public void updateModelReaction(ModelReaction ModelReaction);
}
