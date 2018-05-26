package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.ModelExperimentInhibitor;
import hibernate.merlin_hibernate.dao.Interface.IModelExperimentInhibitorDAO;


public class ModelExperimentInhibitorDAOImpl extends GenericDaoImpl<ModelExperimentInhibitor> implements IModelExperimentInhibitorDAO {

	public ModelExperimentInhibitorDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelExperimentInhibitor.class);
		
	}

	public void addModelExperimentInhibitor(ModelExperimentInhibitor modelExperimentInhibitor) {
		super.save(modelExperimentInhibitor);
		
	}

	public void addModelExperimentInhibitorList(List<ModelExperimentInhibitor> modelExperimentInhibitorList) {
		for (ModelExperimentInhibitor modelExperimentInhibitor: modelExperimentInhibitorList) {
			this.addModelExperimentInhibitor(modelExperimentInhibitor);
		}
		
	}

	public List<ModelExperimentInhibitor> getAllModelExperimentInhibitor() {
		return super.findAll();
	}

	public ModelExperimentInhibitor getModelExperimentInhibitor(Integer id) {
		return super.findById(id);
	}

	public void removeModelExperimentInhibitor(ModelExperimentInhibitor modelExperimentInhibitor) {
		super.delete(modelExperimentInhibitor);
		
	}

	public void removeModelExperimentInhibitorList(List<ModelExperimentInhibitor> modelExperimentInhibitorList) {
		for (ModelExperimentInhibitor modelExperimentInhibitor: modelExperimentInhibitorList) {
			this.removeModelExperimentInhibitor(modelExperimentInhibitor);
		}
		
	}

	public void updateModelExperimentInhibitorList(List<ModelExperimentInhibitor> modelExperimentInhibitorList) {
		for (ModelExperimentInhibitor modelExperimentInhibitor: modelExperimentInhibitorList) {
			this.update(modelExperimentInhibitor);
		}
		
		
	}

	public void updateModelExperimentInhibitor(ModelExperimentInhibitor modelExperimentInhibitor) {
		super.update(modelExperimentInhibitor);
		
	}

}
