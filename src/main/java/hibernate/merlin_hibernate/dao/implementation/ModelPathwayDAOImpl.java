package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelPathway;
import hibernate.merlin_hibernate.dao.Interface.IModelPathwayDAO;

public class ModelPathwayDAOImpl extends GenericDaoImpl<ModelPathway> implements IModelPathwayDAO{

	public ModelPathwayDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelPathway.class);
		
	}

	public void addModelPathway(ModelPathway modelPathway) {
		super.save(modelPathway);
		
	}

	public void addModelPathwayList(List<ModelPathway> modelPathwayList) {
		for (ModelPathway modelPathway: modelPathwayList) {
			this.addModelPathway(modelPathway);
		}
		
	}

	public List<ModelPathway> getAllModelPathway() {
		return super.findAll();
	}

	public ModelPathway getModelPathway(Integer id) {
		return super.findById(id);
	}

	public void removeModelPathway(ModelPathway modelPathway) {
		super.delete(modelPathway);
		
	}

	public void removeModelPathwayList(List<ModelPathway> modelPathwayList) {
		for (ModelPathway modelPathway: modelPathwayList) {
			this.removeModelPathway(modelPathway);
		}
		
	}

	public void updateModelPathwayList(List<ModelPathway> modelPathwayList) {
		for (ModelPathway modelPathway: modelPathwayList) {
			this.update(modelPathway);
		}
	}

	public void updateModelPathway(ModelPathway modelPathway) {
		super.update(modelPathway);
		
		
	}

}
