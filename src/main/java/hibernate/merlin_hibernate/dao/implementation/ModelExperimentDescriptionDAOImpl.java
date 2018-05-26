package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelExperimentDescription;
import hibernate.merlin_hibernate.dao.Interface.IModelExperimentDescriptionDAO;


public class ModelExperimentDescriptionDAOImpl extends GenericDaoImpl<ModelExperimentDescription> implements IModelExperimentDescriptionDAO {

	public ModelExperimentDescriptionDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelExperimentDescription.class);
		
	}

	public void addModelExperimentDescription(ModelExperimentDescription modelExperimentDescription) {
		super.save(modelExperimentDescription);
		
	}

	public void addModelExperimentDescriptionList(List<ModelExperimentDescription> modelExperimentDescriptionList) {
		for (ModelExperimentDescription modelExperimentDescription: modelExperimentDescriptionList) {
			this.addModelExperimentDescription(modelExperimentDescription);
		}
		
	}

	public List<ModelExperimentDescription> getAllModelExperimentDescription() {
		return super.findAll();
	}

	public ModelExperimentDescription getModelExperimentDescription(Integer id) {
		return super.findById(id);
	}

	public void removeModelExperimentDescription(ModelExperimentDescription modelExperimentDescription) {
		super.delete(modelExperimentDescription);
		
	}

	public void removeModelExperimentDescriptionList(List<ModelExperimentDescription> modelExperimentDescriptionList) {
		for (ModelExperimentDescription modelExperimentDescription: modelExperimentDescriptionList) {
			this.removeModelExperimentDescription(modelExperimentDescription);
		}
		
	}

	public void updateModelExperimentDescriptionList(List<ModelExperimentDescription> modelExperimentDescriptionList) {
		for (ModelExperimentDescription modelExperimentDescription: modelExperimentDescriptionList) {
			this.update(modelExperimentDescription);
		}
		
	}

	public void updateModelExperimentDescription(ModelExperimentDescription modelExperimentDescription) {
		super.update(modelExperimentDescription);
		
	}

}
