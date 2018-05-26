package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelEntityisfrom;
import hibernate.merlin_hibernate.dao.Interface.IModelEntityisfromDAO;


public class ModelEntityisfromDAOImpl extends GenericDaoImpl<ModelEntityisfrom> implements IModelEntityisfromDAO{

	public ModelEntityisfromDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelEntityisfrom.class);
		
	}

	public void addModelEntityisfrom(ModelEntityisfrom modelEntityisfrom) {
		super.save(modelEntityisfrom);
		
	}

	public void addModelEntityisfromList(List<ModelEntityisfrom> modelEntityisfromList) {
		for (ModelEntityisfrom modelEntityisfrom: modelEntityisfromList) {
			this.addModelEntityisfrom(modelEntityisfrom);
		}
		
	}

	public List<ModelEntityisfrom> getAllModelEntityisfrom() {
		return super.findAll();
	}

	public ModelEntityisfrom getModelEntityisfrom(Integer id) {
		return super.findById(id);
	}

	public void removeModelEntityisfrom(ModelEntityisfrom modelEntityisfrom) {
		super.delete(modelEntityisfrom);
		
	}

	public void removeModelEntityisfromList(List<ModelEntityisfrom> modelEntityisfromList) {
		for (ModelEntityisfrom modelEntityisfrom: modelEntityisfromList) {
			this.removeModelEntityisfrom(modelEntityisfrom);
		}
		
	}

	public void updateModelEntityisfromist(List<ModelEntityisfrom> modelEntityisfromList) {
		for (ModelEntityisfrom modelEntityisfrom: modelEntityisfromList) {
			this.update(modelEntityisfrom);
		}
		
	}

	public void updateModelEntityisfrom(ModelEntityisfrom ModelEntityisfrom) {
		super.update(ModelEntityisfrom);
		
	}

}
