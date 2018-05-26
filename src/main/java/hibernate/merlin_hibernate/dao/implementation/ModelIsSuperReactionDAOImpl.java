package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;


import hibernate.merlin_hibernate.entities.ModelIsSuperReaction;
import hibernate.merlin_hibernate.dao.Interface.IModelIsSuperReactionDAO;

public class ModelIsSuperReactionDAOImpl extends GenericDaoImpl<ModelIsSuperReaction> implements IModelIsSuperReactionDAO {

	public ModelIsSuperReactionDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelIsSuperReaction.class);
		
	}

	public void addModelIsSuperReaction(ModelIsSuperReaction modelIsSuperReaction) {
		super.save(modelIsSuperReaction);
		
	}

	public void addModelIsSuperReactionList(List<ModelIsSuperReaction> modelIsSuperReactionList) {
		for (ModelIsSuperReaction modelIsSuperReaction: modelIsSuperReactionList) {
			this.addModelIsSuperReaction(modelIsSuperReaction);
		}
		
	}

	public List<ModelIsSuperReaction> getAllModelIsSuperReaction() {
		return super.findAll();
	}

	public ModelIsSuperReaction getModelIsSuperReaction(Integer id) {
		return super.findById(id);
	}

	public void removeModelIsSuperReaction(ModelIsSuperReaction modelIsSuperReaction) {
		super.delete(modelIsSuperReaction);
	}

	public void removeModelIsSuperReactionList(List<ModelIsSuperReaction> modelIsSuperReactionList) {
		for (ModelIsSuperReaction modelIsSuperReaction: modelIsSuperReactionList) {
			this.removeModelIsSuperReaction(modelIsSuperReaction);
		}
		
	}

	public void updateModelIsSuperReactionList(List<ModelIsSuperReaction> modelIsSuperReactionList) {
		for (ModelIsSuperReaction modelIsSuperReaction: modelIsSuperReactionList) {
			this.update(modelIsSuperReaction);
		}
		
	}

	public void updateModelIsSuperReaction(ModelIsSuperReaction modelIsSuperReaction) {
		super.update(modelIsSuperReaction);
		
	}


		

}
