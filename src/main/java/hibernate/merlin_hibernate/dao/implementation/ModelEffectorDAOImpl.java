package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelEffector;
import hibernate.merlin_hibernate.dao.Interface.IModelEffectorDAO;


public class ModelEffectorDAOImpl extends GenericDaoImpl<ModelEffector> implements IModelEffectorDAO {

	public ModelEffectorDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelEffector.class);
		
	}

	public void addModelEffector(ModelEffector modelEffector) {
		super.save(modelEffector);
		
	}

	public void addModelEffectorList(List<ModelEffector> modelEffectorList) {
		for (ModelEffector modelEffector: modelEffectorList) {
			this.addModelEffector(modelEffector);
		}
		
	}

	public List<ModelEffector> getAllModelEffector() {
		return super.findAll();
	}

	public ModelEffector getModelEffector(Integer id) {
		return super.findById(id);
	}

	public void removeModelEffector(ModelEffector modelEffector) {
		super.delete(modelEffector);
		
	}

	public void removeModelEffectorList(List<ModelEffector> modelEffectorList) {
		for (ModelEffector modelEffector: modelEffectorList) {
			this.removeModelEffector(modelEffector);
		}
		
	}

	public void updateModelEffectorList(List<ModelEffector> modelEffectorList) {
		for (ModelEffector modelEffector: modelEffectorList) {
			this.update(modelEffector);
		}
		
	}

	public void updateModelEffector(ModelEffector modelEffector) {
		super.update(modelEffector);
		
	}

}
