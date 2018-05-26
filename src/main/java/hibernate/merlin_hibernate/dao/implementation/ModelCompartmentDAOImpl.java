package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelCompartment;
import hibernate.merlin_hibernate.dao.Interface.IModelCompartmentDAO;


public class ModelCompartmentDAOImpl extends GenericDaoImpl<ModelCompartment> implements IModelCompartmentDAO {

	public ModelCompartmentDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelCompartment.class);
		
	}

	public void addModelCompartment(ModelCompartment modelCompartment) {
		super.save(modelCompartment);
		
	}

	public void addModelCompartmentList(List<ModelCompartment> modelCompartmentList) {
		for (ModelCompartment modelCompartment: modelCompartmentList) {
			this.addModelCompartment(modelCompartment);
		}
		
	}

	public List<ModelCompartment> getAllModelCompartment() {
		return super.findAll();
	}

	public ModelCompartment getModelCompartment(Integer id) {
		return super.findById(id);
	}

	public void removeModelCompartment(ModelCompartment modelCompartment) {
		super.delete(modelCompartment);
		
	}

	public void removeModelCompartmentList(List<ModelCompartment> modelCompartmentList) {
		for (ModelCompartment modelCompartment: modelCompartmentList) {
			this.removeModelCompartment(modelCompartment);
		}
		
	}

	public void updateModelCompartmentList(List<ModelCompartment> modelCompartmentList) {
		for (ModelCompartment modelCompartment: modelCompartmentList) {
			this.update(modelCompartment);
		}
		
	}

	public void updateModelCompartment(ModelCompartment modelCompartment) {
		super.update(modelCompartment);
		
	}

}
