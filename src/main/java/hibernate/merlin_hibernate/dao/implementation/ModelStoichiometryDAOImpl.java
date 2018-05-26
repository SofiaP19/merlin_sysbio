package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelStoichiometry;
import hibernate.merlin_hibernate.dao.Interface.IModelStoichiometryDAO;

public class ModelStoichiometryDAOImpl extends GenericDaoImpl<ModelStoichiometry> implements IModelStoichiometryDAO {

	public ModelStoichiometryDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelStoichiometry.class);
		
	}

	public void addModelStoichiometry(ModelStoichiometry modelStoichiometry) {
		super.save(modelStoichiometry);
		
	}

	public void addModelStoichiometryList(List<ModelStoichiometry> modelStoichiometryList) {
		for (ModelStoichiometry modelStoichiometry: modelStoichiometryList) {
			this.addModelStoichiometry(modelStoichiometry);
		}
		
	}

	public List<ModelStoichiometry> getAllModelStoichiometry() {
		return super.findAll();
	}

	public ModelStoichiometry getModelStoichiometry(Integer id) {
		return super.findById(id);
	}

	public void removeModelStoichiometry(ModelStoichiometry modelStoichiometry) {
		super.delete(modelStoichiometry);
		
	}

	public void removeModelStoichiometryList(List<ModelStoichiometry> modelStoichiometryList) {
		for (ModelStoichiometry modelStoichiometry: modelStoichiometryList) {
			this.removeModelStoichiometry(modelStoichiometry);
		}
		
	}

	public void updateModelStoichiometryList(List<ModelStoichiometry> modelStoichiometryList) {
		for (ModelStoichiometry modelStoichiometry: modelStoichiometryList) {
			this.update(modelStoichiometry);
		}
		
	}

	public void updateModelStoichiometry(ModelStoichiometry modelStoichiometry) {
		super.update(modelStoichiometry);
		
	}

}
