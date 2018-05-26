package hibernate.merlin_hibernate.dao.implementation;

import java.util.List;

import org.hibernate.SessionFactory;

import hibernate.merlin_hibernate.entities.ModelAliases;
import hibernate.merlin_hibernate.dao.Interface.IModelAliasesDAO;


public class ModelAliasesDAOImpl extends GenericDaoImpl<ModelAliases> implements IModelAliasesDAO {

	public ModelAliasesDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory, ModelAliases.class);
		
	}

	public void addModelAliases(ModelAliases modelAliases) {
		super.save(modelAliases);
		
	}

	public void addModelAliasesList(List<ModelAliases> modelAliasesList) {
		for (ModelAliases modelAliases: modelAliasesList) {
			this.addModelAliases(modelAliases);
		}
		
	}

	public List<ModelAliases> getAllModelAliases() {
		return super.findAll();
	}

	public ModelAliases getModelAliases(Integer id) {
		return super.findById(id);
	}

	public void removeModelAliases(ModelAliases modelAliases) {
		super.delete(modelAliases);
		
	}

	public void removeModelAliasesList(List<ModelAliases> modelAliasesList) {
		for (ModelAliases modelAliases: modelAliasesList) {
			this.removeModelAliases(modelAliases);
		}
		
	}

	public void updateModelAliasesList(List<ModelAliases> modelAliasesList) {
		for (ModelAliases modelAliases: modelAliasesList) {
			this.update(modelAliases);
		}
		
	}

	public void updateModelAliases(ModelAliases modelAliases) {
		super.update(modelAliases);
		
	}

}
