package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelIsSuperReaction;



public interface IModelIsSuperReactionDAO {

	public void addModelIsSuperReaction(ModelIsSuperReaction modelIsSuperReaction); 
	
	public void addModelIsSuperReactionList(List<ModelIsSuperReaction> modelIsSuperReactionList); 
	
	public List<ModelIsSuperReaction> getAllModelIsSuperReaction(); 
	
	public ModelIsSuperReaction getModelIsSuperReaction(Integer id); 
	
	public void removeModelIsSuperReaction(ModelIsSuperReaction modelIsSuperReaction); 
	
	public void removeModelIsSuperReactionList(List<ModelIsSuperReaction> modelIsSuperReactionList); 
	
	public void updateModelIsSuperReactionList(List<ModelIsSuperReaction> modelIsSuperReactionList); 
	
	public void updateModelIsSuperReaction(ModelIsSuperReaction modelIsSuperReaction);
}
