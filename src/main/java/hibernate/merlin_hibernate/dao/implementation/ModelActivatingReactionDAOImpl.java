package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.ModelActivatingReaction;
import hibernate.merlin_hibernate.dao.Interface.IModelActivatingReactionDAO;

public class ModelActivatingReactionDAOImpl extends GenericDaoImpl<ModelActivatingReaction> implements IModelActivatingReactionDAO {

	public ModelActivatingReactionDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelActivatingReaction.class);
		
	}

	public void addModelActivatingReaction(ModelActivatingReaction modelActivatingReaction) {
		super.save(modelActivatingReaction);
		
	}

	public void addModelActivatingReactionList(List<ModelActivatingReaction> modelActivatingReactionList) {
		for (ModelActivatingReaction modelActivatingReaction: modelActivatingReactionList) {
			this.addModelActivatingReaction(modelActivatingReaction);
		}
		
	}

	public List<ModelActivatingReaction> getAllModelActivatingReaction() {
		return super.findAll();
	}

	public ModelActivatingReaction getModelActivatingReaction(Integer id) {
		return super.findById(id);
	}

	public void removeModelActivatingReaction(ModelActivatingReaction modelActivatingReaction) {
		super.delete(modelActivatingReaction);
		
	}

	public void removeModelActivatingReactionList(List<ModelActivatingReaction> modelActivatingReactionList) {
		for (ModelActivatingReaction modelActivatingReaction: modelActivatingReactionList) {
			this.removeModelActivatingReaction(modelActivatingReaction);
		}
		
	}

	public void updateModelActivatingReactionList(List<ModelActivatingReaction> modelActivatingReactionList) {
		for (ModelActivatingReaction modelActivatingReaction: modelActivatingReactionList) {
			this.update(modelActivatingReaction);
		}
		
	}

	public void updateModelActivatingReaction(ModelActivatingReaction modelActivatingReaction) {
		super.update(modelActivatingReaction);
		
	}

}
