package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelFeature;
import hibernate.merlin_hibernate.dao.Interface.IModelFeatureDAO;


public class ModelFeatureDAOImpl extends GenericDaoImpl<ModelFeature> implements IModelFeatureDAO {

	public ModelFeatureDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelFeature.class);
		
	}

	public void addModelFeature(ModelFeature modelFeature) {
		super.save(modelFeature);
		
	}

	public void addModelFeatureList(List<ModelFeature> modelFeatureList) {
		for (ModelFeature modelFeature: modelFeatureList) {
			this.addModelFeature(modelFeature);
		}
		
	}

	public List<ModelFeature> getAllModelFeature() {
		return super.findAll();
	}

	public ModelFeature getModelFeature(Integer id) {
		return super.findById(id);
	}

	public void removeModelFeature(ModelFeature modelFeature) {
		super.delete(modelFeature);
		
	}

	public void removeModelFeatureList(List<ModelFeature> modelFeatureList) {
		for (ModelFeature modelFeature: modelFeatureList) {
			this.removeModelFeature(modelFeature);
		}
		
	}

	public void updateModelFeatureList(List<ModelFeature> modelFeatureList) {
		for (ModelFeature modelFeature: modelFeatureList) {
			this.update(modelFeature);
		}
		
	}

	public void updateModelFeature(ModelFeature modelFeature) {
		super.update(modelFeature);
		
	}

}
