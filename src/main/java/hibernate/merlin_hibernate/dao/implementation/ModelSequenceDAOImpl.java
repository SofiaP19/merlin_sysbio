package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelSequence;
import hibernate.merlin_hibernate.dao.Interface.IModelSequenceDAO;

public class ModelSequenceDAOImpl extends GenericDaoImpl<ModelSequence> implements IModelSequenceDAO{

	public ModelSequenceDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelSequence.class);
	
	}

	public void addModelSequence(ModelSequence modelSequence) {
		super.save(modelSequence);
		
	}

	public void addModelSequenceList(List<ModelSequence> modelSequenceList) {
		for (ModelSequence modelSequence: modelSequenceList) {
			this.addModelSequence(modelSequence);
		}
		
	}

	public List<ModelSequence> getAllModelSequence() {
		return super.findAll();
	}

	public ModelSequence getModelSequence(Integer id) {
		return super.findById(id);
	}

	public void removeModelSequence(ModelSequence modelSequence) {
		super.delete(modelSequence);
		
	}

	public void removeModelSequenceList(List<ModelSequence> modelSequenceList) {
		for (ModelSequence modelSequence: modelSequenceList) {
			this.removeModelSequence(modelSequence);
		}
		
	}

	public void updateModelSequenceList(List<ModelSequence> modelSequenceList) {
		for (ModelSequence modelSequence: modelSequenceList) {
			this.update(modelSequence);
		}
		
	}

	public void updateModelSequence(ModelSequence modelSequence) {
		super.update(modelSequence);
	}

}
