package hibernate.merlin_hibernate.dao.Interface;

import java.util.List;

import hibernate.merlin_hibernate.entities.ModelRegulatoryEvent;

public interface IModelRegulatoryEventDAO {

	public void addModelRegulatoryEvent(ModelRegulatoryEvent modelRegulatoryEvent); 
	
	public void addModelRegulatoryEventList(List<ModelRegulatoryEvent> modelRegulatoryEventList); 
	
	public List<ModelRegulatoryEvent> getAllModelGene(); 
	
	public ModelRegulatoryEvent getModelRegulatoryEvent(Integer id); 
	
	public void removeModelRegulatoryEvent(ModelRegulatoryEvent modelRegulatoryEvent); 
	
	public void removeModelRegulatoryEventList(List<ModelRegulatoryEvent> modelRegulatoryEventList); 
	
	public void updateModelRegulatoryEventList(List<ModelRegulatoryEvent> modelRegulatoryEventList); 
	
	public void updateModelRegulatoryEvent(ModelRegulatoryEvent modelRegulatoryEvent);
}
