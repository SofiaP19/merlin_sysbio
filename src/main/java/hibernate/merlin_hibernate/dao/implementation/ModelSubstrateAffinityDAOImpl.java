package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelSubstrateAffinity;
import hibernate.merlin_hibernate.dao.Interface.IModelSubstrateAffinityDAO;

public class ModelSubstrateAffinityDAOImpl extends GenericDaoImpl<ModelSubstrateAffinity> implements IModelSubstrateAffinityDAO{

	public ModelSubstrateAffinityDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelSubstrateAffinity.class);
		
	}

	public void addModelSubstrateAffinity(ModelSubstrateAffinity modelSubstrateAffinity) {
		super.save(modelSubstrateAffinity);
		
	}

	public void addModelSubstrateAffinityList(List<ModelSubstrateAffinity> modelSubstrateAffinityList) {
		for (ModelSubstrateAffinity modelSubstrateAffinity: modelSubstrateAffinityList) {
			this.addModelSubstrateAffinity(modelSubstrateAffinity);
		}
		
	}

	public List<ModelSubstrateAffinity> getAllModelSubstrateAffinity() {
		return super.findAll();
	}

	public ModelSubstrateAffinity getModelSubstrateAffinity(Integer id) {
		return super.findById(id);
	}

	public void removeModelSubstrateAffinity(ModelSubstrateAffinity modelSubstrateAffinity) {
		super.delete(modelSubstrateAffinity);
		
	}

	public void removeModelSubstrateAffinityList(List<ModelSubstrateAffinity> modelSubstrateAffinityList) {
		for (ModelSubstrateAffinity modelSubstrateAffinity: modelSubstrateAffinityList) {
			this.removeModelSubstrateAffinity(modelSubstrateAffinity);
		}
		
	}

	public void updateModelSubstrateAffinityList(List<ModelSubstrateAffinity> modelSubstrateAffinityList) {
		for (ModelSubstrateAffinity modelSubstrateAffinity: modelSubstrateAffinityList) {
			this.update(modelSubstrateAffinity);
		}
		
	}

	public void updateModelSubstrateAffinity(ModelSubstrateAffinity modelSubstrateAffinity) {
		super.update(modelSubstrateAffinity);
		
	}

}
