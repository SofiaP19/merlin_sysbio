package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelEnzymaticAlternativeCofactor;
import hibernate.merlin_hibernate.dao.Interface.IModelEnzymaticAlternativeCofactorDAO;

public class ModelEnzymaticAlternativeCofactorDAOImpl extends GenericDaoImpl<ModelEnzymaticAlternativeCofactor> implements IModelEnzymaticAlternativeCofactorDAO{

	public ModelEnzymaticAlternativeCofactorDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelEnzymaticAlternativeCofactor.class);
		
	}

	public void addModelEnzymaticAlternativeCofactor(ModelEnzymaticAlternativeCofactor ModelEnzymaticAlternativeCofactor) {
		super.save(ModelEnzymaticAlternativeCofactor);
		
	}

	public void addModelEnzymaticAlternativeCofactorList(List<ModelEnzymaticAlternativeCofactor> ModelEnzymaticAlternativeCofactorList) {
		for (ModelEnzymaticAlternativeCofactor ModelEnzymaticAlternativeCofactor: ModelEnzymaticAlternativeCofactorList) {
			this.addModelEnzymaticAlternativeCofactor(ModelEnzymaticAlternativeCofactor);
		}
		
	}

	public List<ModelEnzymaticAlternativeCofactor> getAllModelEnzymaticAlternativeCofactor() {
		return super.findAll();
	}
	

	public ModelEnzymaticAlternativeCofactor getModelEnzymaticAlternativeCofactor(Integer id) {
		return super.findById(id);
	}

	public void removeModelEnzymaticAlternativeCofactor(ModelEnzymaticAlternativeCofactor ModelEnzymaticAlternativeCofactor) {
		super.delete(ModelEnzymaticAlternativeCofactor);
		
	}

	public void removeModelEnzymaticAlternativeCofactorList(List<ModelEnzymaticAlternativeCofactor> ModelEnzymaticAlternativeCofactorList) {
		for (ModelEnzymaticAlternativeCofactor ModelEnzymaticAlternativeCofactor: ModelEnzymaticAlternativeCofactorList) {
			this.removeModelEnzymaticAlternativeCofactor(ModelEnzymaticAlternativeCofactor);
		}	
		
	}

	public void updateModelEnzymaticAlternativeCofactorList(List<ModelEnzymaticAlternativeCofactor> ModelEnzymaticAlternativeCofactorList) {
		for (ModelEnzymaticAlternativeCofactor ModelEnzymaticAlternativeCofactor: ModelEnzymaticAlternativeCofactorList) {
			this.update(ModelEnzymaticAlternativeCofactor);
		}
		
	}

	public void updateModelEnzymaticAlternativeCofactor(ModelEnzymaticAlternativeCofactor ModelEnzymaticAlternativeCofactor) {
		super.update(ModelEnzymaticAlternativeCofactor);
		
	}

}

