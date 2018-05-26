package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelActivatingReaction;


public interface IModelActivatingReactionDAO {
	
	public void addModelActivatingReaction(ModelActivatingReaction modelActivatingReaction); 
	
	public void addModelActivatingReactionList(List<ModelActivatingReaction> modelActivatingReactionList); 
	
	public List<ModelActivatingReaction> getAllModelActivatingReaction(); 
	
	public ModelActivatingReaction getModelActivatingReaction(Integer id); 
	
	public void removeModelActivatingReaction(ModelActivatingReaction modelActivatingReaction); 
	
	public void removeModelActivatingReactionList(List<ModelActivatingReaction> modelActivatingReactionList); 
	
	public void updateModelActivatingReactionList(List<ModelActivatingReaction> modelActivatingReactionList); 
	
	public void updateModelActivatingReaction(ModelActivatingReaction modelActivatingReaction);
}
