package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelRegulatoryEvent;
import hibernate.merlin_hibernate.dao.Interface.IModelRegulatoryEventDAO;

public class ModelRegulatoryEventDAOImpl extends GenericDaoImpl<ModelRegulatoryEvent> implements IModelRegulatoryEventDAO{

	public ModelRegulatoryEventDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelRegulatoryEvent.class);
		
	}

	public void addModelRegulatoryEvent(ModelRegulatoryEvent modelRegulatoryEvent) {
		super.save(modelRegulatoryEvent);
		
	}

	public void addModelRegulatoryEventList(List<ModelRegulatoryEvent> modelRegulatoryEventList) {
		for (ModelRegulatoryEvent modelRegulatoryEvent: modelRegulatoryEventList) {
			this.addModelRegulatoryEvent(modelRegulatoryEvent);
		}
		
	}

	public List<ModelRegulatoryEvent> getAllModelGene() {
		return super.findAll();
	}

	public ModelRegulatoryEvent getModelRegulatoryEvent(Integer id) {
		return super.findById(id);
	}

	public void removeModelRegulatoryEvent(ModelRegulatoryEvent modelRegulatoryEvent) {
		super.delete(modelRegulatoryEvent);
		
	}

	public void removeModelRegulatoryEventList(List<ModelRegulatoryEvent> modelRegulatoryEventList) {
		for (ModelRegulatoryEvent modelRegulatoryEvent: modelRegulatoryEventList) {
			this.removeModelRegulatoryEvent(modelRegulatoryEvent);
		}
		
	}

	public void updateModelRegulatoryEventList(List<ModelRegulatoryEvent> modelRegulatoryEventList) {
		for (ModelRegulatoryEvent modelRegulatoryEvent: modelRegulatoryEventList) {
			this.update(modelRegulatoryEvent);
		}
		
	}

	public void updateModelRegulatoryEvent(ModelRegulatoryEvent modelRegulatoryEvent) {
		super.update(modelRegulatoryEvent);
		
	}

}
