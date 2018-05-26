package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;


import hibernate.merlin_hibernate.entities.ModelSequenceFeature;
import hibernate.merlin_hibernate.dao.Interface.IModelSequenceFeatureDAO;


public class ModelSequenceFeatureDAOImpl extends GenericDaoImpl<ModelSequenceFeature> implements IModelSequenceFeatureDAO{

	public ModelSequenceFeatureDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelSequenceFeature.class);
		
	}

	public void addModelSequenceFeature(ModelSequenceFeature modelSequenceFeature) {
		super.save(modelSequenceFeature);
		
	}

	public void addModelSequenceFeatureList(List<ModelSequenceFeature> modelSequenceFeatureList) {
		for (ModelSequenceFeature modelSequenceFeature: modelSequenceFeatureList) {
			this.addModelSequenceFeature(modelSequenceFeature);
		}
	}	


	public List<ModelSequenceFeature> getAllModelSequenceFeature() {
		return super.findAll();
	}

	public ModelSequenceFeature getModelSequenceFeature(Integer id) {
		return super.findById(id);
		
		}
	

	public void removeModelSequenceFeature(ModelSequenceFeature modelSequenceFeature) {
		super.delete(modelSequenceFeature);
	}
		

	public void removeModelSequenceFeatureList(List<ModelSequenceFeature> modelSequenceFeatureList) {
		for (ModelSequenceFeature modelSequenceFeature: modelSequenceFeatureList) {
			this.removeModelSequenceFeature(modelSequenceFeature);
		}
		
		
	}

	public void updateModelSequenceFeatureList(List<ModelSequenceFeature> modelSequenceFeatureList) {
		for (ModelSequenceFeature modelSequenceFeature: modelSequenceFeatureList) {
			this.update(modelSequenceFeature);
		}
	}

	public void updateModelSequenceFeature(ModelSequenceFeature modelSequenceFeature) {
		super.update(modelSequenceFeature);
		
		
	}

}
