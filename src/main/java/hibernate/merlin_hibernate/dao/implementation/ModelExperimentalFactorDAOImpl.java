package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelExperimentalFactor;
import hibernate.merlin_hibernate.dao.Interface.IModelExperimentalFactorDAO;


public class ModelExperimentalFactorDAOImpl extends GenericDaoImpl<ModelExperimentalFactor> implements IModelExperimentalFactorDAO {

	public ModelExperimentalFactorDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelExperimentalFactor.class);
		
	}

	public void addModelExperimentalFactor(ModelExperimentalFactor modelExperimentalFactor) {
		super.save(modelExperimentalFactor);
		
	}

	public void addModelExperimentalFactorList(List<ModelExperimentalFactor> modelExperimentalFactorList) {
		for (ModelExperimentalFactor modelExperimentalFactor: modelExperimentalFactorList) {
			this.addModelExperimentalFactor(modelExperimentalFactor);
		}
		
	}

	public List<ModelExperimentalFactor> getAllModelExperimentalFactor() {
		return super.findAll();
	}

	public ModelExperimentalFactor getModelExperimentalFactor(Integer id) {
		return super.findById(id);
	}

	public void removeModelExperimentalFactor(ModelExperimentalFactor modelExperimentalFactor) {
		super.delete(modelExperimentalFactor);
		
	}

	public void removeModelExperimentalFactorList(List<ModelExperimentalFactor> modelExperimentalFactorList) {
		for (ModelExperimentalFactor modelExperimentalFactor: modelExperimentalFactorList) {
			this.removeModelExperimentalFactor(modelExperimentalFactor);
		}
		
	}

	public void updateModelExperimentalFactorList(List<ModelExperimentalFactor> modelExperimentalFactorList) {
		for (ModelExperimentalFactor modelExperimentalFactor: modelExperimentalFactorList) {
			this.update(modelExperimentalFactor);
		}
		
	}

	public void updateModelExperimentalFactor(ModelExperimentalFactor modelExperimentalFactor) {
		super.update(modelExperimentalFactor);
	}

}
