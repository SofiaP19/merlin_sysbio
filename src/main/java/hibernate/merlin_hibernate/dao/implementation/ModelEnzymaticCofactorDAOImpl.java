package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.ModelEnzymaticCofactor;
import hibernate.merlin_hibernate.dao.Interface.IModelEnzymaticCofactorDAO;


public class ModelEnzymaticCofactorDAOImpl extends GenericDaoImpl<ModelEnzymaticCofactor> implements IModelEnzymaticCofactorDAO {

	public ModelEnzymaticCofactorDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelEnzymaticCofactor.class);
		
	}

	public void addModelEnzymaticCofactor(ModelEnzymaticCofactor modelEnzymaticCofactor) {
		super.save(modelEnzymaticCofactor);
		
	}

	public void addModelEnzymaticCofactorList(List<ModelEnzymaticCofactor> modelEnzymaticCofactorList) {
		for (ModelEnzymaticCofactor modelEnzymaticCofactor: modelEnzymaticCofactorList) {
			this.addModelEnzymaticCofactor(modelEnzymaticCofactor);
		}
		
	}

	public List<ModelEnzymaticCofactor> getAllModelEnzymaticCofactor() {
		return super.findAll();
	}

	public ModelEnzymaticCofactor getModelEnzymaticCofactor(Integer id) {
		return super.findById(id);
	}

	public void removeModelEnzymaticCofactor(ModelEnzymaticCofactor modelEnzymaticCofactor) {
		super.delete(modelEnzymaticCofactor);
		
	}

	public void removeModelEnzymaticCofactorList(List<ModelEnzymaticCofactor> modelEnzymaticCofactorList) {
		for (ModelEnzymaticCofactor modelEnzymaticCofactor: modelEnzymaticCofactorList) {
			this.removeModelEnzymaticCofactor(modelEnzymaticCofactor);
		}
		
	}

	public void updateModelEnzymaticCofactorList(List<ModelEnzymaticCofactor> modelEnzymaticCofactorList) {
		for (ModelEnzymaticCofactor modelEnzymaticCofactor: modelEnzymaticCofactorList) {
			this.update(modelEnzymaticCofactor);
		}
		
	}

	public void updateModelEnzymaticCofactor(ModelEnzymaticCofactor modelEnzymaticCofactor) {
		super.update(modelEnzymaticCofactor);
		
	}

}
