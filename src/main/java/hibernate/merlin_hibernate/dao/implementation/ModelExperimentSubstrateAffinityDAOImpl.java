package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelExperimentSubstrateAffinity;
import hibernate.merlin_hibernate.dao.Interface.IModelExperimentSubstrateAffinityDAO;


public class ModelExperimentSubstrateAffinityDAOImpl extends GenericDaoImpl<ModelExperimentSubstrateAffinity> implements IModelExperimentSubstrateAffinityDAO {

	public ModelExperimentSubstrateAffinityDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelExperimentSubstrateAffinity.class);
		
	}

	public void addModelExperimentSubstrateAffinity(ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity) {
		super.save(modelExperimentSubstrateAffinity);
		
	}

	public void addEnzymesAnnotationEcnumberList(List<ModelExperimentSubstrateAffinity> modelExperimentSubstrateAffinityList) {
		for (ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity: modelExperimentSubstrateAffinityList) {
			this.addModelExperimentSubstrateAffinity(modelExperimentSubstrateAffinity);
		}
		
	}

	public List<ModelExperimentSubstrateAffinity> getAllModelExperimentSubstrateAffinity() {
		return super.findAll();
	}

	public ModelExperimentSubstrateAffinity getModelExperimentSubstrateAffinity(Integer id) {
		return super.findById(id);
	}

	public void removeModelExperimentSubstrateAffinity(ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity) {
		super.delete(modelExperimentSubstrateAffinity);
		
	}

	public void removeModelExperimentSubstrateAffinityList(List<ModelExperimentSubstrateAffinity> modelExperimentSubstrateAffinityList) {
		for (ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity: modelExperimentSubstrateAffinityList) {
			this.removeModelExperimentSubstrateAffinity(modelExperimentSubstrateAffinity);
		}
		
	}

	public void updateModelExperimentSubstrateAffinityList(List<ModelExperimentSubstrateAffinity> modelExperimentSubstrateAffinityList) {
		for (ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity: modelExperimentSubstrateAffinityList) {
			this.update(modelExperimentSubstrateAffinity);
		}
		
	}

	public void updateModelExperimentSubstrateAffinity(ModelExperimentSubstrateAffinity modelExperimentSubstrateAffinity) {
		super.update(modelExperimentSubstrateAffinity);
		
	}

}
