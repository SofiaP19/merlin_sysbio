package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import hibernate.merlin_hibernate.entities.ModelDblinks;
import hibernate.merlin_hibernate.dao.Interface.IModelDblinksDAO;


public abstract class ModelDblinksDAOImpl extends GenericDaoImpl<ModelDblinks> implements IModelDblinksDAO{

	public ModelDblinksDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelDblinks.class);
		
	}
	public void addModelDblinks(ModelDblinks modelDblinks) {
		super.save(modelDblinks);
		
	}

	public void addModelDblinksList(List<ModelDblinks> modelDblinksList) {
		for (ModelDblinks modelDblinks: modelDblinksList) {
			this.addModelDblinks(modelDblinks);
		}
		
	}

	public List<ModelDblinks> getAllModelDblinks() {
		return super.findAll();
	}

	public ModelDblinks getModelDblinks(Integer id) {
		return super.findById(id);
	}

	public void removeModelDblinks(ModelDblinks modelDblinks) {
		super.delete(modelDblinks);
		
	}

	public void removeModelDblinksList(List<ModelDblinks> modelDblinksList) {
		for (ModelDblinks modelDblinks: modelDblinksList) {
			this.removeModelDblinks(modelDblinks);
		}	
		
	}

	public void updateModelDblinksList(List<ModelDblinks> modelDblinksList) {
		for (ModelDblinks modelDblinks: modelDblinksList) {
			this.update(modelDblinks);
		}
		
	}

	public void updateModelDblinks(ModelDblinks modelDblinks) {
		super.update(modelDblinks);
		
	}

}


