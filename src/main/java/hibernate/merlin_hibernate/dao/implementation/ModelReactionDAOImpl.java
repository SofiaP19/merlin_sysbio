package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelReaction;
import hibernate.merlin_hibernate.dao.Interface.IModelReactionDAO;


public class ModelReactionDAOImpl extends GenericDaoImpl<ModelReaction> implements IModelReactionDAO {

	public ModelReactionDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelReaction.class);
		
	}

	public void addModelReaction(ModelReaction modelReaction) {
		super.save(modelReaction);
		
	}

	public void addModelReactionList(List<ModelReaction> modelReactionList) {
		for (ModelReaction modelReaction: modelReactionList) {
			this.addModelReaction(modelReaction);
		}
		
	}

	public List<ModelReaction> getAllModelReaction() {
		return super.findAll();
	}

	public ModelReaction getModelReaction(Integer id) {
		return super.findById(id);
	}

	public void removeModelReaction(ModelReaction modelReaction) {
		super.delete(modelReaction);
		
	}

	public void removeModelReactionList(List<ModelReaction> modelReactionList) {
		for (ModelReaction modelReaction: modelReactionList) {
			this.removeModelReaction(modelReaction);
		}
		
	}

	public void updateModelReactionList(List<ModelReaction> modelReactionList) {
		for (ModelReaction modelReaction: modelReactionList) {
			this.update(modelReaction);
		}
		
	}

	public void updateModelReaction(ModelReaction modelReaction) {
		super.update(modelReaction);
		
	}

}
