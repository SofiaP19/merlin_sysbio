package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelRiFunction;
import hibernate.merlin_hibernate.dao.Interface.IModelRiFunctionDAO;

public class ModelRiFunctionDAOImpl extends GenericDaoImpl<ModelRiFunction> implements IModelRiFunctionDAO {

	public ModelRiFunctionDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelRiFunction.class);
	
	}

	public void addModelRiFunction(ModelRiFunction modelRiFunction) {
		super.save(modelRiFunction);
		
	}

	public void addModelRiFunctionList(List<ModelRiFunction> modelRiFunctionList) {
		for (ModelRiFunction modelRiFunction: modelRiFunctionList) {
			this.addModelRiFunction(modelRiFunction);
		}
		
	}

	public List<ModelRiFunction> getAllModelRiFunction() {
		return super.findAll();
	}

	public ModelRiFunction getModelRiFunction(Integer id) {
		return super.findById(id);
	}

	public void removeModelRiFunction(ModelRiFunction modelRiFunction) {
		super.delete(modelRiFunction);
		
	}

	public void removeModelRiFunctionList(List<ModelRiFunction> modelRiFunctionList) {
		for (ModelRiFunction modelRiFunction: modelRiFunctionList) {
			this.removeModelRiFunction(modelRiFunction);
		}
		
	}

	public void updateModelRiFunctionList(List<ModelRiFunction> modelRiFunctionList) {
		for (ModelRiFunction modelRiFunction: modelRiFunctionList) {
			this.update(modelRiFunction);
		}
		
	}

	public void updateModelRiFunction(ModelRiFunction modelRiFunction) {
		super.update(modelRiFunction);
		
	}

}
