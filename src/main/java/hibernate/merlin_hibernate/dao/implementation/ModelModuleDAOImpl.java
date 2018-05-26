package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelModule;
import hibernate.merlin_hibernate.dao.Interface.IModelModuleDAO;

public class ModelModuleDAOImpl extends GenericDaoImpl<ModelModule> implements IModelModuleDAO{

	public ModelModuleDAOImpl(SessionFactory sessionFactory, Class<ModelModule> klass) {
		super(sessionFactory, ModelModule.class);
		
	}

	public void addModelModule(ModelModule modelModule) {
		super.save(modelModule);
		
	}

	public void addModelModuleList(List<ModelModule> modelModuleList) {
		for (ModelModule modelModule: modelModuleList) {
			this.addModelModule(modelModule);
		}
		
	}

	public List<ModelModule> getAllModelModule() {
		return super.findAll();
	}

	public ModelModule getModelModule(Integer id) {
		return super.findById(id);
	}

	public void removeModelModule(ModelModule modelModule) {
		super.delete(modelModule);
		
	}

	public void removeModelModuleList(List<ModelModule> modelModuleList) {
		for (ModelModule modelModule: modelModuleList) {
			this.removeModelModule(modelModule);
		}
		
	}

	public void updateModelModuleList(List<ModelModule> modelModuleList) {
		for (ModelModule modelModule: modelModuleList) {
			this.update(modelModule);
		}
		
	}

	public void updateModelModule(ModelModule modelModule) {
		super.update(modelModule);
		
	}

}
