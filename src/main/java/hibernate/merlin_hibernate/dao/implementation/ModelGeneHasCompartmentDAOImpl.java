package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelGeneHasCompartment;
import hibernate.merlin_hibernate.dao.Interface.IModelGeneHasCompartmentDAO;


public class ModelGeneHasCompartmentDAOImpl extends GenericDaoImpl<ModelGeneHasCompartment> implements IModelGeneHasCompartmentDAO {

	public ModelGeneHasCompartmentDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelGeneHasCompartment.class);
		
	}

	public void addModelGeneHasCompartment(ModelGeneHasCompartment modelGeneHasCompartment) {
		super.save(modelGeneHasCompartment);
		
	}

	public void addModelGeneHasCompartmentList(List<ModelGeneHasCompartment> modelGeneHasCompartmentList) {
		for (ModelGeneHasCompartment modelGeneHasCompartment: modelGeneHasCompartmentList) {
			this.addModelGeneHasCompartment(modelGeneHasCompartment);
		}
		
	}

	public List<ModelGeneHasCompartment> getAllModelGeneHasCompartment() {
		return super.findAll();
	}

	public ModelGeneHasCompartment getModelGeneHasCompartment(Integer id) {
		return super.findById(id);
	}

	public void removeModelGeneHasCompartment(ModelGeneHasCompartment modelGeneHasCompartment) {
		super.delete(modelGeneHasCompartment);
		
	}

	public void removeModelGeneHasCompartmentList(List<ModelGeneHasCompartment> modelGeneHasCompartmentList) {
		for (ModelGeneHasCompartment modelGeneHasCompartment: modelGeneHasCompartmentList) {
			this.removeModelGeneHasCompartment(modelGeneHasCompartment);
		}
		
	}

	public void updateModelGeneHasCompartmentList(List<ModelGeneHasCompartment> modelGeneHasCompartmentList) {
		for (ModelGeneHasCompartment modelGeneHasCompartment: modelGeneHasCompartmentList) {
			this.update(modelGeneHasCompartment);
		}
		
	}

	public void updateModelGeneHasCompartment(ModelGeneHasCompartment modelGeneHasCompartment) {
		super.update(modelGeneHasCompartment);
		
	}

}
